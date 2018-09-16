package com.codingdojo.mvc.controllers;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.mvc.models.Driver;
import com.codingdojo.mvc.models.License;
import com.codingdojo.mvc.services.DriverService;
import com.codingdojo.mvc.services.LicenseService;


@Controller
public class DriverController {

//	private final DriverService driverService;
	
	
//	public DriverController(DriverService driverService) {
//		
//		this.driverService = driverService;
//		
//	}
	
	@RequestMapping("/driver/new")
	public String newDriver(@ModelAttribute ("driver") Driver driver) {
		return "drivers/driver.jsp";
	}
	
	@RequestMapping(value ="/driver/new", method=RequestMethod.POST)
	public String createD(@Valid @ModelAttribute("driver") Driver d, BindingResult result) {
		if (result.hasErrors()) {
            return "drivers/driver.jsp";
        } else {
//            driverService.createDriver(d);
            return "redirect:/license/new";
        }

	}
//	@RequestMapping("/license/new")
//	public String newLicense(@ModelAttribute ("license") License license) {
//		return "drivers/license.jsp";
//	}
//	
//	@RequestMapping(value = "/license/new", method=RequestMethod.POST)
//	public String createL(@Valid @ModelAttribute("license") License l, BindingResult result) {
//		if (result.hasErrors()) {
//            return "drivers/license.jsp";
//        } else {
//            licenseService.createLicense(l);
//            
//            return "drivers/index.jsp";
//        }
//	}
	
	
}
