package TD;

import java.net.URL;
import java.util.Calendar;
import java.util.ResourceBundle;

import SK.Seller;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class XMLFormControllerCheck {

    //ми знаєм, що то не файно, але ми виживали як могли
    public static Animal animal = new Animal();
    public static Seller seller = new Seller();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label SellerName;

    @FXML
    private Label AnimalName;

    @FXML
    private Label AnimalPrice;

    @FXML
    private Label Date;

    @FXML
    private Label Deskription;

    @FXML
    void initialize() {
        SellerName.setText(seller.getLogin());
        AnimalName.setText(animal.getName());
        AnimalPrice.setText(animal.getPrice().toString());
        Deskription.setText(animal.getDescription());
        Date.setText(String.format("%tD %tT", Calendar.getInstance().getTime(), Calendar.getInstance().getTime()));
    }

    public void initialize(URL location, ResourceBundle resources) {

    }

}
