package TD9;

public class Ex6_Enonce {

	public static void main(String[] args) {
		int[] ex = {1,5,8,9,7};
		int[] ex2 = {12, 5, 8, 123};
		afficheTable(ex);
		afficheTable(ex2);
	}

	static void afficheTable(int[] iTab) {
		int size = iTab.length;
		System.out.print('+');
		for (int i=0; i<size; i++){
			System.out.print("---+");
		}
		System.out.println();
		System.out.print('|');
		for (int i=0; i<size; i++) {
			System.out.print(" " + iTab[i] + " |");
		}
		System.out.println();
		System.out.print('+');
		for (int i=0; i<size; i++) {
			System.out.print("---+");
		}
		System.out.println();
	}
}


