import SK.FileLoader;
import SK.FileSaver;
import SK.Seller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Start extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/loginFXML.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setWidth(600);
        primaryStage.setHeight(500);
        primaryStage.setTitle("Login Seller");
        primaryStage.show();
    }


    public static void main(String[] args) {
        System.out.println("krya");
//        try {
//            FileSaver.saveSeller(new Seller("admin", "admin"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        launch(args);
    }
}
