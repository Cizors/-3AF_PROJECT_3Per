package com.example.project3af.controllers;

import com.example.project3af.MainApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterRoomController {

    @FXML
    public TextField RegisterRoomTitle;

    @FXML
    public TextField RegisterRoomMonthlyPrice;

    @FXML
    public TextField RegisterRoomAdress;

    @FXML
    public TextField RegisterRoomRules;

    @FXML
    public TextField RegisterRoomInitDate;

    @FXML
    public TextField RegisterRoomFinalDate;

    @FXML
    public TextField RegisterRoomDescription;

    @FXML
    public TextField RegisterRoomCourse;

    @FXML
    public Text HomeName;

    @FXML
    public Button RegisterPageButton;

    @FXML
    public Button RegisterRoomButton;

    @FXML
    public Button CancelRoomButton;

    @FXML
    public Button ProfileIcon;

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

    @FXML
    public void OpenLandlordMainPage() {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("main-landlord-view.fxml"));
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