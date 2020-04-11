package TD7;

import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nbSommes = 0;
		double [] tabEuros, tabFrancs;
		double curSomme = 0.0;
		
		// Saisie du nombre de sommes à convertir
		System.out.print("Combien de sommes voulez-vous convertir ? ");
		nbSommes = sc.nextInt();
		
		// Init des tableaux
		tabEuros = new double [nbSommes];
		tabFrancs = new double [nbSommes];
		
		// Saisie des sommes en euros
		for (int i=0;i<nbSommes;i++) {
			System.out.print("Saisissez votre " + (i+1) + "e somme en euros : ");
			tabEuros[i]=sc.nextDouble();
		}
		
		// Conversion 
		// Un EUR est équivalent à 6.55957 FRF
		for (int i=0;i<nbSommes;i++) {
			// ce calcul permet de ne conserver que 2 chiffres après la virgule
			// il existe également des fonctions que je vous invite à trouver sur internet ;) 
			curSomme = ((int)(tabEuros[i]*6.55957*100)/100.);
			tabFrancs[i]=curSomme;
		}
		 
		// On affiche les résultats
		// Rque : cette boucle peut être intégrée à la boucle précédente
		for (int i=0;i<nbSommes;i++) {
			System.out.println(tabEuros[i] + " € vaut " + tabFrancs[i] + " Francs.");
		}
		sc.close();
	}
	
}
