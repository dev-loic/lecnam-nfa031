package TD6;

import java.util.Scanner;

public class Exercice2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] tab = new int[6];

		// on remplit le tableau 
		for (int i=0;i<6;i++) {
			System.out.print("Saisissez un entier : ");
			tab[i]=sc.nextInt();
		}
		
		// On affiche le tableau
		System.out.println("Voici votre tableau fraichement saisi : ");
		for (int i=0;i<6;i++) {
			System.out.print(tab[i]+" | ");
		}
		sc.close();
	}

}
