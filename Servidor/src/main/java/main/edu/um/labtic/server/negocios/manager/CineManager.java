package main.edu.um.labtic.server.negocios.manager;


import main.edu.um.labtic.server.negocios.entidades.Cine;
import main.edu.um.labtic.server.persistencia.CineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CineManager {



     // @Autowired
    //  CineRepository CineRepository
    // ## segun javi

    private final CineRepository CineRepository;
    @Autowired
    public CineManager(CineRepository cineRepository) {
        CineRepository = cineRepository;
    }

    // ahce el mapeo de lo que viene en el canal 8080 viene en html
    public void save( Cine cine) {
        CineRepository.save(cine);
    }
}