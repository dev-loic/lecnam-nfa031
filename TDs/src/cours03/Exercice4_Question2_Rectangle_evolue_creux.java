package cours03;

import java.util.Scanner;

public class Exercice4_Question2_Rectangle_evolue_creux {

	public static void main(String[] args) {
		int hauteur = 0, largeur = 0;
		String patternLignesExtreme="", patternLignesInter="*";
		Scanner sc = new Scanner (System.in);
	
		System.out.print("Saisissez la largeur souhaitée : ");
		largeur = sc.nextInt();
		
		System.out.print("Saisissez la hauteur souhaitée : ");
		hauteur = sc.nextInt();
		
		// On construit le pattern des lignes inter et extremes
		for (int i=0;i<largeur;i++)
		{
			patternLignesExtreme+="*";
		}
		for (int j=1;j<largeur-1;j++)
		{
			patternLignesInter+=" ";
		}
		patternLignesInter+="*";

		// Puis on affiche successivement les lignes		
		for (int k=0;k<hauteur;k++) 
		{
			if ( k==0 || hauteur-1==k )
			{
				System.out.println(patternLignesExtreme);
			}
			else
			{
				System.out.println(patternLignesInter);
			}
		} 
		sc.close();
	}
}

