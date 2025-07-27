package com.luizbarros.uri2603.dto;

import com.luizbarros.uri2603.projections.CustomerMinProjection;

public class CustomerMinDTO {

	private String name;
	private String street;
	
	public CustomerMinDTO() {
	}

	public CustomerMinDTO(String name, String street) {
		this.name = name;
		this.street = street;
	}
	
	public CustomerMinDTO(CustomerMinProjection projection) {
		name = projection.getName();
		street = projection.getStreet();
	}

	public String getName() {
		return name;
	}

	public String getStreet() {
		return street;
	}

	@Override
	public String toString() {
		return "CustomerMinDTO [name=" + name + ", street=" + street + "]";
	}	
}
