package com.luizbarros.uri2603.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.luizbarros.uri2603.entities.Customer;
import com.luizbarros.uri2603.projections.CustomerMinProjection;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

	@Query(nativeQuery = true, value = "SELECT customers.name, customers.street "
			+ "FROM customers "
			+ "WHERE LOWER (city) = LOWER(:city)")
	List<CustomerMinProjection> search1(String city);
}
