package main.edu.um.labtic.server.persistencia;

import main.edu.um.labtic.server.negocios.entidades.Cine;
import org.springframework.data.repository.CrudRepository;


public interface CineRepository extends CrudRepository<Cine, Long> {

    Cine findByid(Long id);

}