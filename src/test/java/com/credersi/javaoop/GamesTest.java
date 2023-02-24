package com.credersi.javaoop;

import static org.junit.Assert.assertTrue;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GamesTest {
 @Test
 	public void cod001getKills() {
	 COD call = new COD();
		assertEquals(call.getKills(), 25);
 	}
 	@Test
 	public void cod002getDeaths() {
 	COD call = new COD();
 		assertEquals(call.getDeaths(), 3);
 		
	}
	@Test
 	public void cod003getKDRatio() {
 	COD call = new COD();
 	System.out.println(call.getKDRatio());
 		assertEquals(call.getKDRatio(), 8.33);
 	
 }
	@Test
 	public void cod004getGenre() {
		Games call = new COD();
		System.out.println(call.getGenre());
		assertEquals(call.getGenre(), "Shooter");
		System.out.println();
}
	
	
	
	@Test
	public void fifa001BallKicked() {
		Fifa call= new Fifa();
		assertTrue(call.ballKicked());
		
	}
	@Test
	public void fifa002GoalsScored() {
		Fifa call= new Fifa();
		assertTrue(!call.goalScored());
	}
	@Test
	public void fifa003getMatchScore() {
		Fifa call= new Fifa();
		assertEquals(call.getMatchScore(),"0-3");
	}
	@Test
	public void fifa004GetGenre() {
		Games call= new Fifa();
		System.out.println(call.getGenre());
		assertEquals(call.getGenre(), "Sports");
		
	}
	
	
	@Test
	public void gow001getLevel() {
		GodOfWar call = new GodOfWar();
		System.out.println(call.getLevel());
		assertEquals(call.getLevel(), 10);
		
	}
	
	@Test
	public void gow002getMissionsComplete() {
		GodOfWar call = new GodOfWar();
		System.out.println(call.getMissionsCompleted());
		assertEquals(call.getMissionsCompleted(), 5);
		
	}
	@Test
	public void gow003getPercentageComplete() {
		GodOfWar call = new GodOfWar();
	 	System.out.println(call.getPercentageComplete());
	 		assertEquals(call.getPercentageComplete(), 12.50);
	}
	
	
	
}
