package com.wdpr.dvc.points.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PointsActivityDetails {

	private String activityDesc;
	private String amount;
	private String balance;
	private String transactionDate;
	private UseYear useYear;
	private String activityFlow;
	//private BucketBalanceContractWises bucketBalanceContractWises;
	
	
}
