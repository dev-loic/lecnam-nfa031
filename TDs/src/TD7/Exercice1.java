package TD7;

import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int higherIndex = 0, somme = 0, i = 0 ; 
		int [] tab;
		
		// Saisie utilisateur
		System.out.print("Saisissez le plus grand index : ");
		higherIndex = sc.nextInt();
		
		// Création du tableau résultat
		// Attention on travaille avec le plus grand indice et non avec une taille de tableau
		// Si higherIndex = 3, tab.length = 4
		tab = new int[higherIndex+1]; 

		// on remplit les cas
		for (i=0;i<=higherIndex;i++) {
			somme+=i;
			tab[i]=somme;
		}
		
		// On affiche le tableau
		for (i=0;i<=higherIndex;i++) {
			System.out.print(tab[i]+" | ");
		}
		sc.close();
	}

}
