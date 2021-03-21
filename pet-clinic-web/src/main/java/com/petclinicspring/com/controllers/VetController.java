package com.petclinicspring.com.controllers;

import com.petclinicspring.com.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vets")
public class VetController {

	private final VetService vetService;
	@Autowired
	public VetController(VetService vetService) {
		this.vetService = vetService;
	}

	@RequestMapping({"","/","/index","/index.html"})
	public String listOwners(Model model){
		model.addAttribute("vets",vetService.findAll()) ;
		return "vets/index";
	}
}
