package cours05;

import java.util.Scanner;

// Version 1.0 : propre, fonctionnelle mais pas la meilleure en performances

public class Exercice2_Triangle {

	public static void main(String[] args) {
		int N = 0, iEspaces = 0, iEtoiles = 0, ligne = 1;
		String patternEspaces="";
		String patternEtoiles="";
		Scanner sc = new Scanner (System.in);
	
		System.out.print("Saisissez la dimension souhaitée : ");
		N = sc.nextInt();
		
		if (N<=0) System.out.println("[ERREUR] : dimension nulle ou négative");
		
		// Pour afficher le tps d'execution, on prend un point de départ
		long debut = System.currentTimeMillis();
		
		while (ligne<=N)
		{
			for (iEspaces=1;iEspaces<=N-ligne;iEspaces++)
			{
				patternEspaces+=" ";
			}
			for (iEtoiles=1;iEtoiles<=2*ligne-1;iEtoiles++)
			{
				patternEtoiles+="*";
			}
			System.out.println(patternEspaces+patternEtoiles);
			
			// on remet les pattern vides
			patternEspaces="";
			patternEtoiles="";
			// on passe à la ligne suivante 
			ligne++;
		}
		// Temps d'execution : on a fini, on peut prendre notre point d'arrivée
		// Et afficher le résultat.
		System.out.print("Temps d'execution : ");
		System.out.println(System.currentTimeMillis()-debut);
		sc.close();
	}

}

