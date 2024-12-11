package cs112.lab09.controllers;

import cs112.lab09.MainApplication;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;


public class MainController {

    @FXML
    private ImageView logoImageView;
    @FXML
    private Button startButton;
    @FXML
    private Button quitButton;

    @FXML
    public void initialize() {
        System.out.println("INATN CALLED");
        logoImageView.setImage(new Image(getClass().getResourceAsStream( "/images/Red-Summer.jpg")));
    }

    @FXML
    protected void OnStartButtonClicked(ActionEvent actionEvent) throws IOException {
        // Load the FXML file for the map view
        Parent mapView = FXMLLoader.load(MainApplication.class.getResource("map-view.fxml"));
        Scene mapViewScene = new Scene(mapView);

        // Get the current window (Stage) from the action event
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        // Set the new scene to the window (Stage)
        window.setScene(mapViewScene);

        // Show the window
        window.show();

    }
    @FXML
    public void OnQuitButtonClicked(ActionEvent actionEvent) {
        Platform.exit();
    }
}