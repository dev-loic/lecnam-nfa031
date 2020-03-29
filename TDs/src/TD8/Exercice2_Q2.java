package TD8;

import java.util.Scanner;

public class Exercice2_Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[][] occupee = 
			{
					{false,true,true,true,false,true,true,false,true,false},
					{false,true,true,true,false,true,true,false,true,false}, 
					{false,false,true,true,false,false,true,false,true,false}, 
					{true,true,false,true,false,true,true,false,true,true}, 
					{false,true,false,true,false,true,true,false,false,false}
			};
		int iJour=0, iPlage=0, nbJours=occupee.length, nbPlages=occupee[0].length, countOccupation=0;
		double nbPlagesTotal = nbPlages*nbJours;

		System.out.println(" ** Taux d'occupation des salles ** ");

		// on parcourt tous les jours
		for (iJour=0;iJour<nbJours;iJour++) {
			// on parcourt toutes les plages pour chaque jour
			for (iPlage=0;iPlage<nbPlages;iPlage++) {
				if(occupee[iJour][iPlage])
					countOccupation++;
			}
		}
		System.out.println(countOccupation);
		System.out.println(nbPlagesTotal);
		System.out.println("Taux d'occupation de la salle : "+(countOccupation/nbPlagesTotal)*100+"%");
		sc.close();
	}
}
