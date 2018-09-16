package com.codingdojo.mvc.services;

import java.util.List;
import java.util.Optional;

import com.codingdojo.mvc.models.Driver;
import com.codingdojo.mvc.repositories.DriverRepository;
import com.codingdojo.mvc.repositories.LicenseRepository;

public class DriverService {
	
	private final DriverRepository driverRepository;
	private final LicenseRepository licenseRepository;
	
	public DriverService(DriverRepository driverRepository, LicenseRepository licenseRepository) {
		this.driverRepository = driverRepository;
		this.licenseRepository = licenseRepository;
	}
	public List<Driver> allDriver(){
		return driverRepository.findAll();
	}
	
	public Driver createDriver(Driver d) {
		return driverRepository.save(d);
	}
	
	public Driver findDriver(Long id) {
		Optional<Driver> optionalDriver = driverRepository.findById(id);
		if(optionalDriver.isPresent()) {
			return optionalDriver.get();
		}
		else {
			return null;
		}
	}

}
