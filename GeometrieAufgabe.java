
//------------------Class Geometrie Schablone definieren------------------//

import java.util.Random;

class Geometrie {
    String name;
    int breite;
    int hoehe;
    int masse;
    int radius;

//-----------------NON-STATIC METHOD dimensionen ändern-------------------//

    void dimension(int newBreite, int newHoehe){
        breite=newBreite;
        hoehe=newHoehe;
    }
}


public class GeometrieAufgabe {

    public static void main(String[] args) {

//------------------------RECHTECK Objekt erstellen______________________________//

        Geometrie rechteck = new Geometrie();
        rechteck.name = "Rechteck";
        rechteck.breite = (int)Math.floor(Math.random() * (20 - 1 + 1) + 1);
        rechteck.hoehe = 3;
        rechteck.masse = rechteck.hoehe * rechteck.breite;
        rechtecke100(rechteck);


//-------------------------KREIS Objekt erstellen-----------------------------//

        Geometrie kreis = new Geometrie();
        kreis.name = "Kreis";
        kreis.radius = 5;

        System.out.println(kreis.name + ". R = " + kreis.radius);
    }
//----------------------100 Rechteck print-------------------------------------------//

    static void rechtecke100(Geometrie g) {
        Random rand = new Random();
        int max=20;
        int min=1;

        for (int i = 1; i <= 100; i++) {
            g.breite = rand.nextInt(max- min + 1) + min;
            g.hoehe = rand.nextInt(max- min + 1) + min;
            System.out.println(i + ". " + g.name + " (" + g.breite + " X " + g.hoehe + ")");
        }

 //--------------------Aufruf STATIC METHOD Dimension verändern-------------------------//

   // dimensionStatic(34,56);
    }

    static void dimensionStatic(Geometrie r, int x, int y){
        r.breite= x;
        r.hoehe=y;


    }
}


