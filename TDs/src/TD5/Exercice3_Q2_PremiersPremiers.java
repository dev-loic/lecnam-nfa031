package cours05;

import java.util.Scanner;

public class Exercice3_Q2_PremiersPremiers {

	public static void main(String[] args) {
		int nbPremiers = 0, count = 0, diviseur=2, curNb=2;
		Boolean premier = true;
		Scanner sc = new Scanner (System.in);

		System.out.println("**Bienvenue dans un programme qui affiche des nombres premiers**");
		// j'ai décidé d'ajouter la possibilité de saisir le nb d'entiers premiers que l'on souhaite
		// dans l'énoncé c'était bien 100 qu'il fallait saisir
		System.out.print("Saisissez le nombre d'entiers premiers que vous souhaitez : ");
		nbPremiers = sc.nextInt();
		
		System.out.println("Voici les "+nbPremiers+" premiers nombres premiers !\n");
		
		// On installe un compteur qui va nous permettre de maitriser le nombre d'entiers premiers trouvés
		while (count<nbPremiers)
		{
			// Pour chaque curNb on parcourt les nbs compris entre 2 et curNb-1
			while (diviseur<curNb && premier)
			{
				if(curNb%diviseur==0) premier=false;
				diviseur++;
			}
			// S'il est premier, on l'affiche et on augmente le compteur
			if (premier) 
			{ 
				System.out.print(curNb+","); 
				count++; 
			}
			// On n'oublie pas de remettre diviseur à 2, premier à true et d'augmenter curNb
			diviseur=2;
			premier=true;
			curNb++;
		}
		sc.close();
	}

}
