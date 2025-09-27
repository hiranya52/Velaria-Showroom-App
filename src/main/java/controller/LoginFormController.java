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

public class LoginFormController {

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void btnLoginOnAction(ActionEvent event) {

    }

    @FXML
    void txtRegisterOnAction(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/register_form.fxml"));
            Parent root = loader.load();

            Stage registerStage = new Stage(); // new window for register form
            registerStage.setScene(new Scene(root));
            registerStage.setTitle("Register Form");
            registerStage.show();

            // close the login window
            Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            loginStage.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
