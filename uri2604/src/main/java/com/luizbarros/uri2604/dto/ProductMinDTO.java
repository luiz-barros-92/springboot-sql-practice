package com.luizbarros.uri2604.dto;

import com.luizbarros.uri2604.projections.ProductMinProjection;

public class ProductMinDTO {

	private Long id;
	private String name;
	
	public ProductMinDTO() {
	}

	public ProductMinDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public ProductMinDTO(ProductMinProjection projection) {
		id = projection.getId();
		name = projection.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "ProductMinDTO [id=" + id + ", name=" + name + "]";
	}	
}
