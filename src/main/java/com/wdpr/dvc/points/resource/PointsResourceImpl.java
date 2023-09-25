package com.wdpr.dvc.points.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wdpr.dvc.points.dto.RetrievePointsActivityResponse;
import com.wdpr.dvc.points.service.PointsService;

@Component
public class PointsResourceImpl implements PointsResource{

	@Autowired
	PointsService pointsService;


	@Override
	public RetrievePointsActivityResponse createPointActivity(RetrievePointsActivityResponse pointActivity) {
		return pointsService.createPointActivity(pointActivity);
	}

	@Override
	public RetrievePointsActivityResponse updatePointActivity (String membershipId, String contractId, RetrievePointsActivityResponse pointActivity) {
		return pointsService.updatePointActivity(membershipId,contractId,pointActivity);
	}

	/*
	 * @Override public List<RetrievePointsActivityResponse> getAllPointActivities()
	 * { return pointsService.getAllPointActivities(); }
	 */


}
