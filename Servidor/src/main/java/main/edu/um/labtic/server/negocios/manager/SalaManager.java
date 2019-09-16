package main.edu.um.labtic.server.negocios.manager;


import main.edu.um.labtic.server.negocios.entidades.Sala;
import main.edu.um.labtic.server.persistencia.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class SalaManager {

    private final SalaRepository SalaRepository;

    @Autowired
    public SalaManager(SalaRepository salaRepository) {
        SalaRepository = salaRepository;
    }


    public void save(Sala sala) {
        SalaRepository.save(sala);
    }

}
