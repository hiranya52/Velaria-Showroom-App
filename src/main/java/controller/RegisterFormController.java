package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterFormController {

    @FXML
    private PasswordField txtConfirmPassword;

    @FXML
    private PasswordField txtCreatePassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void btnRegisterOnAction(ActionEvent event) {

    }

    @FXML
    void lblLogInOnEnter(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/login_form.fxml"));
            Parent root = loader.load();

            Stage loginStage = new Stage(); // new window for register form
            loginStage.setScene(new Scene(root));
            loginStage.setTitle("Login Form");
            loginStage.show();

            // close the login window
            Stage registerStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            registerStage.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
