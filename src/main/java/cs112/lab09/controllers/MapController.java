package cs112.lab09.controllers;

import cs112.lab09.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MapController {



    @FXML
    protected void onBisbeeAzButtonClick() throws IOException{
        // Load the FXML file for the popup window (event-view.fxml)
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApplication.class.getResource("event-view.fxml"));

        // Load the FXML file into a Parent object
        Parent eventViewParent = loader.load();

        // Create a new stage (popup window) for the scene
        Stage popupStage = new Stage();

        // Set the modality for the popup window
        popupStage.initModality(Modality.APPLICATION_MODAL);

        // Create a scene for the popup window using the loaded FXML
        Scene popupScene = new Scene(eventViewParent);

        // Set the scene to the popup stage
        popupStage.setScene(popupScene);

        // Show the popup window
        popupStage.show();

    }

    @FXML
    public void onSanfranciscoButtonClick(ActionEvent actionEvent) throws IOException {
        // Load the FXML file for the popup window (event-view.fxml)
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApplication.class.getResource("event-view.fxml"));

        // Load the FXML file into a Parent object
        Parent eventViewParent = loader.load();

        // Create a new stage (popup window) for the scene
        Stage popupStage = new Stage();

        // Set the modality for the popup window
        popupStage.initModality(Modality.APPLICATION_MODAL);

        // Create a scene for the popup window using the loaded FXML
        Scene popupScene = new Scene(eventViewParent);

        // Set the scene to the popup stage
        popupStage.setScene(popupScene);

        // Show the popup window
        popupStage.show();

    }
}
