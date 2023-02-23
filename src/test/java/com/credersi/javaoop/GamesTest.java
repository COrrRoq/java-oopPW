package com.credersi.javaoop;

import static org.junit.Assert.assertTrue;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GamesTest {
	@Test
	public void testsToBeDefined() {
		
		COD call = new COD();
		assertEquals(call.getKills(), 25);
	}
}