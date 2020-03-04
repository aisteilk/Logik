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


        ergebnis = dasBeispielVerwirrtmich && ichKenneMichAus;

        System.out.println("das Beispiel verwirrt mich UND ich kenne mich aus: " + ergebnis);
    }
}
