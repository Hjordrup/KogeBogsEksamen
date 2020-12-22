package sample;

import java.util.ArrayList;

public class Opskrift {

    private String navn;
    private String fremgangsmaade;
    private int antalPortioner;
    private int tilberedningstid;
    private ArrayList<Ingrediens> ingredienser;

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
