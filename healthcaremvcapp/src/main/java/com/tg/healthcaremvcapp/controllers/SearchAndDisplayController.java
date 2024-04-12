package com.tg.healthcaremvcapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tg.healthcaremvcapp.models.Clinic;
import com.tg.healthcaremvcapp.services.ClinicImplService;
import com.tg.healthcaremvcapp.services.ClinicService;

@Controller
public class SearchAndDisplayController {

	@Autowired
	private ClinicImplService clinicService = new ClinicService();
	
	@PostMapping("/search_in_db")
	public String searchInDbByName(@ModelAttribute("clinic")Clinic clinic, 
			Model model) {
		if(clinic.getClinicName() != null) {
			model.addAttribute("clinic", clinic);
			searchAndGetResult(clinic , model);
			return "redirect:/search_in_db";
		}else		
			return null;
	}
	
	@GetMapping("/search")
	public String searchAndGetResult(@ModelAttribute("clinic")Clinic clinic, Model model) {
		model.addAttribute("clinics", clinicService.getClinicByName(clinic.getClinicName()));
		return "/search_in_db";
	}
}
