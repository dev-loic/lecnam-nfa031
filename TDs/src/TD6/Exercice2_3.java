package TD6;

import java.util.Scanner;

public class Exercice2_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char [] tab = new char[6];
		char max = '\0';

		// on remplit le tableau 
		for (int i=0;i<6;i++) {
			System.out.print("Saisissez un caractère : ");
			tab[i]=sc.nextLine().charAt(0);
		}
		
		// On affiche le tableau et on calcule le max en même temps
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
