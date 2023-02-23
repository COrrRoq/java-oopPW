package com.credersi.javaoop;

public class COD extends Games implements Shooter {
	
	private int kills = 25;
	private int deaths = 3;
	private double kdRatio;
	
	public int getKills() {
		return kills;
	}

	public int getDeaths() {
		return deaths;
	}

	public double getKDRatio() {
		return kills/deaths;
	}

}
