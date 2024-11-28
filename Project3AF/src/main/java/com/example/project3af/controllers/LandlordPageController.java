package com.example.project3af.controllers;

import com.example.project3af.MainApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class LandlordPageController {

    @FXML
    public Text HomeName;

    @FXML
    public Button RegisterPageButton;

    @FXML
    public Button RoomsPageButton;

    @FXML
    public Button DeleteProfileButton;

    @FXML
    public ImageView ProfileRoomImage1;
    @FXML
    public ImageView ProfileRoomImage2;
    @FXML
    public ImageView ProfileRoomImage3;
    @FXML
    public ImageView ProfileRoomImage4;

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
    public void OpenHomePage() {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("main-landlord-view.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 1280, 720);
            Stage stage = new Stage();
            stage.setTitle("IsTudent Initial");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void OpenRoomsPage() {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("rooms-list-page-view.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 1280, 720);
            Stage stage = new Stage();
            stage.setTitle("IsTudent Rooms");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void OpenDeleteProfilePopUp() {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("delete-profile-popup-view.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 350, 200);
            Stage stage = new Stage();
            stage.setTitle("IsTudent Delete");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
