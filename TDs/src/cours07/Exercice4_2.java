package cours07;

import java.util.Scanner;

public class Exercice4_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char [] tabInitial = {'x','r','l','b'}, tabModified;
		char answer = 'N';
		int i = 0, nbToAdd = 0, indexToAdd = 0, initialSize = tabInitial.length, newSize = 0;
		boolean out = false;

		System.out.println("*** DÉBUT DU PROGRAMME ***");
		
		// Affichage du tableau initial
		System.out.println("Voici le tableau initial : ");
		for (i=0;i<4;i++)
		{
			System.out.print(tabInitial[i] + " | ");
		}

		// On ajoute la possibilité de modifier plusieurs fois le tableau
		do
		{
			// Nb de caractères à ajouter + Indice où il souhaite ajouter ces valeurs
			System.out.print("\nCombien de caractères souhaitez-vous ajouter ? ");
			nbToAdd = sc.nextInt();
			System.out.print("Où souhaitez-vous les ajouter ? ");
			indexToAdd = sc.nextInt();
			sc.nextLine();

			// Création du nouveau tableau
			newSize = initialSize+nbToAdd;
			tabModified = new char [newSize];
			// Premiere boucle jusqu'à indexToAdd
			for (i=0;i<indexToAdd;i++)
			{
				tabModified[i]=tabInitial[i];
			}
			// Ajout du tableau user
			// Rque : i n'est pas reinitialisé, il vaut à ce moment là indexToAdd
			for(;i<indexToAdd+nbToAdd;i++)
			{
				System.out.print("Saisissez un caractère à ajouter : " );
				tabModified[i]=sc.nextLine().charAt(0);
			}
			// Puis on finit le tableau
			for(;i<newSize;i++)
			{
				tabModified[i]=tabInitial[i-nbToAdd];
			}

			// Affichage du tableau
			System.out.println("Voici le tableau modifié : ");
			for (i=0;i<newSize;i++)
			{
				System.out.print(tabModified[i]+" | ");
			}
			
			// On demande au user s'il veut continuer 
			System.out.println("\nSouhaitez-vous continuer ? (O ou N) ");
			answer = sc.nextLine().charAt(0);
			if (answer=='N') out=true;
			else
			{			
				tabInitial = tabModified;
				initialSize = tabInitial.length;		
			}
		} while (!out);
		
		System.out.println("*** FIN DU PROGRAMME ***");
		
		// Pour clore le Scanner
		sc.close();
	}
}
