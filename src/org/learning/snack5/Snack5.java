package org.learning.snack5;
//imports
import java.util.Scanner;
public class Snack5 {
    //Data una stringa in input mostrare a video quanti caratteri alfabetici contiene,
    // quanti numeri e quanti simboli non alfanumerici.
    public static void main(String[] args) {
        //definisco lo scanner
        Scanner scanner = new Scanner(System.in);
        //dichiaro e inizializzo le variabili
        int characters = 0, numbers = 0, symbols = 0;
        //dichiaro e inizializzo la stringa
        String inputString;
        do {
            //ciclo finchè non viene inserita più di una lettera
            System.out.print("please enter the string: ");
            inputString = scanner.nextLine();
            if(inputString.isEmpty()){
                //se vuota mando output errore
                System.out.println("Errore, the string is empty, please try again");
            }
        }while(inputString.isEmpty());
        //ciclo i caratteri della stringa e incremento le variabili
        for (int i = 0; i < inputString.length(); i++) {
            if(Character.isAlphabetic(inputString.charAt(i))){
                //se il seguente carattere è un carattere alfabetico
                characters++;
            }else if(Character.isDigit(inputString.charAt(i))){
                //se il seguente carattere è un numero
                numbers++;
            }else{
                //se non è un numero o un carattere alfanumerico è un simbolo speciale
                symbols++;
            }
        }
        //input finale
        System.out.println(
                "\n the string contains " + characters + " alphabetical characters" +
                "\n the string contains " +  + numbers + " numbers" +
                        "\n the string contains " +  + symbols + " special characters");
        //chiudo lo scanner
        scanner.close();
    }
}
