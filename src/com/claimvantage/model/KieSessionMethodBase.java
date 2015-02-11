package com.claimvantage.model;

import org.drools.compiler.builder.impl.KnowledgeBuilderConfigurationImpl;
import org.drools.compiler.kie.builder.impl.InternalKieModule;
import org.drools.compiler.lang.descr.PackageDescr;
import org.drools.core.common.InternalAgenda;
import org.drools.core.impl.InternalKnowledgeBase;
import org.kie.api.KieBaseConfiguration;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.builder.ReleaseId;
import org.kie.api.io.Resource;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.Environment;
import org.kie.api.runtime.KieSessionConfiguration;
import org.kie.api.runtime.conf.KieSessionOption;
import org.kie.internal.KnowledgeBase;
import org.kie.internal.KnowledgeBaseFactory;
import org.kie.internal.builder.KnowledgeBuilder;
import org.kie.internal.builder.KnowledgeBuilderConfiguration;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.builder.conf.RuleEngineOption;
import org.kie.internal.definition.KnowledgePackage;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.runtime.StatefulKnowledgeSession;
import org.kie.internal.runtime.StatelessKnowledgeSession;

import java.util.Collection;
import java.util.List;

/**
 * This contains many Create Session Methods,
 * TODO Refine and remove classes not needed
 */
public class KieSessionMethodBase {
	public static RuleEngineOption phreak = RuleEngineOption.PHREAK;

	protected StatefulKnowledgeSession createKnowledgeSession(KnowledgeBase kbase) {
		return kbase.newStatefulKnowledgeSession();
	}

	protected StatefulKnowledgeSession createKnowledgeSession(KnowledgeBase kbase, KieSessionOption option) {
		KieSessionConfiguration ksconf = KnowledgeBaseFactory.newKnowledgeSessionConfiguration();
		ksconf.setOption(option);
		return kbase.newStatefulKnowledgeSession(ksconf, null);
	}

	protected StatefulKnowledgeSession createKnowledgeSession(KnowledgeBase kbase, KieSessionConfiguration ksconf) {
		return kbase.newStatefulKnowledgeSession(ksconf, null);
	}

	protected StatefulKnowledgeSession createKnowledgeSession(KnowledgeBase kbase, KieSessionConfiguration ksconf, Environment env) {
		return kbase.newStatefulKnowledgeSession(ksconf, env);
	}

	protected StatelessKnowledgeSession createStatelessKnowledgeSession(KnowledgeBase kbase) {
		return kbase.newStatelessKnowledgeSession();
	}

	protected KnowledgeBase loadKnowledgeBaseFromString(String... drlContentStrings) {
		return loadKnowledgeBaseFromString(null, null, phreak,
				drlContentStrings);
	}

	protected KnowledgeBase loadKnowledgeBaseFromString(RuleEngineOption phreak, String... drlContentStrings) {
		return loadKnowledgeBaseFromString(null, null, phreak,
				drlContentStrings);
	}

	protected KnowledgeBase loadKnowledgeBaseFromString(KnowledgeBuilderConfiguration config, String... drlContentStrings) {
		return loadKnowledgeBaseFromString(config, null, phreak,
				drlContentStrings);
	}

	protected KnowledgeBase loadKnowledgeBaseFromString(
			KieBaseConfiguration kBaseConfig, String... drlContentStrings) {
		return loadKnowledgeBaseFromString(null, kBaseConfig, phreak,
				drlContentStrings);
	}

	protected KnowledgeBase loadKnowledgeBaseFromString( KnowledgeBuilderConfiguration config, KieBaseConfiguration kBaseConfig, RuleEngineOption phreak, String... drlContentStrings) {
		KnowledgeBuilder kbuilder = config == null ? KnowledgeBuilderFactory.newKnowledgeBuilder() : KnowledgeBuilderFactory.newKnowledgeBuilder(config);
		for (String drlContentString : drlContentStrings) {
			kbuilder.add(ResourceFactory.newByteArrayResource(drlContentString
					.getBytes()), ResourceType.DRL);
		}

		if (kbuilder.hasErrors()) {
			//fail(kbuilder.getErrors().toString());
			System.out.println("kbuilder errors " + kbuilder.getErrors().toString());
		}
		if (kBaseConfig == null) {
			kBaseConfig = KnowledgeBaseFactory.newKnowledgeBaseConfiguration();
		}
		kBaseConfig.setOption(phreak);
		KnowledgeBase kbase = kBaseConfig == null ? KnowledgeBaseFactory.newKnowledgeBase() : KnowledgeBaseFactory.newKnowledgeBase(kBaseConfig);
		kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
		return kbase;
	}

	public Collection<KnowledgePackage> loadKnowledgePackagesFromString(List<Rule> rules) {
		return loadKnowledgePackagesFromString(null, rules);
	}

	public Collection<KnowledgePackage> loadKnowledgePackagesFromString(KnowledgeBuilderConfiguration kbuilderConf, List<Rule> rules) {
		if (kbuilderConf == null) {
			kbuilderConf = KnowledgeBuilderFactory.newKnowledgeBuilderConfiguration();
		}
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder(kbuilderConf);
		for (Rule r : rules) {
			String rule = r.getScript().toString();
			kbuilder.add(ResourceFactory.newByteArrayResource(rule.getBytes()),ResourceType.DRL);
		}
		if (kbuilder.hasErrors()) {
			System.out.println(kbuilder.getErrors().toString());
		}
		Collection<KnowledgePackage> knowledgePackages = kbuilder.getKnowledgePackages();
		return knowledgePackages;
	}

	protected InternalAgenda getInternalAgenda(StatefulKnowledgeSession session) {
		return (InternalAgenda) session.getAgenda();
	}
}
