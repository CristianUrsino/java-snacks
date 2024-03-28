package org.learning.snack3;
//imports
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Snack3 {
    // Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari
    public static void main(String[] args) {
        //definisco lo scanner e il generatore di numeri random
        Random randomGenerator = new Random();
        Scanner scanner = new Scanner(System.in);
        //dichiaro alcune variabili
        int total = 0;
        //dichiaro e inizializzo in input la grandezza dell'array
        System.out.print("Please enter as how many numbers as you want: ");
        int sizeArrayNumbers = Integer.parseInt(scanner.nextLine());
        //dichiaro l'array dei numeri
        int[] numbers = new int[sizeArrayNumbers];
        //riempio l'array con numeri casuali
        for (int i = 0; i < sizeArrayNumbers; i++) {
            numbers[i] = randomGenerator.nextInt(101);
        }
        //output dell'array generato
        System.out.println("\nlist of numbers: ");
        for (int i = 0; i < sizeArrayNumbers; i++) {
            if (i % 10 == 0){
                //torno a capo ogni 5 elementi stampati
                System.out.print("\n");
            }
            System.out.print(numbers[i] + " - ");
        }
        for (int i = 1; i < sizeArrayNumbers; i = i + 2) {
            //sommo al totale solo le posizioni dispari (quindi parto da i=1 e inclemento sempre di 2)
            total += numbers[i];
        }
        //output finale
        System.out.println("\nthe sum of numer in odd pesitions: " + total);
        //chiudo lo scanner
        scanner.close();
    }
}
