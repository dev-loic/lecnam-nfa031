package TD3;

import java.util.Scanner;

public class Exercice5_Question3_moyenne_n_entiers {

	
	public static void main(String[] args) {
		// Déclaration des variables
		Scanner sc = new Scanner (System.in);
		int n = 0 ;
		double moyenne = 0.0, somme = 0.0;
		
		// On recupère le nombre d'entiers que l'user veut additionner
		System.out.print("Saisissez le nombre d'entiers souhaités : ");
		n = sc.nextInt();
		
		for (int i=1;i<=n;i++) {
			somme=somme+i;
		}
		moyenne = somme / n;
		System.out.println(moyenne);	
		sc.close();
	}
}

