package com.example.demo.AnimalsAPI.service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.AnimalsAPI.data.AnimalsAPIData;
import com.example.demo.AnimalsAPI.repository.AnimalsAPIRepository;

@Service
public class AnimalsAPIService {

	private final AnimalsAPIRepository animalsAPIRepository;

	public AnimalsAPIService(AnimalsAPIRepository animalsAPIRepository) {
		this.animalsAPIRepository = animalsAPIRepository;
	}
	
	public List<AnimalsAPIData> getAllAnimals() throws IOException {
		AnimalsAPIData[] animalsAll = animalsAPIRepository.getAllAnimals();
		
		List<AnimalsAPIData> animalsAllList = Arrays.asList(animalsAll);
		
		return animalsAllList;
	}
	
	public List<AnimalsAPIData> getAnimals(int id) throws IOException {

		AnimalsAPIData[] getAnimals = animalsAPIRepository.getAnimals(id);
		
		List<AnimalsAPIData> animalsList = Arrays.asList(getAnimals);
		
		return animalsList;

	}
}