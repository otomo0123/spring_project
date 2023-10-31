package com.example.demo.AnimalsAPI.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.AnimalsAPI.data.AnimalsAPIData;
import com.example.demo.AnimalsAPI.service.AnimalsAPIService;

@Controller
public class AnimalsAPIController {

	private final AnimalsAPIService animalsAPIService;

	public AnimalsAPIController(AnimalsAPIService animalsAPIService) {
		this.animalsAPIService = animalsAPIService;
	}

	@GetMapping("animalsAPI")
	public String getPets(Model model) throws IOException {
		List<AnimalsAPIData> animalsAllList = animalsAPIService.getAllAnimals();
		
		model.addAttribute("animalsAllList", animalsAllList);
		
		return "animalsAPI.html";
	}
	
	@GetMapping("animalsDetail")
	public String getPets(@RequestParam("id") int id, Model model) throws IOException {
		List<AnimalsAPIData> animalsList = animalsAPIService.getAnimals(id);
		
		model.addAttribute("animalsList", animalsList);
		return "animalsList.html";
	}
	
}