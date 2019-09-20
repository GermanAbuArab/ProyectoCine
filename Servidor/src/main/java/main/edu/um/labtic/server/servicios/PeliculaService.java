package main.edu.um.labtic.server.servicios;


import main.edu.um.labtic.server.persistencia.PeliculaRepository;
import main.edu.um.labtic.server.servicios.excepciones.*;
import main.edu.um.labtic.server.servicios.entidades.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliculaService {

    @Autowired
    PeliculaRepository peliculaRepository;

    public void addPelicula(long id, String name, String descripcion) throws PeliculaAlreadyExistsException, InvalidPeliculaInformationException {

        if (name == null || "".equals(name) || descripcion == null || "".equals(descripcion)) {
            throw new InvalidPeliculaInformationException("Alguno de los datos ingresados no es correcto");
        }

        if (peliculaRepository.findOneById(id) != null) {
            throw new PeliculaAlreadyExistsException();
        }

        Movie oPelicula= new Movie(id,name,descripcion);

    }


}
