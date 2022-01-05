// Jonatan Meyer Brute-Force Attack opgave.
package com.company;

import java.util.Arrays;
import java.util.Random;


public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        int a = rand.nextInt(9);

        rand = new Random();
        int b = rand.nextInt(9);

        rand = new Random();
        int c = rand.nextInt(9);

        rand = new Random();
        int d = rand.nextInt(9);
        // I det ovenstående kode giver jeg de fire variabler a,b,c,d en tilfældig værdi mellem 0 og 9.

        int[] kode = {a, b, c, d};
        // Her laver jeg et array med fire variabler med de tilfældige værdier.

        int x = 0;

       /* for (int element : kode) {

            System.out.print(element);
        } I dette ovenstående kode, som jeg har kommenteret ud, brugte jeg til at se hvad den rigtige kode var. */

        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        // Her har jeg de variabler som jeg kommmer til at bruge i mit while loop, de starter alle på 0, så de kan stige, ved hvert gæt på koden.

        while (x == 0) {
            int[] kode1 = {e, f, g, h};
            if (Arrays.equals(kode, kode1)) {

                System.out.println("THIS IS THE RIGHT CODE");
                x = 1;
            } else {

                System.out.println("This is not the right code :(");


            }
            /* I det ovenstående kode laver jeg et array med de fire variabler e,f,g,h, som jeg så derefter sammenligner
             med resultatet fra det første array, og printer de løbende resultater til konsolen. Hvis de to arrays ikke
             er det samme, printer den tallet, og så at det ikke er det samme, men hvis det derimod er det samme, printes
             den 4-cifrede kode, samt at det er den rigtige kode.
             */

            e++;
            if (e == 10) {

                e = 0;
                f++;
            }
            if (f == 10) {
                f = 0;
                g++;
            }

            if (g == 10) {
                g = 0;
                h++;
            }

            if (h == 10) {
                h = 0;
                x = 1;

            }
            // I de ovenstående 4 if statements for jeg henholdsvis et variablerne til at stige med 1, når et af variablerne rammer 10, bliver de 0 og så stiger den næste variabel med 1.

            for (int element : kode1) {

                System.out.print(element);
            }
            System.out.println("");


        }


    }
}
