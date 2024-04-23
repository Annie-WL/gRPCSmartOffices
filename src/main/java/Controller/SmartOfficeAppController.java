package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class SmartOfficeAppController {


    /*
    add Simple Controller Example
     */
    //example
    @FXML
    public TextField nameTextField;

    //example
    @FXML
    public Button submitButton;

    //example
    @FXML
    void submitButtonClickOnAction(ActionEvent event) {
        System.out.println("SubmitButtonClickOnAction clicked");
        String name = nameTextField.getText();
        System.out.println("nameTextField: " + name);
    }


}
