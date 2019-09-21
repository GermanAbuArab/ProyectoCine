package main.edu.um.labtic.server.servicios;


import main.edu.um.labtic.server.persistencia.PeliculaRepository;
import main.edu.um.labtic.server.servicios.excepciones.*;
import main.edu.um.labtic.server.servicios.entidades.*;

import main.edu.um.labtic.server.servicios.rmi.PeliculaManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliculaService implements PeliculaManager {

    @Autowired
    PeliculaRepository peliculaRepository;

    @Override
    public void addPelicula(String name, String descripcion) throws PeliculaAlreadyExistsException, InvalidPeliculaInformationException {

        if (name == null || "".equals(name) || descripcion == null || "".equals(descripcion)) {
            throw new InvalidPeliculaInformationException("Alguno de los datos ingresados no es correcto");
        }

        if (peliculaRepository.findOneByName(name) != null) {
            throw new PeliculaAlreadyExistsException();
        }

        Movie oPelicula= new Movie(name,descripcion);
        peliculaRepository.save(oPelicula);

    }

}
