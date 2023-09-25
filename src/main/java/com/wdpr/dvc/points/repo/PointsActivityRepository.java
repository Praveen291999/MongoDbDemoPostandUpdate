package com.wdpr.dvc.points.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wdpr.dvc.points.dto.RetrievePointsActivityResponse;

@Repository
public interface PointsActivityRepository extends MongoRepository<RetrievePointsActivityResponse, String> {

}
