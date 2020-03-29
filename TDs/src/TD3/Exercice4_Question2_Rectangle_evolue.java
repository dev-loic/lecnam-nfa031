package TD3;

import java.util.Scanner;

public class Exercice4_Question2_Rectangle_evolue {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int hauteur = 0, largeur = 0;
		String patternLigne="";
	
		System.out.print("Saisissez la largeur souhaitée : ");
		largeur = sc.nextInt();
		
		System.out.print("Saisissez la hauteur souhaitée : ");
		hauteur = sc.nextInt();
		
		// On construit le pattern d'une ligne 
		for (int i=0;i<largeur;i++)  {
			patternLigne+="*";
		}

		// Puis on affiche successivement les lignes		
		for (int j=0;j<hauteur;j++) {
			System.out.println(patternLigne);
		} 
		sc.close();
	}
}



