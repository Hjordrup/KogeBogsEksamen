package sample;

public class Ingrediens implements KalorierBeregner{

    // Eksemple på instants variabler.
    private String navn;
    private int kalorie;
    private Diet diet;


    //EKSEMPEL på Constructor
    public Ingrediens(String navn, int kalorie) {
        this.navn = navn;
        this.kalorie = kalorie;
        System.out.println("Ingrediens er oprettet: " + navn );
    }


    //EKSEMPEL på en metode der retunere om et produkt er rig på kalorier
    public boolean rigPaaKalorier(){
        if(kalorie <100){
            return false;
        }
        return true;
    }

    //EKSEMPEL på metode der retunere kalorie indenhold for en ingrediens
    @Override
    public int kalorieriAlt() {
        return kalorie;
    }




    // Getters og Setters for klassens private variabler.
    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getKalorie() {
        return kalorie;
    }

    public void setKalorie(int kalorie) {
        this.kalorie = kalorie;
    }

}
