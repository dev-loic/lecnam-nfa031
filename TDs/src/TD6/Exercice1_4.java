package TD6;

import java.util.Scanner;

public class Exercice1_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
		int nbToInsert=0, indexToInsert=-1, sizeTab=tab.length;
		boolean error = true;
		
		// Dans un premier temps, je demande le nb a inserer
		System.out.print("Saisissez un nombre à insérer : ");
		nbToInsert = sc.nextInt();
		
		// Puis je demande l'indice.
		// J'ajoute une boucle do-while afin de traiter le fait que l'utilisateur puisse 
		// saisir un indice invalide (on suppose qu'il saisira un int)
		do {
			System.out.print("Saisissez l'indice dans le tableau : ");
			indexToInsert = sc.nextInt();
			// si l'index est erroné on recommence la boucle
			if (indexToInsert<0 || indexToInsert>=sizeTab) {
				System.out.println("[ERREUR] Veuillez saisir un indice entre 0 et "+sizeTab);
				continue;
			}
			error = false;
		} while (error);

		// On affiche le tableau avant 
		for (int i=0;i<sizeTab;i++) {
			System.out.print(tab[i]+" | ");
		}
		System.out.println();
		// On change la valeur à l'indice sélectionné
		tab[indexToInsert]=nbToInsert;
		// On affiche le tableau après 
		for (int i=0;i<sizeTab;i++) {
			System.out.print(tab[i]+" | ");
		}
		sc.close();
	}
	
}
