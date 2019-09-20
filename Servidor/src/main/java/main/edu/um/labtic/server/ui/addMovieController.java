package main.edu.um.labtic.server.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.edu.um.labtic.server.servicios.Pelicula;
import main.edu.um.labtic.server.servicios.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class addMovieController {

    @Autowired
    PeliculaService peliculaService;


    @FXML
    private TextField nombrePelicula, descripcion;

    @FXML
    public void addMovie(){

        Pelicula pelicula = new Pelicula(nombrePelicula.getText(), descripcion.getText());

        System.out.println("Creaste la peli " + pelicula.getNombre() + " cuya descripcion es " + pelicula.getDescripcion());
      // peliculaRepository.save(pelicula);

        nombrePelicula.clear();
        descripcion.clear();

        System.out.println("hola");
    }

    @FXML
    private void addScene(ActionEvent event) throws IOException {  // vuelve a la scena
        Parent inicio = FXMLLoader.load(getClass().getResource("../../../../resources/inicio.fxml"));
        Scene inicioScene = new Scene(inicio);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(inicioScene);
        window.show();
    }


    public addMovieController() {
    }
}
