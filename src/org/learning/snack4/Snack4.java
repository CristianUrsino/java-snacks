package org.learning.snack4;
//imports
import java.util.Scanner;
public class Snack4 {
    //Data in input una stringa verificare se è palindroma
    public static void main(String[] args) {
        //dichiaro lo scanner
        Scanner scanner = new Scanner(System.in);
        //dichiaro e inizializzo la stringa in input
        System.out.print("Please enter the string: ");
        String inputString = scanner.nextLine();
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
        if (isPalindrome) System.out.println("ok");
        else System.out.println("no");
        //chiudo lo scanner
        scanner.close();
    }
    //ELIMINARE SPAZI NELLA ARRAY IN INPUT
}
