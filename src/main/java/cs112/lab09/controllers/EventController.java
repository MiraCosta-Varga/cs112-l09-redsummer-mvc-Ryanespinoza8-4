package cs112.lab09.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.awt.event.ActionEvent;

public class EventController {

        @FXML
        private Button closeButton;

        @FXML
        private Label locationlabel;

        @FXML
        private Label dateLabel;

        @FXML
        private Label descriptionLabel;

        @FXML
        private Label sedDescriptionLabel;


        @FXML
        protected void onCloseButtonClicked() {
            System.out.println("closed window with button!");
        }
    }

