package com.luizbarros.uri2604;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.luizbarros.uri2604.dto.ProductMinDTO;
import com.luizbarros.uri2604.projections.ProductMinProjection;
import com.luizbarros.uri2604.repositories.ProductRepository;

@SpringBootApplication
public class Uri2604Application implements CommandLineRunner{
	
	@Autowired
	private ProductRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Uri2604Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<ProductMinProjection> list = repository.search(10, 100);
		List<ProductMinDTO> result = list.stream().map(x -> new ProductMinDTO(x)).collect(Collectors.toList());
		
		for (ProductMinDTO obj : result) {
			System.out.println(obj);
		}
		
	}

}
