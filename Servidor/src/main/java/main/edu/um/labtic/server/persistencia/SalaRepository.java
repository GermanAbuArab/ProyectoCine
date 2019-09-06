package main.edu.um.labtic.server.persistencia;

import main.edu.um.labtic.server.negocios.entidades.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaRepository extends JpaRepository<Sala, Long> {
}
