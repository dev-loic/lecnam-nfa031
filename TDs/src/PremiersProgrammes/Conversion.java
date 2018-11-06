package PremiersProgrammes;

import java.util.Scanner;

public class Conversion {
	
	public static void main(String [] args) { 
		double sommeEuros=0.0, sommeFrancs=0.0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Somme en euros?");
		sommeEuros = sc.nextDouble();
		sommeFrancs = sommeEuros*6.559;
		System.out.println("La somme en francs: " + sommeFrancs);
		
		// Attention à fermer le Scanner tout à la fin de votre programme
		sc.close();
	}

	// Rq : Vous pouvez vous limiter à une précision à 2 chiffres après la virgule.
	// Pour ce faire, vous pouvez utiliser Math.round par exemple, qui arrondit le nombre précisé
	// en argument. Si vous voulez garder 2 chiffres après la virgule (2 décimales) pour le nombre a,
	// par exemple, vous pouvez écrire : Math.round(a*100)/100. 
}
