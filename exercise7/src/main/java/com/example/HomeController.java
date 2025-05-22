package com.example;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class HomeController implements Initializable {

    @FXML
    private TableColumn<User, String> accolumn;

    @FXML
    private Button create;

    @FXML
    private Button delete;

    @FXML
    private TableColumn<User, String> pcolumn;

    @FXML
    private PasswordField ptextfield;

    @FXML
    private TableColumn<User, String> scolumn;

    @FXML
    private ChoiceBox<String> statusbox;

    @FXML
    private TableColumn<User, String> ucolumn;

    @FXML
    private Button update;

    @FXML
    private Label usernamelabel;

    @FXML
    private TextField utextfield;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // TODO Auto-generated method stub
        String username = LoginController.user.getUsername();
        usernamelabel.setText(username);
    } 

    private void initializeCol(){

        ucolumn.setCellValueFactory(new PropertyValueFactory<>("username"));
        pcolumn.setCellValueFactory(new PropertyValueFactory<>("password"));
        accolumn.setCellValueFactory(new PropertyValueFactory<>("accountcreated"));
        scolumn.setCellValueFactory(new PropertyValueFactory<>("accountstatus"));
    }

    private void loadData(){

        mylist.clear();

        try {
            // Create object from File class
            File myFile = new File("accounts.txt");

            // .exists() method checks if a file exists in the pathname
            if (myFile.exists()) {

                Scanner filescanner = new Scanner(myFile);

                while (filescanner.hasNextLine()) {

                    String data = filescanner.nextLine();
        
                    String username = data.split(",")[0];
                    String password = data.split(",")[1];
                    String dcreated = data.split(",")[2];
                    String status = data.split(",")[3];

                    mylist.add(new User(username, password, dcreated, status));
                } 
                mytable.setItems(mylist);

                filescanner.close();
            }
            else {
                System.out.println(myFile.getName() + " does not exist!");
            }
        } catch (Exception e) {
            System.out.println("There is an error");
        } 
    }
}