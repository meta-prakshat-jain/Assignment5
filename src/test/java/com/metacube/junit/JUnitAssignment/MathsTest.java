package com.metacube.junit.JUnitAssignment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathsTest {
	Maths math=new Maths();
	@Test
	public void LcmTest() {
		assertEquals(54,math.Lcm(54, 1, 0));
		assertEquals(6, math.Lcm(2, 3, 0));
		assertEquals(12, math.Lcm(4,6, 0));
		assertEquals(30, math.Lcm(10, 15, 0));
		assertEquals(16, math.Lcm(8, 16, 0));
		assertEquals(12, math.Lcm(12, 3, 0));
		assertEquals(63, math.Lcm(7, 9, 0));
		assertEquals(143, math.Lcm(11, 13, 0));
		assertEquals(500, math.Lcm(100, 250, 0));
		assertEquals(0, math.Lcm(0, 5, 0));
		assertEquals(7, math.Lcm(1, 7, 0));
		assertEquals(12, math.Lcm(-4, 6, 0));
	}
	@Test
	public void LCMusingGCDTest() {
			assertEquals(54,math.LCMusingGCD(54, 1));
			assertEquals(6, math.LCMusingGCD(2, 3));
			assertEquals(12, math.LCMusingGCD(4,6));
			assertEquals(30, math.LCMusingGCD(10, 15));
			assertEquals(16, math.LCMusingGCD(8, 16));
			assertEquals(12, math.LCMusingGCD(12, 3));
			assertEquals(63, math.LCMusingGCD(7, 9));
			assertEquals(143, math.LCMusingGCD(11, 13));
			assertEquals(500, math.LCMusingGCD(100, 250));
			assertEquals(0, math.LCMusingGCD(0, 5));
			assertEquals(7, math.LCMusingGCD(1, 7));
			assertEquals(12, math.LCMusingGCD(-4, 6));
	}
	@Test
	public void HcfUsingGcdTest() {
			assertEquals(1,math.HCFusingGCD(54, 1));
			assertEquals(1, math.HCFusingGCD(2, 3));
			assertEquals(2, math.HCFusingGCD(4,6));
			assertEquals(5, math.HCFusingGCD(10, 15));
			assertEquals(8, math.HCFusingGCD(8, 16));
			assertEquals(3, math.HCFusingGCD(12, 3));
			assertEquals(1, math.HCFusingGCD(7, 9));
			assertEquals(1, math.HCFusingGCD(11, 13));
			assertEquals(5, math.HCFusingGCD(0, 5));
			assertEquals(1, math.HCFusingGCD(1, 7));
			assertEquals(2, math.HCFusingGCD(-4, 6));
		
	}
	

}
