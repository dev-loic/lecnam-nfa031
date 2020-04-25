package TD11;

import java.util.Scanner;

public class Exo614 {

	public static void main(String[] args) {
		
		// Rq : j'ai implementé les 3 solutions dans cette correction
		
		//moyenneSolution1();
		
		//moyenneSolution2();
		
		moyenneSolution3();
		
	}
	
	static void afficheTab(int [] iTab) {
		for (int i=0;i<iTab.length;i++) {
			System.out.print(iTab[i]+" | ");
		}
		System.out.println();
	}
	
	static void moyenneSolution1() {
		Scanner sc = new Scanner (System.in);
		String saisieUser = "";
		boolean quit=false;
		int [] tabNotes = new int [20];
		int N=0, somme=0, i=0;
		double moyenne=0.0;
		do {
			System.out.print("Saisissez une note (q pour arreter la saisie) : ");
			saisieUser=sc.nextLine();
			if(saisieUser.charAt(0)=='q') {
				quit=true;
			} else {
				// on peut mettre un bloc try-catch
				tabNotes[N]=Integer.parseInt(saisieUser);
				N++;
			}
			
		} while (!quit && N!=20);
		if (N==20) {
			System.out.println("Le tableau est plein.");
		}
		
		afficheTab(tabNotes);
		
		for(i=0;i<N;i++) {
			somme+=tabNotes[i];
		}
		moyenne = ((double)somme)/N;
		System.out.println("Moyenne de ce brave élève : "+moyenne);
		sc.close();
	}
	
	static void moyenneSolution2() {
		Scanner sc = new Scanner (System.in);
		String saisieUser = "";
		boolean quit=false;
		int somme=0, numCase=0, nbNotes=0, nbNotesMax=20;
		int [] tabNotes = new int [nbNotesMax];
		double moyenne=0.0;
		
		// on initialise notre tableau avec que des -1
		for (int i=0;i<20;i++) {
			tabNotes[i]=-1;
		}
				
		do {
			numCase=0; 
			// on remet notre numCase a 0 pour recommencer la recherche de la prochaine case libre a 0
			// Si on ne fait pas ca, on revient exactement dans le meme cas que la solution 1
			System.out.print("Saisissez une note (q pour arreter la saisie) : ");
			saisieUser=sc.nextLine();
			if(saisieUser.charAt(0)=='q') {
				quit=true;
			} else {		
				while(tabNotes[numCase]!=-1) {
					numCase++;
					if (numCase==nbNotesMax) {
						System.out.println("Le tableau est plein...");
						quit=true;
						break;
					}			
				}

				if(numCase!=nbNotesMax) {
					tabNotes[numCase]=Integer.parseInt(saisieUser);
					nbNotes++;
				}
			}
			
		} while (!quit);
		
		afficheTab(tabNotes);
		
		for(int i=0;i<nbNotesMax;i++) {
			if (tabNotes[i]!=-1) {
				somme+=tabNotes[i];
			}
		}
		moyenne = ((double)somme)/nbNotes;
		System.out.println("Moyenne de ce brave élève : "+moyenne);
		sc.close();
	}
	
	static void moyenneSolution3() {
		Scanner sc = new Scanner (System.in);
		String saisieUser = "";
		boolean quit=false;
		int somme=0, numCase=0, nbNotes=0, nbNotesMax=20;
		int [] tabNotes = new int [nbNotesMax];
		boolean [] tabNoteEntree = new boolean [nbNotesMax]; // par defaut toutes les cases sont à false
		double moyenne=0.0;
				
		do {
			numCase=0; 
			// on remet notre numCase a 0 pour recommencer la recherche de la prochaine case libre a 0
			// Si on ne fait pas ca, on revient exactement dans le meme cas que la solution 1
			System.out.print("Saisissez une note (q pour arreter la saisie) : ");
			saisieUser=sc.nextLine();
			if(saisieUser.charAt(0)=='q') {
				quit=true;
			} else {		
				while(tabNoteEntree[numCase]) {
					numCase++;
					if (numCase==nbNotesMax-1) {
						System.out.println("Le tableau est plein...");
						quit=true;
						break;
					}
				}
				if(numCase!=nbNotesMax) {
					tabNotes[numCase]=Integer.parseInt(saisieUser);
					tabNoteEntree[numCase]=true;
					nbNotes++;
				}
			}
		} while (!quit);
		
		afficheTab(tabNotes);
		
		for(int i=0;i<nbNotesMax;i++) {
			if (tabNotes[i]!=-1) {
				somme+=tabNotes[i];
			}
		}
		moyenne = ((double)somme)/nbNotes;
		System.out.println("Moyenne de ce brave élève : "+moyenne);
		sc.close();
	}
}
