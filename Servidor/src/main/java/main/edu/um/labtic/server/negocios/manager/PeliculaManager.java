package main.edu.um.labtic.server.negocios.manager;

import main.edu.um.labtic.server.negocios.entidades.Pelicula;
import main.edu.um.labtic.server.persistencia.PeliculaRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class PeliculaManager {

    private final PeliculaRepository PeliculaRepository;

    @Autowired
    public PeliculaManager(PeliculaRepository peliculaRepository) {
        PeliculaRepository = peliculaRepository;
    }

    public void save(Pelicula pelicula) {
        PeliculaRepository.save(pelicula);
    }
}
