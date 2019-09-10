package main.edu.um.labtic.server.negocios.manager;


import main.edu.um.labtic.server.negocios.entidades.Cine;
import main.edu.um.labtic.server.persistencia.CineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class CineManager {



     // @Autowired
      //CineRepository CineRepository
    // ## segun javi

    private final CineRepository CineRepository;
    @Autowired
    public CineManager(CineRepository cineRepository) {
        CineRepository = cineRepository;
    }

    @PostMapping("/cine")
    public void create(@Valid @RequestBody Cine cine) {
        System.out.println("hola");
        CineRepository.save(cine);
    }

}
