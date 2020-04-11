package TD6;

import java.util.Scanner;

public class Exercice2_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] tab = new int[6];
		double somme = 0.0, moyenne = 0.0;

		// on remplit le tableau 
		for (int i=0;i<6;i++) {
			System.out.print("Saisissez un entier : ");
			tab[i]=sc.nextInt();
		}

		// On affiche le tableau et on calcule la somme en même temps
		System.out.println("Voici votre tableau : ");
		for (int i=0;i<6;i++) {
			System.out.print(tab[i]+" | ");
			somme+=tab[i];
		}	

		moyenne = somme/6.; 

		// le point permet de conserver la division classique
		System.out.println("\nLa moyenne de ce tableau est : " + moyenne);
		sc.close();
	}

}
