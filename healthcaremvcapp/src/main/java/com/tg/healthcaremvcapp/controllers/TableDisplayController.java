package com.tg.healthcaremvcapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tg.healthcaremvcapp.services.ClinicImplService;
import com.tg.healthcaremvcapp.services.ClinicService;

@Controller
public class TableDisplayController {
	
	@Autowired
	private ClinicImplService clinicService = new ClinicService();
	
	@GetMapping("/display")
	public String loadDisplay(Model model) {
		
		model.addAttribute("clinics", clinicService.getAllClinic());
		return "displayTable.html";
	}
}
