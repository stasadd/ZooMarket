package TD;

import com.jfoenix.controls.JFXButton;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class XMLFormControllerMain {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuItem idAddSeller;

    @FXML
    private Label TextName1;

    @FXML
    private Label textPrice1;

    @FXML
    private Label TextName2;

    @FXML
    private Label textPrice2;

    @FXML
    private Label TextName3;

    @FXML
    private Label textPrice3;

    @FXML
    private Label TextName4;

    @FXML
    private Label textPrice4;

    @FXML
    private Label textPrice5;

    @FXML
    private Label TextName6;

    @FXML
    private Label textPrice6;

    @FXML
    private Label TextName5;

    @FXML
    private JFXButton ButtonBuy1;

    @FXML
    private JFXButton ButtonBuy2;

    @FXML
    private JFXButton ButtonBuy3;

    @FXML
    private JFXButton ButtonBuy4;

    @FXML
    private JFXButton ButtonBuy5;

    @FXML
    private JFXButton ButtonBuy6;

    List<Animal> perfectAnimals = new ArrayList<Animal>();

    @FXML
    void initialize() {
        perfectAnimals.add(new Animal("Cat", 100.0, "perfect creature"));
        perfectAnimals.add(new Animal("Dog", 200.0, "friendly animal"));
        perfectAnimals.add(new Animal("Fox", 300.0, "fur-fur animal"));
        perfectAnimals.add(new Animal("Raссoon", 300.0, "he play Rocket"));
        perfectAnimals.add(new Animal("Tiger", 1000.0, "do not buy this animal"));
        perfectAnimals.add(new Animal("Penguin", 250.0, "like fish"));

        FillAnimals();
    }

    public void initialize(URL location, ResourceBundle resources) {

    }

    public void menuAddSellerShow(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/AddSellerFXML.fxml"));
        Scene scene = new Scene(root);
        Stage secondStage = new Stage();
        Stage mainStage = (Stage) ButtonBuy1.getScene().getWindow();
        secondStage.setScene(scene);
        secondStage.initOwner(mainStage);
        secondStage.initModality(Modality.WINDOW_MODAL);
        secondStage.setWidth(750);
        secondStage.setHeight(500);
        secondStage.setTitle("Add Seller");
        secondStage.show();
    }

    public void btnBuyAnimal(ActionEvent actionEvent) {
        Button temp = (Button)actionEvent.getSource();

        switch (temp.getId()) {
            case "ButtonBuy1": {
                break;
            }
            case "ButtonBuy2": {
                break;
            }
            case "ButtonBuy3": {
                break;
            }
            case "ButtonBuy4": {
                break;
            }
            case "ButtonBuy5": {
                break;
            }
            case "ButtonBuy6": {
                break;
            }
        }
    }

    private void FillAnimals() {
        TextName1.setText(perfectAnimals.get(0).getName());
        textPrice1.setText(perfectAnimals.get(0).getPrice().toString());
        TextName2.setText(perfectAnimals.get(1).getName());
        textPrice2.setText(perfectAnimals.get(1).getPrice().toString());
        TextName3.setText(perfectAnimals.get(2).getName());
        textPrice3.setText(perfectAnimals.get(2).getPrice().toString());
        TextName4.setText(perfectAnimals.get(3).getName());
        textPrice4.setText(perfectAnimals.get(3).getPrice().toString());
        TextName5.setText(perfectAnimals.get(4).getName());
        textPrice5.setText(perfectAnimals.get(4).getPrice().toString());
        TextName6.setText(perfectAnimals.get(5).getName());
        textPrice6.setText(perfectAnimals.get(5).getPrice().toString());
    }
}
