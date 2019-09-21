package main.edu.um.labtic.server.servicios.rmi;

import main.edu.um.labtic.server.servicios.entidades.Movie;
import main.edu.um.labtic.server.servicios.excepciones.InvalidPeliculaInformationException;
import main.edu.um.labtic.server.servicios.excepciones.PeliculaAlreadyExistsException;
import org.springframework.stereotype.Component;

@Component
public interface PeliculaManager {

    public void addPelicula(String name, String descripcion) throws InvalidPeliculaInformationException, PeliculaAlreadyExistsException;

}
