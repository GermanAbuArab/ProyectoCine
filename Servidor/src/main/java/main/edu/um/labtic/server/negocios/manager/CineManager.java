package main.edu.um.labtic.server.negocios.manager;


import main.edu.um.labtic.server.negocios.entidades.Cine;
import main.edu.um.labtic.server.persistencia.CineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CineManager {

    private final CineRepository CineRepository;
    @Autowired
    public CineManager(CineRepository cineRepository) {
        CineRepository = cineRepository;
    }

    @PostMapping("/cine")
    public void save(@RequestBody Cine cine) {
        CineRepository.save(cine);
    }
}