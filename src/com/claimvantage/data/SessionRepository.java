package com.claimvantage.data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;

import com.claimvantage.model.Session;

public class SessionRepository {
	
	private static SessionRepository instance = null;
	private List<Session> sessions;
	private Boolean corePackageCreated;
	private Session corePackage;
	
	public SessionRepository() {
		sessions = new ArrayList<Session>();
		this.corePackageCreated = false;
	}

	public static SessionRepository instance() {
		if (instance == null) {
			instance = new SessionRepository();
		}
		return instance;
	}
	
	public void addSession(Session session) {
		UUID randomId = UUID.randomUUID();
		session.setId(randomId);
		sessions.add(session);
	}
	
	public List<Session> getSessions() {
		return sessions;
	}

	public void setSessions(List<Session> sessions) {
		// TODO add unique id to the session
		this.sessions = sessions;
	}
	
	public void getSession(List<Session> sessions) {
		this.sessions = sessions;
	}

	public Session getSessionsById(String sessionId) {
		for (Session s : sessions) {
			if (s.getId().toString().contains(sessionId)) {
				return s;
			}
		}
		return null;
	}
	
	public Boolean isCorePackageCreated() {
		return corePackageCreated;
	}

	public void hasCorePackageCreated(Boolean corePackageCreated) {
		this.corePackageCreated = corePackageCreated;
	}

	public Session getCorePackage() {
		return corePackage;
	}

	public void setCorePackage(Session corePackage) {
		this.corePackage = corePackage;
	}
}
