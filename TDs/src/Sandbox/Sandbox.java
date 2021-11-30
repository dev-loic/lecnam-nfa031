package Sandbox;

import java.util.Arrays;
import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nbLetters = 5;
        char [] myArray = new char[nbLetters];

        for (int i = 0; i < nbLetters; i++) {
            System.out.print("Lettre #" + (i+1) + " : ");
            myArray[i] = sc.nextLine().charAt(0);
        }

        int nbUppercased = 0, nbLowercased = 0;
        for (int i = 0; i < myArray.length; i++) {
            if(Character.isUpperCase(myArray[i])) {
                nbUppercased++;
            } else if (Character.isLowerCase(myArray[i])) {
                nbLowercased++;
            }
        }

        System.out.println("Nb majuscules : " + nbUppercased);
        System.out.println("Nb minuscules : " + nbLowercased);


        sc.close();
    }
}
