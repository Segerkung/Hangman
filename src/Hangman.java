import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String guesses [] = {
                "fotboll", "snapchat", "skola", "manchester united", "premier league",
                "NTI", "counterstrike", "team liquid", "conor mcgregor", "soffa"};

        boolean NuSpelarVi = true;
        while (NuSpelarVi)
            System.out.println("Nu börjar spelet");
        int randomNummer = random.nextInt(guesses.length); //random.nextInt(11); ?
        char gissarandomord [] = guesses[randomNummer].toCharArray();
        int gissningar = gissarandomord.length; //totala gissningar
        char spelarGissningar [] = new char[gissningar];

        for (int i=0; i< spelarGissningar.length; i++) {
            spelarGissningar[i] = '_';
            }

        boolean Gissat = false;
        int försök = 0;
        while(NuSpelarVi){
            System.out.println("Nu börjar spelet");
            int randomNummer = random.nextInt(guesses.length);
            char gissarandomord [] = guesses[randomNummer].toCharArray(); //för någon anledning funkar inte min int nu.

        }
        }
    }



