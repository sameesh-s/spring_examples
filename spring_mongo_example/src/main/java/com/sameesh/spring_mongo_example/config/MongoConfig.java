package com.sameesh.spring_mongo_example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.MongoClient;

@Configuration
public class MongoConfig extends AbstractMongoConfiguration{

	@Override
	public MongoClient mongoClient() {
		System.out.println("Mongo configuration on place:: ");
		return new MongoClient("127.0.0.1", 27017);
	}

	@Override
	protected String getDatabaseName() {
		return "springmongo";
	}
	

}
