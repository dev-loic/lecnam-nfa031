package TD10;

import java.util.Scanner;

public class Exercice_523 {

	public static void main(String[] args) {
		int N = 0;
		char [][] resultTriangleTable;
		Scanner sc = new Scanner (System.in);

		System.out.print("Saisissez la dimension souhaitée : ");
		N = Integer.parseInt(sc.nextLine());
		if (N<=0) System.out.println("Le nombre de ligne n'est pas correct !");
		 
		// On construit le table du sapin
		resultTriangleTable=insertTriangleIntoTable(N);

		// Affichage pointe vers le haut
		System.out.println("** POINTE VERS LE HAUT **");
		afficherPointeEnHaut(resultTriangleTable);
		System.out.println("*************************");
		
		// Affichage pointe vers la droite
		System.out.println("** POINTE VERS LA DROITE **");
		afficherPointeADroite(resultTriangleTable);
		System.out.println("***************************");
		
		// Affichage pointe vers le bas
		System.out.println("** POINTE EN BAS **");
		afficherPointeEnBas(resultTriangleTable);
		System.out.println("***************************");
		
		sc.close();
	}
	
	static char [][] insertTriangleIntoTable (int N)
	{
		char [][] triangleTable = new char[N][2*N-1];
		int iLigne=0, iColonne=0;
		
		for (iLigne=0;iLigne<N;iLigne++)
		{
			for (iColonne=0;iColonne<2*N-1;iColonne++)
			{
				if (iColonne>=(N-1)-iLigne && iColonne<=(N-1)+iLigne) triangleTable[iLigne][iColonne]='*';
				else triangleTable[iLigne][iColonne]=' ';
			}
		}	

		return triangleTable;
	}
	
	// Parcours classique
	static void afficherPointeEnHaut(char [][] tabDuSapin)
	{
		int iLigne=0, iColonne=0, sizeLignes=tabDuSapin.length, sizeColonnes=tabDuSapin[0].length;
		
		for (iLigne=0;iLigne<sizeLignes;iLigne++)
		{
			for (iColonne=0;iColonne<sizeColonnes;iColonne++)
			{
				System.out.print(tabDuSapin[iLigne][iColonne]+ " ");
			}
			System.out.println();
		}
	}
	
	// Il s'agit de parcourir les colonnes dans un premier temps et pour chaque colonne les lignes à l'envers 
	static void afficherPointeADroite(char [][] tabDuSapin)
	{
		int iLigne=0, iColonne=0, sizeLignes=tabDuSapin.length, sizeColonnes=tabDuSapin[0].length;
		
		for (iColonne=0;iColonne<sizeColonnes;iColonne++)
		{
			for (iLigne=sizeLignes-1;iLigne>=0;iLigne--)
			{
				System.out.print(tabDuSapin[iLigne][iColonne]+ " ");
			}
			System.out.println();
		}

	}
	
	// Idem que le premier mais on parcourt les lignes à l'envers
	static void afficherPointeEnBas(char [][] tabDuSapin)
	{
		int iLigne=0, iColonne=0, sizeLignes=tabDuSapin.length, sizeColonnes=tabDuSapin[0].length;
		
		for (iLigne=sizeLignes-1;iLigne>=0;iLigne--)
		{
			for (iColonne=0;iColonne<sizeColonnes;iColonne++)
			{
				System.out.print(tabDuSapin[iLigne][iColonne]+ " ");
			}
			System.out.println();
		}
	}

}
