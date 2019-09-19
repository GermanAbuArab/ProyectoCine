package main.edu.um.labtic.server.negocios.manager;


import main.edu.um.labtic.server.negocios.entidades.Cine;
import main.edu.um.labtic.server.persistencia.CineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@Service
@RestController
public class CineManager {


    private final CineRepository cineRepository;

    @Autowired
    public CineManager(CineRepository cinerepository) {
        cineRepository = cinerepository;
    }


    public void save(Cine cine) {
        System.out.println("Funca");
        cineRepository.save(cine);
    }


}
