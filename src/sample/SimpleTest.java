package sample;

public class SimpleTest {


    //Variabler
    public Opskrift glasurOpskrift;
    public Opskrift teOpskrift;

    // Opgave 1 SimpleTest
    public static void main(String[] args) {
        // print til consol gennem sout metoden.
        System.out.println("Velkommen til min opskrifts-applikations-dummy");
        blankLinje();
        Opskrift glasur = new Opskrift("Glasur", "Bland vand og flormelis",4,2);
        Ingrediens flormelis = new Ingrediens("Flormelis" , 100 );
        Ingrediens vand = new Ingrediens("Vand",0);
        blankLinje();
        Opskrift te = new Opskrift("Te","Put TeBrev i kogenden vand og lad trække i 4 minutter tilføj tilsidst lidt citron",1,5);
        Ingrediens tebrev = new Ingrediens("Tebrev ", 10);
        Ingrediens kogendeVand = new Ingrediens("Vand ",0);
        Ingrediens citron = new Ingrediens("Citron ", 5);
    }


    // Opgave 2 hjælpe Metode til at vise blanke linjer

    public static void blankLinje(){
        System.out.println(" ");
    }


    // Metode til at oprette opskrifter
    public void opretOpskrifter(){


    }











}

