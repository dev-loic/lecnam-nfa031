package TD3;

import java.util.Scanner;

public class Exercice2_code3 {

	public static void main(String[] args) {
		// On déclare nos variables
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, c = 0, resultat = 0;
		// On demande à l'utilisateur les nombres
		// Et on traite en même temps la sortie
		System.out.println("Saisissez votre premier chiffre : ");
		a = sc.nextInt();
		resultat = a;
		System.out.println("Saisissez votre deuxième chiffre : ");
		b = sc.nextInt();
		if (b > resultat) {
			resultat = b;
		}
		System.out.println("Saisissez votre troisième chiffre : ");
		c = sc.nextInt();
		if (c > resultat) {
			resultat = c;
		}
		
		// On affiche le résultat 
		System.out.print("Le plus grand des 3 nombres saisis est " + resultat);
		
		sc.close();
	}
}

