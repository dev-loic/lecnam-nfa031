package cours06;

import java.util.Scanner;

public class Exercice2_1 {

	public static void main(String[] args) {
		int [] tab = new int[6];
		int i=0;
		Scanner sc = new Scanner(System.in);

		// on remplit le tableau 
		for (i=0;i<6;i++)
		{
			System.out.print("Saisissez un entier : ");
			tab[i]=sc.nextInt();
		}
		
		// On affiche le tableau
		System.out.println("Voici votre tableau fraichement saisi : ");
		for (i=0;i<6;i++)
		{
			System.out.print(tab[i]+" | ");
		}	
		// Pour clore le Scanner
		sc.close();
	}

}
