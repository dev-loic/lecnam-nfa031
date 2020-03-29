package TD6;

public class TestDifferenceTableaux {

	public static void main(String[] args) {
		// On crée 2 tableaux qui ont EXACTEMENT les mêmes données
		int [] tab1 = {1,2,3,4,5};
		int [] tab2 = {1,2,3,4,5};
		
		if (tab1!=tab2) {
			System.out.println("Les deux tableaux sont différents !");
		} else {
			System.out.println("Les deux tableaux sont identiques !");
		}
	}

}
