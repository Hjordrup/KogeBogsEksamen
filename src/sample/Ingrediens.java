package sample;

public class Ingrediens implements KalorierBeregner{

    // Eksemple på instants variabler.
    private String navn;
    private int kalorie;

    //Constructor


    public Ingrediens(String navn, int kalorie) {
        this.navn = navn;
        this.kalorie = kalorie;
        System.out.println("Ingrediens er oprettet: " + navn );
    }


    //rig på kalorier metode
    public boolean rigPaaKalorier(){
        if(kalorie <100){
            return false;
        }
        return true;
    }





    // Getters og Setters
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


    @Override
    public int kalorieriAlt() {
        return kalorie;
    }
}
