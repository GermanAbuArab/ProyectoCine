package main.edu.um.labtic.server.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.edu.um.labtic.server.servicios.PeliculaService;
import main.edu.um.labtic.server.servicios.excepciones.InvalidPeliculaInformationException;
import main.edu.um.labtic.server.servicios.excepciones.PeliculaAlreadyExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


@CrossOrigin
@RestController
public class AddMovieController {

    @Autowired
    private PeliculaService peliculaService;


    @FXML
    private TextField nombrePelicula, descripcion;

    @FXML
    public void addMovie(){
        String nombre=nombrePelicula.getText();
        String descripcion1=descripcion.getText();


        System.out.println("Creaste la peli " + nombre + " cuya descripcion es " + descripcion1);
        try {
            peliculaService.addPelicula(nombre,descripcion1);
        } catch (PeliculaAlreadyExistsException e) {
            e.printStackTrace();
        } catch (InvalidPeliculaInformationException e) {
            e.printStackTrace();
        }
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





}
