package com.wdpr.dvc.points.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@Document(collection="pointsActivity")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RetrievePointsActivityResponse {
	
	@Id
	private String id;
	private String membershipId;
	private PointsActivityContractWises pointsActivityContractWises;
	

}
