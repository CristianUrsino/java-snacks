package org.learning.snack2;
//imports
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Snack2 {
    //Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi,
    // e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
    public static void main(String[] args) {
        //definisco lo scanner e il generatore di numeri random
        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();
        //definisco le costanti
        final String[] names = {
                "Mario",
                "Marco",
                "Paolo",
                "antonio",
                "Francesco",
                "Lorenzo"
        };
        final String[] lastNames = {
                "Rossi",
                "Bianchi",
                "Neri",
                "Verdi",
                "Gialli",
                "Marroni"
        };
        //dichiaro e inizializzo la grandezza del nuovo array
        System.out.print("Please enter as many names as you want: ");
        int sizeFakeNames = Integer.parseInt(scanner.nextLine());
        //dichiaro il nuovo array
        String[] fakeNames = new String[sizeFakeNames];
        //riempio il nuovo array con i nomi e cognomi random
        for (int i = 0; i < sizeFakeNames; i++) {
            //prendo un nome e cognome casualmente dalla lista
            String currentName = names[randomGenerator.nextInt(names.length)];
            String currentLastName = lastNames[randomGenerator.nextInt(names.length)];
            //unisco il nome e cognome presi nella giusta posizione del nuovo array
            fakeNames[i] = currentName + " " + currentLastName;
        }
        //output finale
        System.out.println("\nNomi generati: ");
        for (int i = 0; i < sizeFakeNames; i++) {
            if (i % 5 == 0){
                //torno a capo ogni 5 elementi stampati
                System.out.print("\n");
            }
            System.out.print(fakeNames[i] + " - ");
        }
    }
}
