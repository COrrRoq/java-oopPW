package com.credersi.javaoop;

public class Fifa extends Games implements Sports {

	public boolean ballKicked() {
		return true;
	}

	public boolean goalScored() {
		return false;
	}

	public String getMatchScore() {
		return "0-3";
	}
}
