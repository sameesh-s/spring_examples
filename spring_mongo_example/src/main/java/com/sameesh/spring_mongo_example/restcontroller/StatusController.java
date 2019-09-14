package com.sameesh.spring_mongo_example.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sameesh.spring_mongo_example.service.StatsService;

@RestController
@RequestMapping(value = "/stats")
public class StatusController {

	@Autowired
	private StatsService statsService;
	
	//*******************methods for application ********************************
	@RequestMapping(value ="/applications", method=RequestMethod.GET)
	public List<String> getApplicationsStat(){
		System.out.println("Application stat is controller hit::");
		statsService.createStat();
		return null;
	}
	
}
