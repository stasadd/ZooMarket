package TD;

import SK.FileSaver;
import SK.Seller;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class XMLFormControllerAddSeller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXTextField AddloginText;

    @FXML
    private JFXButton buttonAdd;

    @FXML
    private JFXTextField AddPassworText;

    public void initialize(URL location, ResourceBundle resources) {

    }

    public void btnAddSeller(ActionEvent actionEvent) {
        String login = AddloginText.getText();
        String pass = AddPassworText.getText();

        Seller temp = new Seller(login, pass);
        try {
            FileSaver.saveSeller(temp);
            Stage secondStage = (Stage) buttonAdd.getScene().getWindow();
            secondStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
