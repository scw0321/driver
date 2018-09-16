package com.codingdojo.mvc.services;


import org.springframework.stereotype.Service;

import com.codingdojo.mvc.models.License;
import com.codingdojo.mvc.repositories.LicenseRepository;

@Service
public class LicenseService {
	
private final LicenseRepository licenseRepository;
	
	public LicenseService (LicenseRepository licenseRepository) {
		
		this.licenseRepository = licenseRepository;
	}
	
	public License createLicense(License l) {
		return licenseRepository.save(l);
	}
		

}
