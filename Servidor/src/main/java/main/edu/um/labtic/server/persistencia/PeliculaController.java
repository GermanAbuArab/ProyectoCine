/*package main.edu.um.labtic.server.persistencia;


import main.edu.um.labtic.server.servicios.entidades.Pelicula11;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/peliculas")
public class PeliculaController {


    @Autowired
    PeliculaRepository peliculaRepository;

    @Autowired
    public PeliculaController(PeliculaRepository peliculaRepository) {
        peliculaRepository = peliculaRepository;
    }


    @PostMapping("/crear")
    public void save(@RequestBody Pelicula11 pelicula){
        peliculaRepository.save(pelicula);
    }

}
*/