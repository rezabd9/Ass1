package com.rezaul.repository;

import org.springframework.data.repository.CrudRepository;

import com.rezaul.model.BlogComments;

public interface BlogCommentsRepository extends CrudRepository<BlogComments, Long> {
	
}

