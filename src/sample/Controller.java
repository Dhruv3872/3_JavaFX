package sample;

import javafx.fxml.FXML;
//import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    /*@FXML
    private Button submitButton;*/
    @FXML
    private Label name;
    @FXML
    public void showName() {
        try {
            name.setText("Your name is " + firstName.getText() + " " + lastName.getText() + ".");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
