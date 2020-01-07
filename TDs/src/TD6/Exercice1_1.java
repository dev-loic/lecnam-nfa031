package TD6;

import java.util.Scanner;

public class Exercice1_1 {

	public static void main(String[] args) {
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
		int nbToFind=0, i=0, sizeTab=tab.length;
		boolean found = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisissez un nombre à rechercher : ");
		nbToFind = sc.nextInt();
		
		for (i=0;i<sizeTab;i++) {
			// on se contente ici de valuer un booléen si nbToFind est dans la tableau
			// la boucle for poursuit quand même son exécution après avoir trouvé
			// nbToFind
			if (tab[i]==nbToFind) found=true;
		}
		
		System.out.print(nbToFind+" est-il dans le tableau ? ");
		if (found) System.out.println(" --> oui");
		else System.out.println(" --> non");
		// Pour clore le Scanner
		sc.close();
	}

}
