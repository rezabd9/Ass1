package com.rezaul.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class BlogComments {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "bComments")
	private String bComments;

	public String getbComments() {
		return bComments;
	}

	public void setbComments(String bComments) {
		this.bComments = bComments;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "post_id")
	private BlogPost bpost;

	public BlogPost getBpost() {
		return bpost;
	}

	public void setBpost(BlogPost bpost) {
		this.bpost = bpost;
	}

}
