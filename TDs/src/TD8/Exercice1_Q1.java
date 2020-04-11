 package TD8;

import java.util.Scanner;

public class Exercice1_Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] labelsColonnes = {"Twingo","Clio","Mégane","Vel Satis"};
		String [] labelsLignes = {"André","Ingemar","Jean-Jérôme","Cindy","Joey"};
		int sizeColonnes = labelsColonnes.length, sizeLignes = labelsLignes.length;
		int [][] tabVentes = new int[sizeColonnes][sizeLignes];
		// La notion de lignes et de colonnes est arbitraire
		// Le tout est d'être cohérent		
		
		// On rentre les données 
		for (int j=0;j<sizeLignes;j++) {
			for (int i=0;i<sizeColonnes;i++) {
				System.out.print("Combien de "+labelsColonnes[i]+" a vendu "+labelsLignes[j]+" ? ");
				tabVentes[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
		// On affiche le tableau des ventes
		System.out.println("**** TABLEAU DES VENTES ****");	
		for (int j=0;j<sizeLignes;j++) {
			System.out.print(labelsLignes[j]+ " --> ");
			for (int i=0;i<sizeColonnes;i++) {
				System.out.print(tabVentes[i][j]+" "+labelsColonnes[i]+" | ");
			}
			System.out.println();
		}
		sc.close();
	}

}
