package cours06;

import java.util.Scanner;

public class Exercice2_3 {

	public static void main(String[] args) {
		char [] tab = new char[6];
		int i=0; 
		char max = '\0';
		Scanner sc = new Scanner(System.in);

		// on remplit le tableau 
		for (i=0;i<6;i++)
		{
			System.out.print("Saisissez un caractère : ");
			tab[i]=sc.nextLine().charAt(0);
		}
		
		// On affiche le tableau et on calcule le max en même temps
		System.out.println("Voici votre tableau : ");
		max = tab[0];
		for (i=0;i<6;i++)
		{
			System.out.print(tab[i]+" | ");
			if (tab[i]>max) max = tab[i];
		}	
		System.out.println("\nLe max de ce tableau est : " + max);
		// Pour clore le Scanner
		sc.close();
	}

}