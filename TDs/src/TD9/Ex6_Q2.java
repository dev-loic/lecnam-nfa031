package TD9;

public class Ex6_Q2 {
	
	public static void main(String[] args) {
		int[] ex1 = {1,5,8,9,7};
		int[] ex2 = {12, 5, 8, 123};
		int[] ex3 = {-12, 511, 877, -12367690};
		afficheTable(ex1);
		afficheTable(ex2);
		afficheTable(ex3);
	}

	// factoriser trait bas trait haut
	
	static void afficheTable(int[] iTab) {
		int size = iTab.length, i=0;
		System.out.print('+');
		for (i=0; i<size; i++) {
			System.out.print("-"+adaptiveDash(iTab[i])+"-+");
		}
		System.out.println();
		System.out.print('|');
		for (i=0; i<size; i++) {
			System.out.print(" " + iTab[i] + " |");
		}
		System.out.println();
		System.out.print('+');
		for (i=0; i<size; i++) {
			System.out.print("-"+adaptiveDash(iTab[i])+"-+");
		}
		System.out.println();
	}
	
	//méthode qui donne le meme nombre de tiret que le nb de chiffres de iNum
	// Vu quon transforme iNum en string, le - est aussi pris en compte ;)
	static String adaptiveDash(int iNum) {
		int iDash = 0;
		String adaptiveDash = "";
		String num = Integer.toString(iNum);
		for (iDash=0;iDash<num.length();iDash++) {
			adaptiveDash+="-";
		}
		return adaptiveDash;
	}
}
