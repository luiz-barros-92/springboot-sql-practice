package com.luizbarros.uri2613.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.luizbarros.uri2613.entities.Movie;
import com.luizbarros.uri2613.projections.MovieProjection;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	
	@Query(nativeQuery = true, value = "SELECT M.ID, M.NAME\n"
			+ "FROM MOVIES M\n"
			+ "JOIN PRICES P ON P.ID = M.ID_PRICES\n"
			+ "WHERE P.VALUE < :lessThan")
	List<MovieProjection> search(Long lessThan);

}
