package TD5;

import java.util.Scanner;

public class Exercice3_Q1_NombrePremier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nbUser = 0, diviseur = 0;
		boolean premier = true;

		System.out.print("Saisissez le nombre à tester (supérieur ou égal à 2) : ");
		nbUser = sc.nextInt();
		if (nbUser<2) {
			System.out.println("Le nombre saisi doit être inférieur à 2.");
		} else {
			diviseur=2;
			while(diviseur<nbUser && premier) {
				if(nbUser%diviseur==0) premier=false;
				diviseur++;
			}
			if (premier) System.out.println(nbUser+" est premier!");
			else System.out.println(nbUser+" n'est pas premier!");
		}
		sc.close();
	}

}



