package com.sameesh.spring_mongo_example.DAOImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.sameesh.spring_mongo_example.DAO.StatsDAO;
import com.sameesh.spring_mongo_example.model.Stat;

@Repository
public class StatsDAOImpl implements StatsDAO {

	@Autowired
	MongoTemplate mongoTemplate;
	
	
	private final static String STATSCOLLECTION = "appstat";
	
	@Override
	public int createStat() {
		System.out.println("it hit the DAO implementation of stats:: ");
		mongoTemplate.save(new Stat(), STATSCOLLECTION);
		return 0;
	}

}
