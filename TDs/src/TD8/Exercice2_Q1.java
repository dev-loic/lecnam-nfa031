package TD8;

import java.util.Scanner;

public class Exercice2_Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		boolean[][] occupee = 
			{
					{false,true,true,true,false,true,true,false,true,false},
					{false,true,true,true,false,true,true,false,true,false}, 
					{false,false,true,true,false,false,true,false,true,false}, 
					{true,true,false,true,false,true,true,false,true,true}, 
					{false,true,false,true,false,true,true,false,false,false}
			};
		String [] jours = {"lundi","mardi","mercredi","jeudi","vendredi"};
		String [] plages = {"8h-9h","9h-10h","10h-11h","11h-12h","13h-14h","14h-15h","15h-16h","16h-17h","17h-18h","18h-19h"};
		int iJour=0, iPlage=0, nbJours=occupee.length, nbPlages=occupee[0].length;
		
		System.out.println(" **Occupation des salles**");
		// on parcourt tous les jours
		for (iJour=0;iJour<nbJours;iJour++) {
			// on parcourt toutes les plages pour chaque jour
			for (iPlage=0;iPlage<nbPlages;iPlage++) {
				if(occupee[iJour][iPlage]) {
					System.out.println("La salle est occupée "+jours[iJour]+" pour la plage "+plages[iPlage]);
				}
			}
		}
		sc.close();
	}
}
