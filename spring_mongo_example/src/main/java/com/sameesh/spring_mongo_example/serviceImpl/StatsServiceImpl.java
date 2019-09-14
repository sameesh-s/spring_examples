package com.sameesh.spring_mongo_example.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sameesh.spring_mongo_example.DAO.StatsDAO;
import com.sameesh.spring_mongo_example.service.StatsService;

@Service
public class StatsServiceImpl implements StatsService {

	@Autowired
	StatsDAO statsDao;
	
	@Override
	public int createStat() {
		statsDao.createStat();
		return -1;
	}

}
