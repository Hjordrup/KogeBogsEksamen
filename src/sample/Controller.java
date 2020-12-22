package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller implements Initializable {
    @FXML
    private Label dietLabel;
    @FXML
    private TextArea ingrediensView;
    @FXML
    private TextArea fremgangsmaadeView;
    @FXML
    private Label opskriftNavn;


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
        fremgangsmaadeView.setWrapText(true);
        opskriftList.add(te);

    }

    // Denne metode sætter felterne i gui til den rette information.
    public void startIndlaes(){
    opskriftNavn.setText(opskriftList.get(0).getNavn());
        for (int i = 0; i < opskriftList.get(0).getIngredienser().size(); i++) {
            ingrediensView.appendText(opskriftList.get(0).getIngredienser().get(i).getNavn());
            ingrediensView.appendText("\n");
        }
    fremgangsmaadeView.setText(opskriftList.get(0).getFremgangsmaade());

    }


    // Denne metode skaber en fill der indenholder alt information omkring den første opskrift i listen.
    public void saveOpskrift(ActionEvent event) {

        java.io.File file = new java.io.File("src/persistence/saveFile.txt");
        try{

            java.io.PrintWriter output = new java.io.PrintWriter(file);
            output.print(opskriftList.get(0).getNavn());
            output.println("");
            output.print(opskriftList.get(0).getFremgangsmaade());
            output.println("");
            output.print(opskriftList.get(0).getTilberedningstid());
            output.println("");
            output.print(opskriftList.get(0).getAntalPortioner());
            output.println("");
            for (int i = 0; i < opskriftList.get(0).getIngredienser().size(); i++) {
                output.print(opskriftList.get(0).getIngredienser().get(i).getNavn());
                output.print(" ");
                output.print(opskriftList.get(0).getIngredienser().get(i).getKalorie());
                output.println("");
            }

            output.close();
            System.out.println("The file has been saved");


        }catch (Exception e ){
            System.out.println("Filen blev ikke gemt");
        }

    }



    public void koed(){

        for (int i = 0; i < opskriftList.get(0).getIngredienser().size(); i++) {

            if(opskriftList.get(0).getIngredienser().get(i).getDiet() == Diet.KØD){
                dietLabel.setText("Denne opskrift indenholder Kød");

            }dietLabel.setText("Nej denne opskrift indenholder ikke Kød");
        }



    }












}
