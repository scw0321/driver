package com.codingdojo.mvc.controllers;


import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

	@Autowired
	private DriverService driverService;
	
	@Autowired
	private LicenseService licenseService;
//	
//	public DriverController(DriverService driverService, LicenseService licenseService) {
//		
//		this.driverService = driverService;
//		this.licenseService = licenseService;
//	}
	
	@RequestMapping("/driver/new")
	public String newDriver(@ModelAttribute ("driver") Driver driver) {
		return "/drivers/driver.jsp";
	}
	
	@RequestMapping(value = "/driver/new", method=RequestMethod.POST)
	public String createD(@Valid @ModelAttribute("driver") Driver d, BindingResult result) {
		if (result.hasErrors()) {
            return "/drivers/driver.jsp";
        } else {
            driverService.createDriver(d);
            return "redirect:/license/new";
        }

	}
	@RequestMapping("/license/new")
	public String newLicense(@ModelAttribute ("license") License license) {
		return "/drivers/license.jsp";
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		List<Driver> drivers = driverService.allDriver();
		model.addAttribute("drivers", drivers);
		
		System.out.println("hi there");
		
		System.out.println(Arrays.toString(drivers.toArray()));
		
		return "/drivers/index.jsp";
	}
	
	@RequestMapping(value = "/license/new", method=RequestMethod.POST)
	public String createL(@Valid @ModelAttribute("license") License l, BindingResult result) {
		if (result.hasErrors()) {
            return "/drivers/license.jsp";
        } else {
            licenseService.createLicense(l);
            
            return "/drivers/index.jsp";
        }
	}
	
	
}
