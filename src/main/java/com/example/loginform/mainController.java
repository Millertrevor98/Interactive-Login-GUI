package com.example.loginform;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import java.sql.Connection;
import java.sql.Connection;
import java.sql.Statement;

public class mainController {
    @FXML
    private Button cancelbutton;
    @FXML
    private Label loginmessagelabel;
    @FXML
    private TextField usernamefield;
    @FXML
    private TextField passwordfield;

    // Method called when the login button is clicked
    public void setLoginButton(ActionEvent e) {
        if (!usernamefield.getText().isBlank() && !passwordfield.getText().isBlank()) {
            loginmessagelabel.setText("Successful Login");
            validatelogin();
        } else {
            loginmessagelabel.setText("Please fill in credentials");
        }
    }

    // Method called when the cancel button is clicked
    public void setCancelbutton(ActionEvent e) {
        Stage stage = (Stage) cancelbutton.getScene().getWindow();
        stage.close();
    }

    // Method for validating the login
    public void validatelogin() {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();
        String verifyLogin = "SELECT COUNT(1) FROM UserAccounts WHERE Username = '" + usernamefield.getText() + "' AND password = '" + passwordfield.getText() + "'";

        // Add code to execute the SQL query and handle the result
    }
}
