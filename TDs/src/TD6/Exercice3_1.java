package TD6;

import java.util.Scanner;

public class Exercice3_1 {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		char [] tab = new char[10];
		int countLetter=0, countMaj=0;
		
		for (int i=0;i<10;i++) {
			System.out.print("Saisissez un caractère : ");
			tab[i]=sc.nextLine().charAt(0);
		}
		
		// On affiche le tableau et on en profite pour calculer le nb de maj et de lettres
		System.out.println("Le tableau saisi est le suivant : ");
		for (int i=0;i<10;i++) {
			System.out.print(tab[i]+" | ");
			if (('a'<=tab[i] && 'z'>=tab[i]) || ('A'<=tab[i] && 'Z'>=tab[i])) {
				countLetter++;
			}
			if ('A'<=tab[i] && 'Z'>=tab[i]) { 
				countMaj++;
			}
		}		
		System.out.println("\nIl y a " + countLetter + " lettres dans ce tableau.");
		System.out.println("Dont " + countMaj + " majuscules.");
		sc.close();
	}
	
}
