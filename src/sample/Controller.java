package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private Label name;
    @FXML
    public void showName() {
        try {
            name.setText("Your name is " + firstName.getText() + " " + lastName.getText() + ".");
            firstName.clear();
            lastName.clear();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
