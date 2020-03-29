package TD5;

import java.util.Scanner;

public class Exercice2_Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dimension = 0, i = 0, j = 0;
		String patternLigne="";
		
		System.out.print("Saisissez la dimension souhaitée : ");
		dimension = sc.nextInt();
		
		// On construit la ligne
		for (i=0;i<dimension;i++) {
			patternLigne+="*";
		}
		
		// On affiche les lignes 
		for (j=0;j<dimension;j++) {
			System.out.println(patternLigne);
		}	
		sc.close();
	}
}




