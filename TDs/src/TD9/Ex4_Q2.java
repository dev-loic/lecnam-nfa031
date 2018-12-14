package TD9;

public class Ex4_Q2 {

	public static void main(String[] args) {
		char [] tab1 = {'a','b','c'};
		char [] tab2 = {'a','b','c','b','d','b','a','d'};
		
		System.out.println("nbOccurences('z',tab1) --> attendu : 0 | résultat : "+ nbOccurences('z',tab1));
		System.out.println("nbOccurences('a',tab1) --> attendu : 1 | résultat : "+ nbOccurences('a',tab1));
		System.out.println("nbOccurences('b',tab2) --> attendu : 3 | résultat : "+ nbOccurences('b',tab2));
		
	}
	
	static int nbOccurences (char iChar, char [] tabChar)
	{
		int sizeTab = tabChar.length, i=0, count=0;
		
		// On parcourt le tableau en entier
		// A chaque fois qu'on trouve iChar, on augmente le compteur count
		for (i=0;i<sizeTab;i++)
		{
			if (tabChar[i]==iChar) count++;
		}
		
		return count;
	}
	
}
