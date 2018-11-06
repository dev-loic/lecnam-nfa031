package cours03;

import java.util.Scanner;

public class Exercice2_code2 {

	public static void main(String[] args) {
		// On déclare nos variables
		int a = 0, b = 0, c = 0;
		Scanner sc = new Scanner(System.in);		
		// On recupère les 3 chiffres de l'utilisateur
		System.out.println("Saisissez votre premier chiffre : ");
		a = sc.nextInt();
		System.out.println("Saisissez votre deuxième chiffre : ");
		b = sc.nextInt();
		System.out.println("Saisissez votre troisième chiffre : ");
		c = sc.nextInt();
		
		// Puis on passe dans notre algorithme
		if ((a <= b) && (b <= c)) 
		{
			System.out.print("Les 3 chiffres ont été donnés dans l'ordre croissant !");
		}
		else
		{
			System.out.print("Les 3 chiffres n'ont pas été donnés dans l'ordre croissant...");
		}
		sc.close();
	}
}

