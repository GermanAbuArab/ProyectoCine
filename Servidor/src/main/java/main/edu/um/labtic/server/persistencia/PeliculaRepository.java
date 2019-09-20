package main.edu.um.labtic.server.persistencia;



import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends CrudRepository<Pelicula, Long>, QuerydslPredicateExecutor {


    Pelicula findOneById(long id);
}
