package main.edu.um.labtic.server.servicios;
import main.edu.um.labtic.server.persistencia.PeliculaRepository;
import main.edu.um.labtic.server.servicios.Excepciones.RestaurantAlreadyExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliculaService {

    @Autowired
    PeliculaRepository peliculaRepository;

    public void addPelicula(){


        if (peliculaRepository.findOneById(id) != null) {
            throw new RestaurantAlreadyExistsException();
        }

    }


}
