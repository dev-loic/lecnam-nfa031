package cours03;

import java.util.Scanner;

public class Exercice4_Question1 {

	public static void main(String[] args) {
		// On déclare nos variables
		int a = 0;
		Scanner sc = new Scanner(System.in);	
		// On demande à l'utilisateur les nombres
		System.out.println("Saisissez votre chiffre : ");
		a = sc.nextInt();
		if (a>=0)
		{
			System.out.print("L'entier saisi est positif!");
		}
		else
		{
			System.out.print("L'entier saisi est négatif!");
		}
		sc.close();
	}
}

