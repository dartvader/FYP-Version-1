package com.claimvantage.data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;

import com.claimvantage.model.Package;

public class PackageRepository {
	
	private static PackageRepository instance = null;
	private List<Package> packages;
	private Boolean corePackageCreated;
	private Package corePackage;
	
	public PackageRepository() {
		packages = new ArrayList<Package>();
		this.corePackageCreated = false;
	}

	public static PackageRepository instance() {
		if (instance == null) {
			instance = new PackageRepository();
		}
		return instance;
	}
	
	public void addPackage(Package newPackage) {
		UUID randomId = UUID.randomUUID();
		newPackage.setId(randomId);
		packages.add(newPackage);
	}
	
	public List<Package> getPackages() {
		return packages;
	}

	public void setPackages(List<Package> packages) {
		this.packages = packages;
	}
	
	public void getPackage(List<Package> packages) {
		this.packages = packages;
	}

	public Package getPackagesById(String packageId) {
		for (Package p : packages) {
			if (p.getId().toString().contains(packageId)) {
				return p;
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

	public Package getCorePackage() {
		return corePackage;
	}

	public void setCorePackage(Package corePackage) {
		this.corePackage = corePackage;
	}
}
