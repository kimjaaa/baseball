package com.baseball;

import static org.junit.Assert.*;

import org.junit.Test;


public class BaseballTest {

	@Test
	public void isBall() {
		int[] attackNumber = {1,2,3};
		int[] defenseNumber = {3,1,7};
		System.out.println("------");
		boolean result = Baseball.isBall(attackNumber, defenseNumber);
		System.out.println("------2");
		assertEquals(true, result);
	}

}
