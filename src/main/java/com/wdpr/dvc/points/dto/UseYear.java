package com.wdpr.dvc.points.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UseYear {

	private String startDate;
	private String endDate;	
}
