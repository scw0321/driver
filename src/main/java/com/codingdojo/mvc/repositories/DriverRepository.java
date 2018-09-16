package com.codingdojo.mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.mvc.models.Driver;


@Repository
public interface DriverRepository extends CrudRepository<Driver, Long>{

	List<Driver> findAll();	
	
}
