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

public class RoomsListPageController {

    @FXML
    public Text HomeName;

    @FXML
    public Button RegisterPageButton;

    @FXML
    public Button RegisterRoomButton;

    @FXML
    public Button ProfileIcon;

    @FXML
    public Button DeleteRoomButton;
    @FXML
    public Button EditRoomButton;
    @FXML
    public Button DeleteRoomButton2;
    @FXML
    public Button EditRoomButton2;
    @FXML
    public Button DeleteRoomButton3;
    @FXML
    public Button EditRoomButton3;
    @FXML
    public Button DeleteRoomButton4;
    @FXML
    public Button EditRoomButton4;
    @FXML
    public Button DeleteRoomButton5;
    @FXML
    public Button EditRoomButton5;
    @FXML
    public Button DeleteRoomButton6;
    @FXML
    public Button EditRoomButton6;
    @FXML
    public Button DeleteRoomButton7;
    @FXML
    public Button EditRoomButton7;
    @FXML
    public Button DeleteRoomButton8;
    @FXML
    public Button EditRoomButton8;

    @FXML
    public ImageView ListRoomImage1;
    @FXML
    public ImageView ListRoomImage2;
    @FXML
    public ImageView ListRoomImage3;
    @FXML
    public ImageView ListRoomImage4;
    @FXML
    public ImageView ListRoomImage5;
    @FXML
    public ImageView ListRoomImage6;
    @FXML
    public ImageView ListRoomImage7;
    @FXML
    public ImageView ListRoomImage8;

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
    public void OpenLandlordMainPage() {
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
    public void OpenRegisterRoomPage() {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("register-room-view.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 1280, 720);
            Stage stage = new Stage();
            stage.setTitle("IsTudent Register Room");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void OpenEditRoomPage() {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("edit-room-view.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 1280, 720);
            Stage stage = new Stage();
            stage.setTitle("IsTudent Edit Room");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void OpenDeletePopUp() {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("delete-popup-view.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 300, 150);
            Stage stage = new Stage();
            stage.setTitle("IsTudent Delete");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
