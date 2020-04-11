package TD6;

import java.util.Scanner;

public class Exercice2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] tab = new int[6];
		int max = 0;

		// on remplit le tableau 
		for (int i=0;i<6;i++) {
			System.out.print("Saisissez un entier : ");
			tab[i]=sc.nextInt();
		}
		
		// On affiche le tableau et on calcule le max en même temps
		// Ceci nous économise  une boucle FOR
		System.out.println("Voici votre tableau : ");
		max = tab[0];
		for (int i=0;i<6;i++) {
			System.out.print(tab[i]+" | ");
			if (tab[i]>max) {
				max = tab[i];
			}
		}	
		System.out.println("\nLe max de ce tableau est : " + max);
		sc.close();
	}

}
