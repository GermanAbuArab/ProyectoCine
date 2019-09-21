package main.edu.um.labtic.server.persistencia;


import main.edu.um.labtic.server.servicios.entidades.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends JpaRepository<Movie, Long>, QuerydslPredicateExecutor {

    Movie findOneByName(String name);
}
