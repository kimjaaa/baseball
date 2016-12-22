package com.baseball;

import static org.junit.Assert.*;

import org.junit.Test;


public class BaseballTest {

	@Test
	public void Ball() {
		int[] attackNumber = {1,2,3};
		int[] defenseNumber = {3,1,7};
		System.out.println("------");
		int result = Baseball.Ball(attackNumber, defenseNumber);
		System.out.println("------2");
		assertEquals(2, result);
	}

}
