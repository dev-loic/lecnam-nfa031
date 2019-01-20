package TD12;

import java.util.ArrayList;
import java.util.Scanner;

public class Notes_Q3 {

	public static void main(String[] args) {
		ArrayList<Integer> tabNotes = new ArrayList<Integer>();
		Scanner sc = new Scanner (System.in);
		int userChoice =-1;
		int newNote=-1, noteToModify=-1;

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
			
			switch (userChoice)
			{
			case 1:	
				System.out.print("Saisissez la note à ajouter : ");
				newNote=sc.nextInt();
				sc.nextLine();
				addNewNote(newNote,tabNotes);
				break;
				
			case 2:
				System.out.print("Saisissez la note à modifier : ");
				noteToModify=sc.nextInt();
				System.out.print("Saisissez la nouvelle valeur : ");
				newNote=sc.nextInt();
				sc.nextLine();
				modifyNote(noteToModify,newNote,tabNotes);
				break;
				
			case 3:
				displayNotes(tabNotes);
				break;
				
			case 4:
				System.out.println("Moyenne : "+notesAverage(tabNotes));
				break;
				
			case 9:
				System.out.println("On quitte le programme, byebye !");
			}
		} while(userChoice!=9);
		sc.close();
	}

	// QUESTION 1 
	// Ajouter une nouvelle note
	static void addNewNote (int iNewNote, ArrayList<Integer> ioTabNotes)
	{
		if (iNewNote<0) System.out.println("Note négative -> Non ajoutée");
		else
			ioTabNotes.add(iNewNote);
	}

	// Afficher toutes les notes
	static void displayNotes(ArrayList<Integer> iTabNotes)
	{
		int i=0, sizeNotes=iTabNotes.size();

		System.out.println("Voici les notes de ce brave élève : ");
		for(i=0;i<sizeNotes;i++)
			System.out.print(iTabNotes.get(i)+" | ");
		System.out.println();
	}

	// Calculer la moyenne des notes 
	static double notesAverage(ArrayList<Integer> iTabNotes)
	{
		double moyenne=0.0, somme=0.0;
		int i=0, sizeNotes=iTabNotes.size();

		for(i=0;i<sizeNotes;i++)
			somme+=iTabNotes.get(i);

		moyenne = ((int)((somme/sizeNotes)*100))/100.;
		return moyenne;
	}

	// QUESTION 2
	// Modifier une note existante
	static void modifyNote (int iNoteToModify, int iNewNote, ArrayList<Integer> ioTabNotes)
	{
		int indexOfNoteToModify=-1;
		if(!ioTabNotes.contains(iNoteToModify)) 
			System.out.println("Note non présente dans le tableau.");
		else
		{
			indexOfNoteToModify=ioTabNotes.indexOf(iNoteToModify);
			ioTabNotes.set(indexOfNoteToModify,iNewNote);
		}
	}

}
