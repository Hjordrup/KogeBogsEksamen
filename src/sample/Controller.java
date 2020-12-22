package sample;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextArea ingrediensView;

    @FXML
    private TextArea fremgangsmaadeView;

    @FXML
    private Label opskriftNavn;

    @FXML
    private Button indlaesKnap;



    ArrayList<Opskrift> opskriftList= new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//  Oprettede en opskrift ved navn te
        Opskrift te = new Opskrift("Te","Put TeBrev i kogenden vand og lad trække i 4 minutter tilføj tilsidst lidt citron",10,5);

        //  Oprettde ingredienser
        Ingrediens sukker = new Ingrediens("Sukker " , 900 );
        Ingrediens vand = new Ingrediens("Vand " ,0);
        Ingrediens citron = new Ingrediens("Citron ",10);
        Ingrediens teBrev = new Ingrediens("Te",10);

        // Tilføjet ingredienser til te opskrift.
        te.addIngrediens(sukker);
        te.addIngrediens(vand);
        te.addIngrediens(citron);
        te.addIngrediens(teBrev);

        opskriftList.add(te);
        fremgangsmaadeView.setWrapText(true);
    }


    public void startIndlaes(){
    opskriftNavn.setText(opskriftList.get(0).getNavn());
        for (int i = 0; i < opskriftList.get(0).getIngredienser().size(); i++) {
            ingrediensView.appendText(opskriftList.get(0).getIngredienser().get(i).getNavn());
            ingrediensView.appendText("\n");
        }
    fremgangsmaadeView.setText(opskriftList.get(0).getFremgangsmaade());

    }








}
