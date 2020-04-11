package TD9;

public class Ex6_Q1 {

	public static void main(String[] args) {
		int[] ex = {1,5,8,9,7};
		int[] ex2 = {12, 5, 8, 123};
		afficheTable(ex);
		afficheTable(ex2);
	}

	static void afficheTable(int[] iTab) {
		int size = iTab.length;
		System.out.print('+');
		for (int i=0; i<size; i++) {
			// on fait appel à notre méthode, qui génère un certain nombre de tirets
			// En fonction de l'entier à afficher juste en dessous
			System.out.print("-"+adaptiveDash(iTab[i])+"-+");
		}
		System.out.println();
		System.out.print('|');
		for (int i=0; i<size; i++) {
			System.out.print(" " + iTab[i] + " |");
		}
		System.out.println();
		System.out.print('+');
		for (int i=0; i<size; i++) {
			System.out.print("-"+adaptiveDash(iTab[i])+"-+");
		}
		System.out.println();
	}
	
	//méthode qui donne le meme nombre de tiret que le nb de chiffres de iNum
	static String adaptiveDash(int iNum) {
		int iDash = 0;
		String adaptiveDash = "";
		// On utilise la méthode Integer.toString qui permet de convertir un entier en chaine de caractere
		// On peut alors facilement savoir le nombre de chiffres de iNum
		String num = Integer.toString(iNum);
		for (iDash=0;iDash<num.length();iDash++) {
			adaptiveDash+="-";
		}
		return adaptiveDash;
	}
}
