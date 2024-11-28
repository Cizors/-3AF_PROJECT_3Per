package com.example.project3af.controllers;

import com.example.project3af.MainApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ComboBoxBase;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class MainLandlordController {

    @FXML
    public Button RegisterPageButton;

    @FXML
    public Button ProfileIcon;

    @FXML
    public ImageView LandlordMainRoomImage1;
    @FXML
    public ImageView LandlordMainRoomImage2;
    @FXML
    public ImageView LandlordMainRoomImage3;
    @FXML
    public ImageView LandlordMainRoomImage4;
    @FXML
    public ImageView LandlordMainRoomImage5;
    @FXML
    public ImageView LandlordMainRoomImage6;

    @FXML
    public void OpenRoomPage() {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("room-page-view.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 1280, 720);
            Stage stage = new Stage();
            stage.setTitle("IsTudent Room");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void OpenRegisterPage() {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("register-view.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 1280, 720);
            Stage stage = new Stage();
            stage.setTitle("IsTudent Register");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void OpenLandlordPage() {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("landlord-page-view.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 1280, 720);
            Stage stage = new Stage();
            stage.setTitle("IsTudent Profile");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}