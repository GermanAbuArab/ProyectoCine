package ui.sample.addMovie;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class addMovieController {

    @FXML
    private TextField nombrePelicula,Descripcion;

    @FXML
    public void addMovie(ActionEvent event){

        String nombre = nombrePelicula.getText();
        String descripcion = Descripcion.getText();


        Pelicula pelicula = new Pelicula(nombrePelicula.getText(),Descripcion.getText());
        System.out.println("Creaste la peli " + pelicula.getNombre() + " cuya descripcion es " + pelicula.getDescripcion());
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
