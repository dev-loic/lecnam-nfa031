package TD4;

import java.util.Scanner;

public class ExerciceBonus_DateCorrecte {

	public static void main(String[] args) {
		int jour = 0, mois = 0, annee = 0;
		boolean bissextile = false, invalid = true; // invalid permet d'éviter des tests si on sait déjà que la date n'est pas valide
		Scanner sc = new Scanner(System.in);

		while (invalid)
		{
			// On recupere toutes nos infos
			System.out.print("Saisissez le jour : ");
			jour=sc.nextInt();
			System.out.print("Saisissez le mois : ");
			mois=sc.nextInt();
			System.out.print("Saisissez l'année : ");
			annee=sc.nextInt();

			// On fait les premiers tests rapides
			if (jour<1 || jour>31) 
			{
				System.out.println("Vous n'avez pas saisi un jour valide !");
				continue;
			}
			if (mois<1 || mois>12) 
			{
				System.out.println("Vous n'avez pas saisi un mois valide !");
				continue;
			}
			if (annee<1582) 
			{
				// 1582 est l annee d instauration du calendrier gregorien
				// Et donc des annees bissextiles :)
				System.out.println("Vous n'avez pas saisi une année valide !");
				continue;
			}

			// on teste le jour
			// Fevrier
			if (2==mois)
			{
				// bissextile
				if ( (0==annee%4 && 0!=annee%100) || (0==annee%4 && 0==annee%400) )
					bissextile=true;
				
				if (bissextile&&jour>29) 
				{
					System.out.println(annee+" est bissextile, le mois de Février comporte alors 29 jours.");
					continue;
				}
				else if(!bissextile&&jour>28) 
				{
					System.out.println(annee+" n'est pas bissextile, le mois de Février comporte alors 28 jours.");
					continue;
				}
			}
			// 30 jours
			else if (4==mois||6==mois||9==mois||11==mois)
			{
				if (jour>30) 
				{
					System.out.println("Le mois "+mois+" comporte uniquement 30 jours...");
					continue;
				}
			}
			// Arrivé ici, la date est forcement valide, on l'affiche
			invalid = false;	
		}
		System.out.print("La date saisie est : " + jour + "/" + mois + "/" + annee);
		sc.close();
	}

}
