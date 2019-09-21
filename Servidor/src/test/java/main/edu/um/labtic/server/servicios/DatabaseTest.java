package main.edu.um.labtic.server.servicios;


import main.edu.um.labtic.server.mainAddMovie;
import main.edu.um.labtic.server.persistencia.PeliculaRepository;
import main.edu.um.labtic.server.servicios.entidades.Movie;
import main.edu.um.labtic.server.servicios.excepciones.InvalidPeliculaInformationException;
import main.edu.um.labtic.server.servicios.excepciones.PeliculaAlreadyExistsException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest(classes = mainAddMovie.class)
@RunWith(SpringRunner.class)
public class DatabaseTest {
    @Autowired
    private PeliculaService peliculaS;

    @Test
    public void testAdd() {
        Movie movie = new Movie("Sabelo", "Wachin");
        try {
            peliculaS.addPelicula(movie.getNombre(),movie.getDescripcion());
        } catch (PeliculaAlreadyExistsException | InvalidPeliculaInformationException e) {
            e.printStackTrace();
        }
        assertEquals("Sabelo", peliculaS.findOneByName("Sabelo").getNombre());
    }
}
