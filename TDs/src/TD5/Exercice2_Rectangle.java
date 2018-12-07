package TD5;

import java.util.Scanner;

public class Exercice2_Rectangle {

	public static void main(String[] args) {
		int dimension = 0, i = 0, j = 0;
		String patternLigne="";
		Scanner sc = new Scanner (System.in);
	
		System.out.print("Saisissez la dimension souhaitée : ");
		dimension = sc.nextInt();
		
		// On construit la ligne
		for (i=0;i<dimension;i++)
		{
			patternLigne+="*";
		}
		
		// On affiche les lignes 
		for (j=0;j<dimension;j++)
		{
			System.out.println(patternLigne);
		}	
		sc.close();
	}
}




