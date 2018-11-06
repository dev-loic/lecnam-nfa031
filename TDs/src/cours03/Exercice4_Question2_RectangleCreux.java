package cours03;

import java.util.Scanner;

public class Exercice4_Question2_RectangleCreux {
	public static void main (String[] args) {
		int longueur;
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Combien de lignes d'étoiles souhaitez-vous ?");
		longueur = sc.nextInt();
		
		System.out.println("*****");
		
		for (int i=1; i<longueur-1; i++) 
		{
			System.out.println("*   *");
		} 
		
		System.out.println("*****");
		sc.close();
	}
}





