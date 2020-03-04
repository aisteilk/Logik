package edu.campus02;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean dieSonneScheint;
        boolean esRegnet;

        dieSonneScheint = true;
        esRegnet = false;

        boolean ergebnis;

        ergebnis = dieSonneScheint && esRegnet;
        System.out.println("Die Sonne scheint UND es regnet: " + ergebnis );

        boolean dasBeispielVerwirrtmich;
        boolean ichKenneMichAus;

        dasBeispielVerwirrtmich = true;
        ichKenneMichAus = true;


        ergebnis = dasBeispielVerwirrtmich || ichKenneMichAus;

        System.out.println("das Beispiel verwirrt mich ODER ich kenne mich aus: " + ergebnis);

        //Bsp 3: (1 > 3 UND (NICHT 3-1 < 5)) ODER 2 == 4*4
        //       (1 > 3 && (!= 3-1 < 5)) || 2 == 4*4

        boolean teil1;
        boolean teil2;
        boolean ergebnis3;

        teil2 = 2==4;
        teil1 = 1>3 && !(3-1 < 5);

        ergebnis3 = (1>3 && !(3-1<5))|| 2 == 4;
        System.out.println(ergebnis3);

        // Bsp 4 (6 >= 2*3 || 2-3 < 0) && ( 1*1 == 1 && 1 != 1+1)

        teil1 = 6 >= 2*3 || 2-3 < 0;
        teil2 = 1*1 == 1 && 1 != 1+1;
        boolean ergebnis4;

        ergebnis4 = teil1 && teil2;

        System.out.println(ergebnis4);

    }
}
