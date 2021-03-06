package com.example.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.domain.Word;

//The below line says (@FeignCLient("NOUN"), invoke API http://localhost:8908 by referring Eureka  Client ID
//http://localhost:8908 --> API will return the noun word configured in the application-noun.properties files
//The value from the API service will be populated to domain object Word and return to the Service
//Service will return it to the controller


@FeignClient("NOUN")
public interface NounClient {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public Word getWord();
	
}
