package com.wdpr.dvc.points;

public class CustomIdGenerator {
	private static int counter = 1;

	public static String generateCustomId() {
		return String.valueOf(++counter);
	}
}