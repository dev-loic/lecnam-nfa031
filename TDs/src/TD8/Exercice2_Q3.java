package TD8;

import java.util.Scanner;

public class Exercice2_Q3 {

	public static void main(String[] args) 
	{
		boolean[][] occupee = 
			{
					{false,true,true,true,false,true,true,false,true,false},
					{false,true,true,true,false,true,true,false,true,false}, 
					{false,false,true,true,true,false,true,false,true,false}, 
					{true,true,false,true,false,true,true,false,true,true}, 
					{false,true,false,true,false,true,true,false,false,false}
			};
		String userDay;
		String [] jours = {"lundi","mardi","mercredi","jeudi","vendredi"};
		String [] plages = {"8h-9h ","9h-10h","10h-11h","11h-12h","13h-14h","14h-15h","15h-16h","16h-17h","17h-18h","18h-19h"};
		int iJour=0, iPlage=0, nbJours=occupee.length, nbPlages=occupee[0].length, userSlot=0;
		boolean found = false, success = false;
		Scanner sc = new Scanner (System.in);

		do
		{
			// Saisie du jour
			System.out.print("Quel jour vous intéresse ? ");
			userDay = sc.nextLine();
			for(iJour=0;iJour<nbJours;iJour++)
			{
				if(jours[iJour].equalsIgnoreCase(userDay))
				{
					found=true;
					break;
				}
			}
			if(!found)
			{
				System.out.println("Merci de saisir un jour valide");
				continue;
			}
			
			// Saisie de la plage
			System.out.println("Pour "+jours[iJour]+" il reste les plages suivantes : ");
			for(iPlage=0;iPlage<nbPlages;iPlage++)
			{
				if(!occupee[iJour][iPlage])
					System.out.println((iPlage+1)+" - "+plages[iPlage]);
			}
			System.out.print("Saisissez le numéro de la plage qui vous intéresse : ");
			userSlot=Integer.parseInt(sc.nextLine());
			if (occupee[iJour][userSlot-1])
			{
				System.out.println("Cette plage n'est pas disponible !");
				continue;
			}
			
			System.out.println("[SUCCES] La salle vous est réservée "+jours[iJour]+" pour la plage "+plages[userSlot-1]);
			success=true;			
			
		} while(!success);
		// Pour clore le Scanner
		sc.close();
	}

}
