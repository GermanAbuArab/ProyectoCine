package main.edu.um.labtic.server.negocios.manager;


import main.edu.um.labtic.server.negocios.entidades.Sala;
import main.edu.um.labtic.server.persistencia.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class SalaManager {

    @Autowired
    SalaRepository repository;
    @PostMapping("/sala")
    public void save(@RequestBody Sala sala){
        repository.save(sala);
    }

}
