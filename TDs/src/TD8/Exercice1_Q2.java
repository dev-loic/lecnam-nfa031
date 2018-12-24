package TD8;

import java.util.Scanner;

public class Exercice1_Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] labelsColonnes = {"Twingo","Clio","Mégane","Vel Satis"};
		String [] labelsLignes = {"André","Ingemar","Jean-Jérôme","Cindy","Joey"};
		int sizeColonnes = labelsColonnes.length, sizeLignes = labelsLignes.length, i=0, j=0, somme=0;
		int [][] tabVentes = new int[sizeColonnes][sizeLignes];
		// La notion de lignes et de colonnes est arbitraire
		// Le tout est d'être cohérent		
		
		// On rentre les données 
		for (j=0;j<sizeLignes;j++)
		{
			for (i=0;i<sizeColonnes;i++)
			{
				System.out.print("Combien de "+labelsColonnes[i]+" a vendu "+labelsLignes[j]+" ? ");
				tabVentes[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
		// On affiche le tableau des ventes
		System.out.println("**** TABLEAU DES VENTES ****");	
		for (j=0;j<sizeLignes;j++)
		{
			System.out.print(labelsLignes[j]+ " --> ");
			for (i=0;i<sizeColonnes;i++)
			{
				System.out.print(tabVentes[i][j]+" "+labelsColonnes[i]+" | ");
			}
			System.out.println();
		}
		
		System.out.println();
		// On affiche le nombre de ventes par modèle
		System.out.println("**** VENTES par modèle ****");	
		for (i=0;i<sizeColonnes;i++)
		{
			for(j=0;j<sizeLignes;j++)
			{
				somme+=tabVentes[i][j];
			}
			System.out.println(somme+" "+labelsColonnes[i]+" ont été vendues.");
			// On oublie pas de repasser somme à 0, pour le prochain modèle
			somme=0;
		}
		// Pour clore le Scanner
		sc.close();
	}

}