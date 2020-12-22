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
        glasur.addIngrediens(flormelis);
        glasur.addIngrediens(vand);
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
        if(citron.rigPaaKalorier()){
            System.out.println("Citron er rig på kallorie ");
        }else System.out.println("Citron er ikke rig på kalorie");
        if(sukker.rigPaaKalorier()){
            System.out.println("Sukker er rig på kallorie ");
        }else System.out.println("Sukker er ikke rig på kalorie");
        blankLinje();
        IngrediensMedNaeringsdetaljer citronMedDetaljer = new IngrediensMedNaeringsdetaljer("Citron",5,200,0,0);
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

