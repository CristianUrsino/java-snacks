package org.learning.snack6;
//imports
import java.util.Scanner;
public class Snack6 {
    public static void main(String[] args) {
        //dichiaro lo scanner
        Scanner scanner = new Scanner(System.in);
        //definisco le variabili
        double hours = 0, minutes = 0, seconds = 0;
        int totalSeconds;
        //inizializzo totalSeconds
        System.out.print("Please enter the seconds: ");
        totalSeconds = Integer.parseInt(scanner.nextLine());
        //calcolo i minuti
        minutes = totalSeconds / 60;
        seconds = totalSeconds % 60;
        //formatto i secondi
        String formatSeconds = String.format("%02d", (int)seconds);
        if(minutes < 1 ){
            //se meno di un minuto sono presenti solo secondi
            System.out.println("times calculated: " + "00.00." + formatSeconds);
        }
        //calcolo le ore e ricalcolo i minuti
        hours = minutes / 60;
        minutes = minutes % 60;
        //formatto i minuti
        String formatMinutes = String.format("%02d", (int)minutes);
        if(hours<1  && minutes > 1){
            //se meno di un'ora sono presenti solo i minuti e i secondi
            System.out.println("times calculated: " + "00." + formatMinutes + "." + formatSeconds);
        }
        //formatto le ore
        String formatHours = String.format("%02d", (int)hours);
        if(hours>1){
            System.out.println("times calculated: " + formatHours + "." + formatMinutes + "." + formatSeconds);
        }
    }
}
