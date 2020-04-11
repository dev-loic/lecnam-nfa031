package TD10;

import java.util.Scanner;

public class Exercice_522 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int [][] resultatsSondage = new int [2][3];
		int nbFemmes = 0, nbOui = 0, nbNon = 0, nbAbsention = 0, result = -1;
		boolean equilibre = true;
		
		// Lecture du tableau au clavier
		lireTableau(resultatsSondage);
		
		// Affichage du tableau
		afficherTableau(resultatsSondage);
		
		// Nombre de femmes qui ont participé au vote
		nbFemmes=nbFemmesSondage(resultatsSondage);
		System.out.println(nbFemmes+" femmes ont voté à ce sondage.");
		
		// Nombre de personnes ayant voté oui
		nbOui=nbPersIntentionDeVote(resultatsSondage,0);
		System.out.println(nbOui+" personnes ont voté oui à ce sondage.");
		
		// Nombre de personnes ayant voté oui
		nbNon=nbPersIntentionDeVote(resultatsSondage,1);
		System.out.println(nbNon+" personnes ont voté non à ce sondage.");

		// Nombre de personnes ayant voté oui
		nbAbsention=nbPersIntentionDeVote(resultatsSondage,2);
		System.out.println(nbAbsention+" personnes se sont abstenues à ce sondage.");
		
		// Prediciton resultat
		result=predictionResultat(resultatsSondage);
		if(-1==result) {
			System.out.println("Egalité parfaite, on ne peut rien prédire.");
		} else if(0==result) {
			System.out.println(" Le oui l'emporte !");
		} else {
			System.out.println(" Le non l'emporte !");
		}
		
		// On verifie que les hommes et les femmes sont équitablement représentés
		equilibre=equilibreDesSexes(resultatsSondage);
		if (!equilibre) {
			System.out.println("Un des deux sexes est moins représenté que l'autre :'(");
		} else {
			System.out.println("Ce vote est parfaitement égalitaire :)");
		}
		sc.close();
	}
	
	static void lireTableau(int [][] tabSondage) {
		String [] labelLignes = {"d'hommes", "de femmes"};
		String [] labelColonnes = {"oui", "non", "absention"};
		int nbLignes = tabSondage.length, nbColonnes=tabSondage[0].length;
		
		for (int iLigne=0;iLigne<nbLignes;iLigne++) {
			for (int iColonne=0;iColonne<nbColonnes;iColonne++) {
				System.out.print("Saisissez le nombre "+labelLignes[iLigne]+ " qui ont voté "+labelColonnes[iColonne]+ " : ");
				tabSondage[iLigne][iColonne]=sc.nextInt();
			}
		}
	}
	
	static void afficherTableau(int [][] tabSondage) {
		String [] labelLignes = {"hommes", "femmes"};
		String [] labelColonnes = {"oui", "non", "absention"};
		int nbLignes = tabSondage.length, nbColonnes=tabSondage[0].length;
		
		for (int iLigne=0;iLigne<nbLignes;iLigne++) {
			System.out.print(labelLignes[iLigne]+" : ");
			for (int iColonne=0;iColonne<nbColonnes;iColonne++) {
				System.out.print(labelColonnes[iColonne]+"-->"+tabSondage[iLigne][iColonne] + " | ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static int nbFemmesSondage(int [][] tabSondage) {
		int nbFemmes=0, sizeTypeDeVote=tabSondage[1].length; // idem que tabSondage[0].length
		for (int i=0;i<sizeTypeDeVote;i++) {
			// on prend la ligne 1
			nbFemmes+=tabSondage[1][i];
		}
		return nbFemmes;
	}
	
	static int nbHommesSondage(int [][] tabSondage) {
		int nbHommes=0, sizeTypeDeVote=tabSondage[0].length; // idem que tabSondage[0].length
		for (int i=0;i<sizeTypeDeVote;i++) {
			// on prend la ligne 0
			nbHommes+=tabSondage[0][i];
		}
		return nbHommes;
	}
	
	// intention=0 => oui
	// intention=1 => non
	// intention=2 => absention
	static int nbPersIntentionDeVote(int [][] tabSondage, int intention) {
		int nbPers = 0, sizeNbGender = tabSondage.length;
		for (int i=0;i<sizeNbGender;i++) {
			nbPers+=tabSondage[i][intention];
		}
		return nbPers;
	}

	static int predictionResultat(int [][] tabSondage) {
		int nbOui = nbPersIntentionDeVote(tabSondage,0);
		int nbNon = nbPersIntentionDeVote(tabSondage,1);
		int result = -1;
		if (nbOui>nbNon) {
			result=0;
		} else if (nbOui==nbNon) {
			result = -1;
		} else {
			result = 1;
		}
		return result;
	}

	static boolean equilibreDesSexes(int [][] tabSondage) {
		int nbHommes = nbHommesSondage(tabSondage);
		int nbFemmes = nbFemmesSondage(tabSondage);
		boolean equilibre = true;
		if (nbFemmes>nbHommes || nbHommes>nbFemmes) {
			equilibre = false;
		}
		return equilibre;		
	}
}
