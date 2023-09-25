package com.wdpr.dvc.points.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PointsActivityContractWises {

		private String contractId;
		private List<PointsActivityDetails> pointsActivityDetails;
}
