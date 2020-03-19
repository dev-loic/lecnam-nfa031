package PremiersProgrammes;

import java.util.Scanner;

public class RecupererDonneesAuClavier {
	
	/*
	 * CONSEILS D'UTILISATION
	 * Certaines lignes de code sont volontaire commentées (présence des // devant la ligne)
	 * En effet, l'usage des méthodes nextInt et nextDouble avec nextLine ne fait pas bon ménage.
	 * L'idéal est de TOUJOURS utiliser la forme Integer.parseInt(sc.nextLine()); pour récupérer un entier
	 * et Double.parseDouble(sc.nextLine()); pour recupérer un nombre à virgule
	 */
	
	@SuppressWarnings("unused") // uniquement parce que j'initialise des variables que je n'utilise pas (ne pas mettre dans vos programmes)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // creation du scanner
		
		// 1 - Récupération d'un entier (int)
		// Les 2 méthodes ont le même résultat, seulement la deuxième permet de prévenir d'erreur
		// Donc je vous la conseille. Si dans un premier temps elle vous paraît compliquée, utilisez la 1ère
		//System.out.println("Saisissez un entier : "); // cette ligne est uniquement pour indiquée à l'utilisateur de saisir une info
		//int entierDeMonUtilisateur = sc.nextInt(); 
		System.out.println("Saisissez un entier : "); // idem
		int autreEntierDeMonUtilisateur = Integer.parseInt(sc.nextLine());
		
		// 2 - Récupération d'un nombre à virgule (double)
		//System.out.println("Saisissez un nombre : ");
		//double nombreDeMonUtilisateur = sc.nextDouble();
		System.out.println("Saisissez un nombre : ");
		double autreNombreDeMonUtilisateur = Double.parseDouble(sc.nextLine());
		
		// 3 - Récupération d'un chaine de caractère (String)
		System.out.println("Saisissez votre phrase : ");
		String chaineDeMonUtilisateur = sc.nextLine();
		
		// 4 - Récupération d'un caractère (char)
		System.out.println("Saisissez un caractère : ");
		char caractereDeMonUtilisateur = sc.nextLine().charAt(0);

		sc.close(); // fermeture du scanner (à toujours faire à la fin du main !)
	}

}
