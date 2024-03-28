package org.learning.snack4;
//imports
import java.util.Locale;
import java.util.Scanner;
public class Snack4 {
    //Data in input una stringa verificare se è palindroma
    public static void main(String[] args) {
        //dichiaro lo scanner
        Scanner scanner = new Scanner(System.in);
        //dichiaro e inizializzo la stringa in input
        String inputString;
        do {
            //ciclo finchè non viene inserita più di una lettera
            System.out.print("Please enter the string: ");
            inputString = scanner.nextLine();
            if(inputString.length() < 2){
                //se ci sono meno di 2 lettere
                System.out.println("Errore, the string has less than 2 characters, please try again");
            }
        }while(inputString.length() < 2);
        //formatto la stringa eliminando spazi e maiuscole
        inputString = inputString.toLowerCase();
        inputString = inputString.replaceAll(" ", "");
        //dichiaro gli indici e la flag
        int i = 0;
        int j = inputString.length()-1;
        boolean isPalindrome = true;
        //ciclo l'array e verifico che ogni lettera sia uguale se letta al contrario
        while(i<inputString.length() && isPalindrome){
            if(inputString.charAt(i) != inputString.charAt(j)) isPalindrome = false;
            j--;
            i++;
        }
        if(isPalindrome){
            //output finale positivo
            System.out.println("the string is palindrome");
        }else {
            //output finale negativo
            System.out.println("the string is not palindrome");
        }
        //chiudo lo scanner
        scanner.close();
    }
    //ELIMINARE SPAZI E MAIUSCOLE NELLA ARRAY IN INPUT
}
