/*
 *《程式語言教學誌》的範例程式
 * http://kaiching.org/
 * 檔名：FXMLDocumentController.java
 * 功能：四則運算的 Controller 類別
 * 作者：張凱慶
 */

package arithmeticdemo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ChoiceBox;

public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private TextField n1;

    @FXML
    private TextField n2;

    @FXML
    private ChoiceBox choice;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        int a = Integer.parseInt(n1.getText());
        int b = Integer.parseInt(n2.getText());
        String op = choice.getValue().toString();
        int result = 0;
        switch (op) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                result = -9999;
        }
        label.setText(String.valueOf(result));
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
 }
