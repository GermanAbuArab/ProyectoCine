package main.edu.um.labtic.server.negocios.manager;


import main.edu.um.labtic.server.negocios.entidades.Cine;
import main.edu.um.labtic.server.persistencia.CineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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



    @RequestMapping(path="/Cine",method=RequestMethod.POST)
    public void save(@RequestBody Cine cine){
        System.out.println("Funca");
        CineRepository.save(cine);
    }



}
