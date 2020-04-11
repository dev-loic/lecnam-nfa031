package TD9;

public class Ex4_Q3 {

	public static void main(String[] args) {
		char [] tab1 = {'a','b','c'};
		char [] tab2 = {'a','b','c','b','d','b','a','d'};
		char [] tab3 = {'a','b','z','c'};
		
		System.out.println("crossIsIn(tab1,tab2) --> attendu : true | résultat : "+ crossIsIn(tab1,tab2));
		System.out.println("crossIsIn(tab2,tab1) --> attendu : false | résultat : "+ crossIsIn(tab2,tab1));
		System.out.println("crossIsIn(tab1,tab3) --> attendu : true | résultat : "+ crossIsIn(tab1,tab3));
		System.out.println("crossIsIn(tab3,tab2) --> attendu : false | résultat : "+ crossIsIn(tab3,tab2));
	}
	
	static boolean crossIsIn(char [] tab1, char [] tab2) {
		int sizeTab1 = tab1.length;
		boolean output = true;

		// on parcourt le premier tableau en entier (tab1)
		for (int i=0;i<sizeTab1;i++) {
			// Pour chaque caractère présent dans un tab1,
			// On teste s'il se trouve dans tab2 grâce à la méthode isIn
			// Si ce n'est pas le cas, on sort
			if (!isIn(tab1[i],tab2)) {
				output = false;
				break;
			}
		}
		return output;
	}
	
	// Cette fonction provient de la question 1 
	// Elle permet de tester si le caractère iChar est présent au moins une fois
	// dans le tableau tabChar
	static boolean isIn (char iChar, char [] tabChar) {
		int sizeTab = tabChar.length, i=0;
		boolean output = false;
		
		// On parcourt tout le tableau tabChar a la recherche de iChar
		// Si on le trouve, on value la sortie et on arrête la boucle
		for (i=0;i<sizeTab;i++) {
			if (tabChar[i]==iChar) {
				output = true;
				break;
			}
		}
		return output;
	}
}
