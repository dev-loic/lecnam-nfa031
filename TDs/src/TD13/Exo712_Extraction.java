package TD13;

import java.util.ArrayList;

public class Exo712_Extraction {

	public static void main(String[] args) {
		String test1 = " Bonjour mon nom est Loïc";
		String test2 = " a b c";
		String test3 = "  Je /; met    d'^%autres séparateurs )079 entre $ mes 123 mots";
		
		// Itératif
		System.out.println("**ITÉRATIF**");
		ArrayList<String> list1 = readAndSaveWords(test1);
		ArrayList<String> list2 = readAndSaveWords(test2);
		ArrayList<String> list3 = readAndSaveWords(test3);
		
		System.out.println("TEST1");
		System.out.println("Expected -> Bonjour | mon | nom | est | Loïc");
		System.out.println("Computed -> " + stringListOfWords(list1));
		
		System.out.println("TEST2");
		System.out.println("Expected -> a | b | c");
		System.out.println("Computed -> " + stringListOfWords(list2));
		
		System.out.println("TEST3");
		System.out.println("Expected -> Je | met | d | autres | séparateurs | entre | mes | mots");
		System.out.println("Computed -> " + stringListOfWords(list3));
		
		// Récursif
		System.out.println("\n**RÉCURSIF**");
		ArrayList<String> list1Rec = readAndSaveWordsRecursively(test1);
		ArrayList<String> list2Rec = readAndSaveWordsRecursively(test2);
		ArrayList<String> list3Rec = readAndSaveWordsRecursively(test3);
		
		System.out.println("TEST1");
		System.out.println("Expected -> Bonjour | mon | nom | est | Loïc");
		System.out.println("Computed -> " + stringListOfWords(list1Rec));
		
		System.out.println("TEST2");
		System.out.println("Expected -> a | b | c");
		System.out.println("Computed -> " + stringListOfWords(list2Rec));
		
		System.out.println("TEST3");
		System.out.println("Expected -> Je | met | d | autres | séparateurs | entre | mes | mots");
		System.out.println("Computed -> " + stringListOfWords(list3Rec));
	}
	

	// Methode qui crée une ArrayList de String a partir d une chaine de caracteres
	static ArrayList<String> readAndSaveWords(String iFullChaine) {
		char [] fullChaineTab = iFullChaine.toCharArray();
		int i=0, sizeFullChaine = fullChaineTab.length, startingIndex=0, endingIndex=0;
		ArrayList<String> wordsList = new ArrayList<String>();
		
		while(i<sizeFullChaine) {
			if(!Character.isLetter(fullChaineTab[i])) { // séparateurs
				i++;
				continue;
			} else { // on a un mot
				startingIndex=i; // la premiere lettre
				endingIndex=findWordEndingIndex(fullChaineTab,startingIndex); // on cherche l indice de fin
				wordsList.add(iFullChaine.substring(startingIndex,endingIndex)); // on recupere le substring correspondant
				i=endingIndex+1; // pour la prochaine boucle, on repart de la fin du mot
				continue;
			}
		}
		return wordsList;
	}
	
	// Meme chose mais recursivement
	static ArrayList<String> readAndSaveWordsRecursively(String iChaineToDecortikate) {
		ArrayList<String> outputList = new ArrayList<String>();
		int [] tabOfIndex = new int [2];
		// on recupere les indices de debut et de fin du premier mot rencontré
		tabOfIndex=findFirstWordIndex(iChaineToDecortikate);
		
		if(tabOfIndex[1]!=0) { // si l'indice de fin est égal à 0, il n'y a plus de mot à trouver 
			// on l'ajoute à la liste de sortie
			outputList.add(iChaineToDecortikate.substring(tabOfIndex[0],tabOfIndex[1]));
			// on rappelle la méthode sur une chaîne réduite à partir de la fin du mot qu'on vient de trouver
			outputList.addAll(readAndSaveWordsRecursively(iChaineToDecortikate.substring(tabOfIndex[1])));
		}
		return outputList;
	}
	
	// Methode qui permet de trouver l'indice du dernier caractere dun mot, afin d'extraire ce mot
	static int findWordEndingIndex(char [] iFullChaineTab, int iStartingIndex) {
		int i=iStartingIndex, sizeFullChaine=iFullChaineTab.length, endingIndex=0;
		while (i<sizeFullChaine) {
			if(!Character.isLetter(iFullChaineTab[i])) { // on est sur un separateur
				endingIndex=i; // on sauvegarde l'indice de fin
				break;
			}
			i++;
		}
		// on est peut etre a la fin de la chaine
		if(i==sizeFullChaine) {
			endingIndex=i;
		}
		return endingIndex;
	}
	
	// Méthode qui affiche une liste de mots
	static String stringListOfWords(ArrayList<String> iList) {
		int i=0, sizeList=iList.size();
		String output="";
		for (i=0;i<sizeList;i++) {
			output+=iList.get(i);
			output+=" | ";
		}
		return output;
	}

	// Renvoie les indices de debut et de fin du premier mot rencontre
	static int[] findFirstWordIndex(String iChaine) {
		int startingIndex=0, endingIndex=0, i=0, sizeInputChaine=iChaine.length();
		int [] tabOfIndex = new int [2];
		while(i<sizeInputChaine) {
			if(!Character.isLetter(iChaine.charAt(i))) { // séparateurs
				i++;
				continue;
			} else { // on a un mot
				startingIndex=i; // la premiere lettre
				endingIndex=findWordEndingIndex(iChaine.toCharArray(),startingIndex); // on cherche l indice de fin
				break;
			}
		}
		tabOfIndex[0]=startingIndex;
		tabOfIndex[1]=endingIndex;
		return tabOfIndex;
	}
}
