/*
 *《程式語言教學誌》的範例程式
 * http://kaiching.org/
 * 檔名：ArithmeticDemo.java
 * 功能：四則運算的啟動類別
 * 作者：張凱慶
 */

package arithmeticdemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ArithmeticDemo extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(root);

        stage.setTitle("整數四則運算");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
