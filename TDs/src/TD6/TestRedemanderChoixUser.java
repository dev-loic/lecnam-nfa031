package TD6;

import java.util.Scanner;

public class TestRedemanderChoixUser {
	
	/*
	 * Cette classe donne un schéma classique de demande de re-saisie user dans 2 cas 
	 * 1 - L'utilisateur a saisi une donnée erronnée ==> On lui demande de saisir une nouvelle fois cette donnée.
	 * 2 - On laisse le choix à l'utilisateur de ressaisir une donnée.
	 * L'exemple n'est pas très intelligent mais permet de voir comme gérer ces élements.
	 */
	public static void main(String[] args) {
		int choixInt = 0;
		boolean correctIntValue = false;
		boolean onceMore = true;
		char userChoice = 'o';
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("**Bienvenue dans le programme**");
		
		// Boucle do-while qui gère la ressaisie utilisateur si nécessaire
		do
		{
			// obligatoire si l'utilisateur redemande une saisie
			correctIntValue=false;
			do
			{
				System.out.println("Veuillez saisir un entier compris entre 1 et 5 (inclus) : ");
				choixInt = Integer.parseInt(sc.nextLine());

				// Test d'erreur
				if(choixInt<1 || choixInt>5)
				{
					System.out.println("[ERREUR] : l'entier saisi est inférieur à 1 ou supérieur à 5. Veuillez renouveller la saisie.");
					continue; // Le continue nous fait repartir au début de la boucle do-while qui gère l'erreur
				}
				
				// Si toutefois on arrive ici, l'int est correct
				System.out.println("Vous avez saisi "+choixInt+" BRAVO!");
				correctIntValue=true; // on passe correctIntValue à TRUE afin de sortie de la boucle.
			} while(!correctIntValue);
			
			// On propose à l'utilisateur de saisir une nouvelle valeur, s'il ne le souhaite pas, on sort
			System.out.println("Souhaitez-vous saisir une nouvelle valeur entière ? (o/n)");
			userChoice = sc.nextLine().charAt(0);
			
			if(userChoice=='n') onceMore=false;
			
		} while(onceMore);
		
		System.out.println("**BYE BYE**");
		sc.close();
	}

}
