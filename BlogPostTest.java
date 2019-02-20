package com.rezaul.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BlogPostTest {
	private BlogPost blogpost= new BlogPost();

	@Before
	public void setUp() throws Exception {
		blogpost.setbPost("DK");
	}

	@Test
	public void testBlogPost() {
		assertEquals("DK",blogpost.getbPost());

	}

}
