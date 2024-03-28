package org.learning.snack1;

//imports
import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        //definisco scanner
        Scanner scanner = new Scanner(System.in);
        //definisco le costanti
        final int MIN_NUMBER = 10;
        final int MAX_NUMBER = 20;
        //dichiaro le variabili
        int inputNumber;
        do{
            //ciclo finchè il numero inserito non è compreso tra MAX e MIN NUMBER
            System.out.print("Please insert a number between " + MIN_NUMBER + " and " + MAX_NUMBER + ": ");
            inputNumber = scanner.nextInt();
            if (inputNumber < MIN_NUMBER || inputNumber > MAX_NUMBER){
                //se non è compreso stampo output dell'errore
                System.out.println("number is not between " + MIN_NUMBER + " and " + MAX_NUMBER + ". Please try again ");
            }
        }while(inputNumber < MIN_NUMBER || inputNumber > MAX_NUMBER);
        //output finale
        System.out.println("thank you");
    }
}
