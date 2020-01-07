package TD6;

import java.util.Scanner;

public class Exercice1_2 {

	public static void main(String[] args) {
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
		int nbToFind=0, indexNbToFind=-1, i=0, sizeTab=tab.length;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisissez un nombre à rechercher : ");
		nbToFind = sc.nextInt();
		
		for (i=0;i<sizeTab;i++) {
			// Plus besoin de booléen, si indexNbToFind change de sa valeur initiale,
			// On sait que nbToFind a été trouvé
			// Remarquez que s'il est trouvé plusieurs fois, 
			// on prendra bien le dernier indice
			if (tab[i]==nbToFind) indexNbToFind=i;
		}
		if (-1!=indexNbToFind) System.out.println(nbToFind+" est présent dans le tableau à l'indice : "+indexNbToFind);		
		else System.out.println(nbToFind+" n'est pas dans le tableau...");
		// Pour clore le Scanner
		sc.close();
	}

}
