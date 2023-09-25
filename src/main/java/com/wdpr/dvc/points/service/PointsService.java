package com.wdpr.dvc.points.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.wdpr.dvc.points.dto.RetrievePointsActivityResponse;
import com.wdpr.dvc.points.exceptions.PointSummaryException;
import com.wdpr.dvc.points.repo.PointsActivityRepository;

@Service
public class PointsService {

	@Autowired
	PointsActivityRepository pointsActivityRepository;
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	

	public RetrievePointsActivityResponse createPointActivity(RetrievePointsActivityResponse pointActivity) {
		
		//RetrievePointsActivityResponse dto=new RetrievePointsActivityResponse();
		
		
		
		return mongoTemplate.insert(pointActivity);
		//pointsActivityRepository.save(pointActivity);
	}

	public RetrievePointsActivityResponse updatePointActivity(String membershipId, String contractId,
			RetrievePointsActivityResponse pointActivity) {
		
		  Query query = new Query(Criteria.where("membershipId").is(membershipId)
		  .and("pointsActivityContractWises.contractId").is(contractId));
		 
		
		

		//RetrievePointsActivityResponse rt = mongoTemplate.findOne(query, RetrievePointsActivityResponse.class);

		//if (Objects.nonNull(rt)) {
			Update update = new Update();
			update.push("pointsActivityContractWises.pointsActivityDetails",
					pointActivity.getPointsActivityContractWises().getPointsActivityDetails());
			mongoTemplate.updateFirst(query, update, RetrievePointsActivityResponse.class);
			return pointActivity;
		
		   
	}

	public List<RetrievePointsActivityResponse> getAllPointActivities() {
		return pointsActivityRepository.findAll();
	}

	
}
