package com.wdpr.dvc.points.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wdpr.dvc.points.dto.RetrievePointsActivityResponse;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public interface PointsResource {

	@PostMapping("/createPointActivity")
	@Operation(summary = "create PointsActivity", description = "Create API.")
	public RetrievePointsActivityResponse createPointActivity(@RequestBody RetrievePointsActivityResponse pointActivity);

	@PutMapping("/{membershipId}/{contractId}/updatePointsActivityDetail")
	@Operation(summary = "Update Point Activity", description = "Update API.")
	public RetrievePointsActivityResponse updatePointActivity(@PathVariable String membershipId, String contractId,
			@RequestBody RetrievePointsActivityResponse pointActivity);

//	@GetMapping("/getAllPointActivities")
//	@Operation(summary = "Retriving Point Activity", description = "Get API.")
//	public List<RetrievePointsActivityResponse> getAllPointActivities();
//	
	

}
