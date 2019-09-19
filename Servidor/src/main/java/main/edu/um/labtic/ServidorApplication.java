package main.edu.um.labtic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.context.ConfigurableApplicationContext;
/*

@SpringBootApplication
public class ServidorApplication extends Application {

	private ConfigurableApplicationContext springContext;
	private Parent rootNode;
	private FXMLLoader fxmlLoader;

	/*
	public static void main(String[] args) {
		launch(args);
	}


	@Override
	public void init() throws Exception {
		springContext = SpringApplication.run(ServidorApplication.class);
		fxmlLoader = new FXMLLoader();
		fxmlLoader.setControllerFactory(springContext::getBean);
	}

	@Override
	public void start(Stage primaryStage) throws Exception{
		fxmlLoader.setLocation(getClass().getResource("inicio.fxml")); //no se si esta bien puesto el path
		rootNode = fxmlLoader.load();

		primaryStage.setTitle("Inicio"); //nombre de la ventana
		Scene scene = new Scene(rootNode, 800, 600);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	@Override
	public void stop() {
		springContext.stop();
	}

	public static void main(String[] args) {
		SpringApplication.run(ServidorApplication.class, args);
	}

}
*/