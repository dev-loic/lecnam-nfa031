package TD5;

import java.util.Scanner;

// Version 2.0 : on optimise les performances en ne perfant aucune notion fonctionnelle

public class Exercice2_TriangleAmeliore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 0, iEspaces = 0, ligne = 1;
		String patternEspaces = "";
		String patternEtoiles = "";

		System.out.print("Saisissez la dimension souhaitée : ");
		N = sc.nextInt();
		if (N<=0) {
			System.out.println("Le nombre de ligne n'est pas correct !");
		}

		long debut = System.currentTimeMillis();
		 
		// On construit les éléments de la première ligne 
		for (iEspaces=1;iEspaces<=N-1;iEspaces++) {
			patternEspaces+=" ";
		}
		patternEtoiles="*";
		
		while (ligne<=N) {
			System.out.println(patternEspaces+patternEtoiles);
			
			// on met à jour les pattern
			// Attention pour la derniere ligne, le pattern d espaces est vide
			// String test = "cnam";
			// test.substring(1) => nam
			if (ligne!=N) patternEspaces=patternEspaces.substring(1);
			patternEtoiles+="**";	
			
			// on passe à la ligne suivante 
			ligne++;
		}		
		
		System.out.print("Temps d'execution : ");
		System.out.println(System.currentTimeMillis()-debut);
		sc.close();
	}

}



