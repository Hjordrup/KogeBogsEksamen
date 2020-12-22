package sample;

public class IngrediensMedNaeringsdetaljer extends Ingrediens{


    // EKSEMPEL på Instansvariabler
    public int cVitamin;
    public int magnesium;
    public int kalk;

    // Constructor
    public IngrediensMedNaeringsdetaljer(String navn, int kalorie, int cVitamin, int magnesium, int kalk) {
        super(navn, kalorie);
        this.cVitamin = cVitamin;
        this.magnesium = magnesium;
        this.kalk = kalk;
    }

    // Valgte ikke at bruge ø i mit metode navn da dette ikke er god stil.
    // Metode der tjekker om et produkt er god mod forkøelse
    public boolean godModForkoeelse(){
        return this.cVitamin > 5;
    }

}
