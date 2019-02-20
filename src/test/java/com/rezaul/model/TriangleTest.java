package com.rezaul.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
	private Triangle triangle = new Triangle();


	@Before
	public void setUp() throws Exception {
		triangle.setA(2);
		triangle.setB(3);
		triangle.setC(0);
		//triangle.setA(-1);



		
	}

	@Test
	public void testA() {
		assertEquals(2,triangle.getA());

	}
	@Test
	public void testB() {
		assertEquals(3,triangle.getB());

	}
	@Test
	public void testC() {
		assertEquals(0,triangle.getC());

	}

}
