package com.rezaul.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.rezaul.model.BlogComments;
import com.rezaul.model.BlogPost;
import com.rezaul.model.Triangle;
import com.rezaul.repository.BlogCommentsRepository;
import com.rezaul.repository.BlogPostRepository;

@RestController
public class Controller {
	@Autowired
	public BlogPostRepository blogPostRepository;
	@Autowired
	public BlogCommentsRepository blogCommentsRepository;
	BlogPost blogPost = new BlogPost();

	@PostMapping("/triangle")
	public String triangle(@RequestBody Triangle triangle) {
		int a = triangle.getA();
		int b = triangle.getB();
		int c = triangle.getC();

		if (a < 1 || b < 1 || c < 1) {
			return "incoreect";
		} else if (a == b & c == b) {
			return "Equilateral";

		} else if (a == b || a == c || b == c) {
			return "Isosceles";
		}

		return "Scalene";
	}

	@PostMapping("/bpost")
	public String bPostStr(@RequestParam("file") MultipartFile file, @RequestParam("bPost") String bPost)
			throws IOException {
		blogPost.setbPost(bPost);
		blogPost.setPic(file.getBytes());
		blogPostRepository.save(blogPost);
		return blogPost.getbPost();

	}

	@PostMapping("/bcom")
	public String bCommentsStr(@RequestBody BlogComments bcomments) {
		bcomments.setBpost(blogPost);
		blogCommentsRepository.save(bcomments);
		return bcomments.getbComments();

	}

}
