package TD3;

import java.util.Scanner;

public class Exercice5_Question2_somme_n_entiers {

	public static void main(String[] args) {
		// Déclaration des variables
		Scanner sc = new Scanner (System.in);
		int somme = 0, n = 0 ;
		
		// On recupère le nombre d'entiers que l'user veut additionner
		System.out.print("Saisissez le nombre d'entiers souhaités : ");
		n = sc.nextInt();

		for (int i=1;i<=n;i++) {
			somme=somme+i;
		}
		System.out.println(somme);
		sc.close();
	}
}

