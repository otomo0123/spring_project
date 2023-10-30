package com.example.demo.AnimalsAPI.repository;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.example.demo.AnimalsAPI.data.AnimalsAPIData;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class AnimalsAPIRepository {
	
	public AnimalsAPIData[] getAllAnimals() throws IOException {
		
		String url = "https://jsn9xu2vsk.execute-api.ap-northeast-1.amazonaws.com/sample/sampleapi";
		
		RestTemplate rest = new RestTemplate();
		
		ResponseEntity<String> response = rest.getForEntity(url, String.class);
		
		String json = response.getBody();
		
		ObjectMapper mapper = new ObjectMapper();
		
		AnimalsAPIData[] animalsAll = mapper.readValue(json, AnimalsAPIData[].class);
		
		return animalsAll;
	}
	
	public AnimalsAPIData[] getAnimals(int id) throws IOException {

		String url = "https://jsn9xu2vsk.execute-api.ap-northeast-1.amazonaws.com/sample/sampleapi?id=1";

		RestTemplate rest = new RestTemplate();

		ResponseEntity<String> response = rest.getForEntity(url, String.class);

		String json = response.getBody();

		ObjectMapper mapper = new ObjectMapper();

		AnimalsAPIData[] animalsList = mapper.readValue(json, AnimalsAPIData[].class);

		return animalsList;
	}

}