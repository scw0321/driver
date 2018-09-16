package com.codingdojo.mvc.repositories;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.mvc.models.License;


@Repository
public interface LicenseRepository extends CrudRepository<License, Long>{
	
	List<License> getLicenseByDriverId(Long id);
	
	

}
