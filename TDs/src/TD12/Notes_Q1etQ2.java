package TD12;

import java.util.ArrayList;

public class Notes_Q1etQ2 {

	public static void main(String[] args) {
		// Si on passait le tableau des notes en static, en dehors de la méthode main
		// On pourrait s'affranchir de la passer en argument aux méthodes qui l'utilisent ==> Voir Notes_tabStatic
		// En effet, il serait disponible pour toute la classe et donc toutes les méthodes de la classe.
		ArrayList<Integer> tabNotes = new ArrayList<Integer>();
		addNewNote(12,tabNotes);
		addNewNote(14,tabNotes);
		addNewNote(9,tabNotes);
		
		// On affiche le tableau
		displayNotes(tabNotes);
		
		// On affiche la moyenne 
		System.out.println("Moyenne : "+notesAverage(tabNotes));
		
		// On ajoute 13 puis on affiche le tableau et on calcule la moyenne
		addNewNote(13,tabNotes);
		displayNotes(tabNotes);
		System.out.println("Moyenne : "+notesAverage(tabNotes));
	}
	
	// QUESTION 1
	// Ajouter une nouvelle note
	static void addNewNote (int iNewNote, ArrayList<Integer> ioTabNotes)
	{
		if (iNewNote<0 || iNewNote>20) System.out.println("Note non conforme -> Non ajoutée");
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
	void modifyNote (int iNoteToModify, int iNewNote, ArrayList<Integer> ioTabNotes)
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
