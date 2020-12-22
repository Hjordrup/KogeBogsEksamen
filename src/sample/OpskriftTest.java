package sample;

import static org.junit.jupiter.api.Assertions.*;

class OpskriftTest {

    @org.junit.jupiter.api.Test
    void kalorierPerPotion() {
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

        //EKSEMPEL brugt assertEqual til at tjekke om min netode virker.
        assertEquals(92,te.kalorierPerPotion());


    }

    @org.junit.jupiter.api.Test
    void kalorieriAlt() {
        // Oprettede en opskrift ved navn te
        Opskrift te = new Opskrift("Te","Put TeBrev i kogenden vand og lad trække i 4 minutter tilføj tilsidst lidt citron",10,5);

        // Oprettde ingredienser
        Ingrediens sukker = new Ingrediens("Sukker " , 900 );
        Ingrediens vand = new Ingrediens("Vand " ,0);
        Ingrediens citron = new Ingrediens("Citron ",10);
        Ingrediens teBrev = new Ingrediens("Te",10);

        // Tilføjet ingredienser til te opskrift.
        te.addIngrediens(sukker);
        te.addIngrediens(vand);
        te.addIngrediens(citron);
        te.addIngrediens(teBrev);

        //EKSEMPEL brugt assertEqual til at tjekke om min netode virker.
        assertEquals(920,te.kalorieriAlt());
    }
}