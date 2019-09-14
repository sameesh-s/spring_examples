package com.sameesh.spring_mongo_example.restcontroller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	Logger logger = LoggerFactory.getLogger(StatusController.class);

	
	//*******************methods for application ********************************
	@RequestMapping(value ="/applications", method=RequestMethod.GET)
	public List<String> getApplicationsStat(){
		
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
		System.out.println("Application stat is controller hit::");
		statsService.createStat();
		return null;
	}
	
}
