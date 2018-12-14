package TD9;

public class Ex4_Q1 {

	public static void main(String[] args) {
		char [] tab1 = {'a','b','c'};
		char [] tab2 = {'a','b','c','b','d','b','a','d'};
		
		System.out.println("isIn('a',tab1) --> attendu : true | résultat : "+ isIn('a',tab1));
		System.out.println("isIn('d',tab1) --> attendu : false | résultat : "+ isIn('d',tab1));
		System.out.println("isIn('d',tab2) --> attendu : true | résultat : "+ isIn('d',tab2));
		System.out.println("isIn('z',tab2) --> attendu : false | résultat : "+ isIn('z',tab2));

	}
	
	static boolean isIn (char iChar, char [] tabChar)
	{
		int sizeTab = tabChar.length, i=0;
		boolean output = false;
		
		// On parcourt tout le tableau tabChar a la recherche de iChar
		// Si on le trouve, on value la sortie et on arrête la boucle
		for (i=0;i<sizeTab;i++)
		{
			if (tabChar[i]==iChar) 
			{
				output = true;
				break;
			}
		}
		
		return output;
	}

}
