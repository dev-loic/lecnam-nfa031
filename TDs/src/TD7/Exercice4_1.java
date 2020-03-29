package TD7;

import java.util.Scanner;

public class Exercice4_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char [] tabInitial = {'x','r','l','b'}, tabModified;
		int i = 0, nbToAdd = 0, indexToAdd = 0, initialSize = tabInitial.length, newSize = 0;
	
		// Affichage du tableau initial
		System.out.println("Voici le tableau initial : ");
		for (i=0;i<4;i++) {
			System.out.print(tabInitial[i] + " | ");
		}
		
		// Nb de caractères à ajouter + Indice où il souhaite ajouter ces valeurs
		System.out.print("Combien de caractères souhaitez-vous ajouter ? ");
		nbToAdd = Integer.parseInt(sc.nextLine());
		System.out.print("Où souhaitez-vous les ajouter ? ");
		indexToAdd = Integer.parseInt(sc.nextLine());
		
		// Création du nouveau tableau
		newSize = initialSize+nbToAdd;
		tabModified = new char [newSize];
		// Premiere boucle jusqu'à indexToAdd
		for (i=0;i<indexToAdd;i++) {
			tabModified[i]=tabInitial[i];
		}
		// Ajout du tableau user
		// Rque : i n'est pas reinitialisé, il vaut à ce moment là indexToAdd
		for(;i<indexToAdd+nbToAdd;i++) {
			System.out.print("Saisissez un caractère à ajouter : " );
			tabModified[i]=sc.nextLine().charAt(0);
		}
		// Puis on finit le tableau
		for(;i<newSize;i++) {
			tabModified[i]=tabInitial[i-nbToAdd];
		}
		
		// Affichage du tableau
		System.out.println("Voici le tableau modifié : ");
		for (i=0;i<newSize;i++) {
			System.out.print(tabModified[i]+" | ");
		}
		sc.close();
	}

}
