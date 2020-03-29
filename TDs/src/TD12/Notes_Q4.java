package TD12;

import java.util.ArrayList;
import java.util.Scanner;

public class Notes_Q4 {
	
	public static void main(String[] args) {
		ArrayList<Integer> tabNotes = new ArrayList<Integer>();
		ArrayList<Integer> tabCoefs = new ArrayList<Integer>();
		Scanner sc = new Scanner (System.in);
		int userChoice =-1;
		int newNote=-1, noteToModify=-1, newCoef=0;

		System.out.println("Bienvenue dans le gestionnaire de notes !");

		do {
			System.out.println("Que souhaitez-vous faire ? ");
			System.out.println("1-Ajouter une note ");
			System.out.println("2-Modifier une note ");
			System.out.println("3-Afficher les notes ");
			System.out.println("4-Afficher la moyenne des notes ");
			System.out.println("9-Quitter le programme ");
			System.out.print("Saisissez votre choix : ");
			userChoice=sc.nextInt();			
			
			switch (userChoice) {
			case 1:	
				System.out.print("Saisissez la note à ajouter : ");
				newNote=sc.nextInt();
				System.out.print("Saisissez le coef de cette note : ");
				newCoef=sc.nextInt();
				sc.nextLine();
				addNewNote(newNote,newCoef,tabNotes,tabCoefs);
				break;
			case 2:
				System.out.print("Saisissez la note à modifier : ");
				noteToModify=sc.nextInt();
				System.out.print("Saisissez la nouvelle note : ");
				newNote=sc.nextInt();
				System.out.print("Saisissez le coef correspondant : ");
				newCoef=sc.nextInt();
				sc.nextLine();
				modifyNote(noteToModify,newNote,newCoef,tabNotes,tabCoefs);
				break;
			case 3:
				displayNotes(tabNotes,tabCoefs);
				break;
			case 4:
				System.out.println("Moyenne : "+notesAverage(tabNotes,tabCoefs));
				break;
			case 9:
				System.out.println("On quitte le programme, byebye !");
			}
		} while(userChoice!=9);
		sc.close();
	}

	// ajouter une nouvelle note
	static void addNewNote (int iNewNote, int iCoef, ArrayList<Integer> ioTabNotes, ArrayList<Integer> ioTabCoefs) {
		if (iNewNote<0) {
			System.out.println("Note négative -> Non ajoutée");
		} else if (iCoef<=0) {
			System.out.println("Coef négatif -> Non ajoutée");
		} else {
			ioTabNotes.add(iNewNote);
			ioTabCoefs.add(iCoef);
		}
	}

	// afficher toutes les notes
	static void displayNotes(ArrayList<Integer> iTabNotes, ArrayList<Integer> iTabCoefs) {
		int i=0, sizeNotes=iTabNotes.size();
		System.out.println("Voici les notes de ce brave élève et les coefs correspondant : ");
		for(i=0;i<sizeNotes;i++) {
			System.out.print(iTabNotes.get(i)+" | ");
		}
		System.out.println();
		for(i=0;i<sizeNotes;i++) {
			System.out.print(iTabCoefs.get(i)+" | ");
		}
		System.out.println();
	}

	// calculer la moyenne des notes 
	static double notesAverage(ArrayList<Integer> iTabNotes, ArrayList<Integer> iTabCoefs) {
		double moyenne=0.0, somme=0.0;
		int i=0, size=iTabNotes.size(), sommeCoefs=0;
		for(i=0;i<size;i++) {
			somme+=(iTabNotes.get(i))*iTabCoefs.get(i);
		}
		for(i=0;i<size;i++) {
			sommeCoefs+=iTabCoefs.get(i);
		}
		moyenne = ((int)((somme/sommeCoefs)*100))/100.;
		return moyenne;
	}

	static void modifyNote (int iNoteToModify, int iNewNote, int iCoef, ArrayList<Integer> ioTabNotes, ArrayList<Integer> ioTabCoefs) {
		int indexOfNoteToModify=-1;
		if(!ioTabNotes.contains(iNoteToModify)) {
			System.out.println("Note non présente dans le tableau.");
		} else {
			indexOfNoteToModify=ioTabNotes.indexOf(iNoteToModify);
			ioTabNotes.set(indexOfNoteToModify,iNewNote);
			ioTabCoefs.set(indexOfNoteToModify,iCoef);
		}
	}
}
