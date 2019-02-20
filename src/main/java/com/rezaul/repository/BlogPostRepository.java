package com.rezaul.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.rezaul.model.BlogPost;


public interface BlogPostRepository extends CrudRepository<BlogPost, Long> {
	
		}



