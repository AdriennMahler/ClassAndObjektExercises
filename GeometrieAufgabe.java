
//------------------Class Rechteck----------------------------------------//

import java.util.Random;

class Rechteck {
    String name;
    int breite;
    int hoehe;
    int masse;


//-----------------NON-STATIC METHOD dimensionen ändern-------------------//

    void dimension(int newBreite, int newHoehe){
        breite=newBreite;
        hoehe=newHoehe;
    }
}
//------------------Class Kreis----------------------------------------//

class Kreis {
    String name;
    int radius;
}

public class GeometrieAufgabe {

    public static void main(String[] args) {

//------------------------RECHTECK Objekt erstellen______________________________//

        Rechteck r = new Rechteck();
        r.name = "Rechteck";
        r.breite = (int) Math.floor(Math.random() * (20 - 1 + 1) + 1);
        r.hoehe = 3;
        r.masse = r.hoehe * r.breite;

//------------------------Kreis Objekt erstellen______________________________//

        Kreis kreis = new Kreis();
        kreis.name = "Kreis";
        kreis.radius = 5;

        System.out.println(kreis.name + ". R = " + kreis.radius);

//------------------------Static Method - Dimensionen verändern aufrufen______________________________//

        dimensionStatic(r, 34, 56);
    }

    static void dimensionStatic (Rechteck r, int x, int y){
            r.breite = x;
            r.hoehe = y;
        }
//-------------------------------100 Rechteck print---------------------------------------------//

    static void rechtecke100(Rechteck r){
        Random rand = new Random();
        int max = 20;
        int min = 1;

        for (int i = 1; i <= 100; i++) {
            r.breite = rand.nextInt(max - min + 1) + min;
            r.hoehe = rand.nextInt(max - min + 1) + min;
            System.out.println(i + ". " + r.name + " (" + r.breite + " X " + r.hoehe + ")");
        }

    }
}



