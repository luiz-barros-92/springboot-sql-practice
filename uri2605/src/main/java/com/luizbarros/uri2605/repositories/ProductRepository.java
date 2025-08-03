package com.luizbarros.uri2605.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.luizbarros.uri2605.entities.Product;
import com.luizbarros.uri2605.projections.ProductProviderMinProjection;

public interface ProductRepository extends JpaRepository<Product, Long>{

	@Query(nativeQuery = true, value = "SELECT P.name AS nameProduct, PR.name AS nameProvider "
			+ "FROM products P "
			+ "JOIN providers PR ON P.id_providers = PR.id "
			+ "WHERE P.id_categories = :categoryId")
	List<ProductProviderMinProjection> search(Long categoryId);
}
