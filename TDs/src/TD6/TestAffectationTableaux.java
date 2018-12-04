package TD6;

public class TestAffectationTableaux {

	public static void main(String[] args) {
		int [] tab1 = {1,2,3,4,5}; // tab1 = 1 | 2 | 3 | 4 | 5
		int [] tab2 = new int[3]; // tab2 = 0 | 0 | 0
		
		// On modifie tab1 et tab2
		tab1[1]=7; // tab1 = 1 | 7 | 3 | 4 | 5
		tab2[0]=9; // tab2 = 9 | 0 | 0
		
		// On affecte tab1 à tab2
		tab2 = tab1; // Ce qui se trouvait à @tab2 est perdu

		// On modifie tab1 et tab2
		tab1[4]=1; // tab1 = 1 | 7 | 3 | 4 | 1
		tab2[0]=0; // tab2 = 0 | 7 | 3 | 4 | 1 & tab1 = 0 | 7 | 3 | 4 | 1
	}

	
}
