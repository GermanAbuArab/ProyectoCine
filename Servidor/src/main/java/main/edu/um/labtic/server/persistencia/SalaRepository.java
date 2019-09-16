package main.edu.um.labtic.server.persistencia;

import main.edu.um.labtic.server.negocios.entidades.Sala;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaRepository extends CrudRepository<Sala, Long> {
}
