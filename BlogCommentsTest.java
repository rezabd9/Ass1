package com.rezaul.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BlogCommentsTest {
	private  BlogComments blogComments = new BlogComments();

	@Before
	public void setUp() throws Exception {
		blogComments.setbComments("BREXIT");
	}

	@Test
	public void testComments() {
		assertEquals("BREXIT",blogComments.getbComments());

	}
	
}
