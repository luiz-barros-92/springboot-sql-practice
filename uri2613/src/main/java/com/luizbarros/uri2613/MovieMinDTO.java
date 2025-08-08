package com.luizbarros.uri2613;

import com.luizbarros.uri2613.projections.MovieProjection;

public class MovieMinDTO {

	private Long id;
	private String name;
	
	public MovieMinDTO(){
	}

	public MovieMinDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public MovieMinDTO(MovieProjection projection) {
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
		return "MovieMinDTO [id=" + id + ", name=" + name + "]";
	}	
}
