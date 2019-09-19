package ui.sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class inicioController implements Initializable {
    @FXML
    private Button btn_nav ,home_icon;



    @FXML
    private void addScene(ActionEvent event) throws IOException {
        Parent inicio = FXMLLoader.load(getClass().getResource("/sample.addMovie/addMovie.fxml"));
        Scene inicioScene = new Scene(inicio);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(inicioScene);
        window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
