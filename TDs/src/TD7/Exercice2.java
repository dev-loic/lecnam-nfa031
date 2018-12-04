package cours07;

import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {
		int i = 0;
		boolean [] tab = new boolean[4];
		boolean resultatET = false, resultatOU = false;
		Scanner sc = new Scanner(System.in);
		
		// Saisie clavier
		for (i=0;i<4;i++)
		{
			System.out.print("Saisissez un booléen (true ou false) : ");
			tab[i]=sc.nextBoolean();
		}
		
		resultatET = tab[0]&&tab[1]&&tab[2]&&tab[3];
		resultatOU = tab[0]||tab[1]||tab[2]||tab[3];
		System.out.println();
		System.out.println("Résultat du ET : " + resultatET);
		System.out.println("Résultat du OU : " + resultatOU);
		// Pour clore le Scanner
		sc.close();
	}

}
