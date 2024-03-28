package org.learning.snack1;

//imports
import java.util.Scanner;

public class Snack1 {
    //Chiedi all’utente di continuare ad inserire un numero pari compreso tra 10 e 20.
    // Se il numero non corrisponde alla richiesta continuare a chiederlo fino a che non viene inserito un numero valido.
    public static void main(String[] args) {
        //definisco scanner
        Scanner scanner = new Scanner(System.in);
        //definisco le costanti
        final int MIN_NUMBER = 10;
        final int MAX_NUMBER = 20;
        //dichiaro le variabili
        int inputNumber;
        do{
            //ciclo finchè il numero inserito non è pari e compreso tra MAX e MIN NUMBER
            try{
                System.out.print("Please insert a even number between " + MIN_NUMBER + " and " + MAX_NUMBER + ": ");
                inputNumber = Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                //se l'input non è un numero, faccio si che dia l'errore e che continui il ciclo
                inputNumber = 1;
            }
            if (inputNumber < MIN_NUMBER || inputNumber > MAX_NUMBER || inputNumber % 2 == 1){
                //se non è pari e compreso stampo output dell'errore
                System.out.println("number is not integer even number between " + MIN_NUMBER + " and " + MAX_NUMBER + ". Please try again ");
            }
        }while(inputNumber < MIN_NUMBER || inputNumber > MAX_NUMBER || inputNumber % 2 == 1);
        //output finale
        System.out.println("thank you");
        //chiudo lo scanner
        scanner.close();
    }
}
