import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        URL url = new File("src/main/java/controller/product/1.java").toURL();
//        Parent root= FXMLLoader.load(url);
        Parent root = FXMLLoader.load(getClass().getResource("CandidateRegister.fxml"));
        primaryStage.setScene(new Scene(root,850,580));
        primaryStage.setResizable(false);
        primaryStage.setTitle("");
        primaryStage.show();
    }
}
