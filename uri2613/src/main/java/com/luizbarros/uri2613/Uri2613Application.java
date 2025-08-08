package com.luizbarros.uri2613;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.luizbarros.uri2613.dto.MovieMinDTO;
import com.luizbarros.uri2613.projections.MovieProjection;
import com.luizbarros.uri2613.repositories.MovieRepository;

@SpringBootApplication
public class Uri2613Application implements CommandLineRunner{

	private MovieRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(Uri2613Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<MovieProjection> list = repository.search(2L);
		List<MovieMinDTO> result = list.stream().map(x -> new MovieMinDTO(x)).collect(Collectors.toList());
		
		for (MovieMinDTO obj : result) {
			System.out.println(obj);
		}
	}

}
