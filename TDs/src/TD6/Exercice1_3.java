package TD6;

import java.util.Scanner;

public class Exercice1_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
		int nbToFind=0, indexNbToFind=-1, sizeTab=tab.length;
		
		System.out.print("Saisissez un nombre à rechercher : ");
		nbToFind = sc.nextInt();
		
		for (int i=0;i<sizeTab;i++) {
			// Même principe que précedemment, mais on ajoute un break
			// qui stoppe la boucle dès que nbToFind a été trouvé
			if (tab[i]==nbToFind) { 
				indexNbToFind=i; 
				break; 
			}
			// Ainsi on recupère bien l'indice de la première occurence
		}
		if (-1!=indexNbToFind) {
			System.out.println(nbToFind+" est présent dans le tableau à l'indice : "+indexNbToFind);		
		} else {
			System.out.println(nbToFind+" n'est pas dans le tableau...");
		}
		sc.close();
	}

}
