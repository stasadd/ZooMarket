package TD;

import SK.FileLoader;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class XMLFormController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXTextField loginText;

    @FXML
    private JFXButton buttonLogin;

    @FXML
    private JFXTextField passworText;

    public void initialize(URL location, ResourceBundle resources) {

    }

    public void btnLogin(ActionEvent actionEvent) {
        String login = loginText.getText();
        String pass = passworText.getText();

        try {
            if(FileLoader.UserExists(login, pass)) {
                Parent root = FXMLLoader.load(getClass().getResource("/MainWindowFXML.fxml"));
                Scene scene = new Scene(root);
                Stage secondStage = (Stage) buttonLogin.getScene().getWindow();
                secondStage.close();
                secondStage = new Stage();
                secondStage.setScene(scene);
                secondStage.setWidth(750);
                secondStage.setHeight(500);
                secondStage.setTitle("Login Seller");
                secondStage.show();
                System.out.println("user exist");
            }
            else
                System.out.println("user not exist");
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}
