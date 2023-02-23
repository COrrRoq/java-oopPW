package com.credersi.javaoop;

public class Madden extends Games implements Sports {

	public boolean ballKicked() {
		return true;
	}

	public boolean goalScored() {
		return true;
	}

	public String getMatchScore() {
		return "36-12";
	}

}
