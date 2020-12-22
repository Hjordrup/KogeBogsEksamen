package sample;

import java.util.ArrayList;

public class Opskrift {

    private String navn;
    private String fremgangsmaade;
    private int antalPortioner;
    private int tilberedningstid;
    private ArrayList<Ingrediens> ingredienser = new ArrayList<>();

    //Constructor
    public Opskrift() {
        System.out.println("Opskrift er oprettet: ");
    }

    public Opskrift(String navn, String fremgangsmaade, int antalPortioner, int tilberedningstid) {
        this.navn = navn;
        this.fremgangsmaade = fremgangsmaade;
        this.antalPortioner = antalPortioner;
        this.tilberedningstid = tilberedningstid;
        System.out.println("Opskrift er oprettet: " + navn);
    }

    //addIngrediens metoder:

    public void addIngrediens(Ingrediens ingrediens){
        ingredienser.add(ingrediens);
    }

    public void addIngrediens(String navn, int kalorie ){
        ingredienser.add(new Ingrediens("Vand ",0));
    }


    //visIngredienser metode

    public void visIngredienser(){
        System.out.println("Du skal til " + getNavn() + " Bruge ");
        for (Ingrediens i : ingredienser){

            System.out.print("- ");
            System.out.println(i.getNavn());
        }


    }


    // visFremgangsmaade metode
    public void visFremgangsmaade(){

        System.out.println("Opskriften for glasur: ");
        System.out.println(" - " + this.fremgangsmaade);
    }






    // Getters og Setters
    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getFremgangsmaade() {
        return fremgangsmaade;
    }

    public void setFremgangsmaade(String fremgangsmaade) {
        this.fremgangsmaade = fremgangsmaade;
    }

    public int getAntalPortioner() {
        return antalPortioner;
    }

    public void setAntalPortioner(int antalPortioner) {
        this.antalPortioner = antalPortioner;
    }

    public int getTilberedningstid() {
        return tilberedningstid;
    }

    public void setTilberedningstid(int tilberedningstid) {
        this.tilberedningstid = tilberedningstid;
    }

    public ArrayList<Ingrediens> getIngredienser() {
        return ingredienser;
    }

    public void setIngredienser(ArrayList<Ingrediens> ingredienser) {
        this.ingredienser = ingredienser;
    }
}
