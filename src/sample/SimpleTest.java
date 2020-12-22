package sample;

public class SimpleTest {


    //Variabler
    public Opskrift glasurOpskrift;
    public Opskrift teOpskrift;

    // Main metode.
    public static void main(String[] args) {
        // print til consol gennem sout metoden.
        System.out.println("Velkommen til min opskrifts-applikations-dummy");

        //EKSEMPEL på blankLinje metode der laver et linjeskift.
        blankLinje();

        // EKSEMPEL på opskrift constructoren der skaber et opskrift objekt.
        Opskrift glasur = new Opskrift("Glasur", "Bland vand og flormelis",4,2);

        // EKSEMPEL på Indrediens constructroren der skaber en ingrediens
        Ingrediens flormelis = new Ingrediens("Flormelis" , 100 );


        Ingrediens vand = new Ingrediens("Vand",0);
        blankLinje();
        Opskrift te = new Opskrift("Te","Put TeBrev i kogenden vand og lad trække i 4 minutter tilføj tilsidst lidt citron",0,5);
        Ingrediens tebrev = new Ingrediens("Tebrev ", 10);
        Ingrediens kogendeVand = new Ingrediens("Vand ",0);
        Ingrediens citron = new Ingrediens("Citron ", 5);
        Ingrediens sukker = new Ingrediens("Sukker",900);
        blankLinje();
        System.out.println("******************");
        System.out.println("**Viser opskrift**");
        System.out.println("******************");
        blankLinje();

        //EKSEMPEL på addIngrediens metoden der tilføjer en ingrediens til en opskrift.
        glasur.addIngrediens(flormelis);
        glasur.addIngrediens(vand);

        //EKSEMPEL på visFremgangsmaade metoden der udskriver fremgangsmåden der er specifiseret en ved oprettelse af opskriften.
        glasur.visFremgangsmaade();
        te.addIngrediens(tebrev);
        te.addIngrediens(kogendeVand);
        te.addIngrediens(citron);
        te.addIngrediens(sukker);
        glasur.visIngredienser();
        te.visIngredienser();
        te.visFremgangsmaade();
        blankLinje();
        System.out.println("********************");
        System.out.println("**KalorieBeregning**");
        System.out.println("********************");
        blankLinje();

        //EKSEMPEL på rifPaaKalorier medtoden der retunere true eller false alt efter om en ingrediense har over eller under 100 kalorier.
        if(citron.rigPaaKalorier()){
            System.out.println("Citron er rig på kallorie ");
        }else System.out.println("Citron er ikke rig på kalorie");
        if(sukker.rigPaaKalorier()){
            System.out.println("Sukker er rig på kallorie ");
        }else System.out.println("Sukker er ikke rig på kalorie");
        blankLinje();

        // EKSEMPEL på IngrediensMedNaeringsdetaljer constructor der nedarver variabler fra dens super klasse.
        IngrediensMedNaeringsdetaljer citronMedDetaljer = new IngrediensMedNaeringsdetaljer("Citron",5,200,0,0);

        //EKSEMPEL på godModForkoeelse metoden der fortæller om en ingrediens er god mod forkøelse.
        if (citronMedDetaljer.godModForkoeelse()){
            System.out.println("Citron er god mod forkøelse.");
        }else System.out.println("Citron er ikke god mod forkøelse");
        blankLinje();
        IngrediensMedNaeringsdetaljer poelse = new IngrediensMedNaeringsdetaljer("Pølse ", 300,0,10,15);
        if (poelse.godModForkoeelse()){
            System.out.println("Pølse er god mod forkøelse.");
        }else System.out.println("Pølse er ikke god mod forkøelse");
        blankLinje();
        System.out.println("Ingrediens vand indenholder " + vand.kalorieriAlt() + " kalorier. ");
        System.out.println("Opskriften Te indenholder " + te.kalorieriAlt() + " kalorier i alt ");
        blankLinje();
        System.out.println("opskriften indeholder " + te.kalorieriAlt() + " og " + te.kalorierPerPotion() + " per potion ");





    }











    // Opgave 2 hjælpe Metode til at vise blanke linjer

    public static void blankLinje(){
        System.out.println(" ");
    }


    // Metode til at oprette opskrifter
    public void opretOpskrifter(){


    }











}

