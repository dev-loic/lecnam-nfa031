package cours06;

public class TestValeursParDefaut {

	public static void main(String[] args) {
		
		
		// Tableau d'entiers
		int [] tabInt = new int[10];
		int sizeTab = tabInt.length;
		for (int i=0;i<sizeTab;i++)
		{
			System.out.print(tabInt[i]+" | ");
		}
		
		System.out.println();
		
		
		// Tableau de caractèresc
		char [] tabChar = new char[10];
		for (int i=0;i<tabChar.length;i++)
		{
			System.out.print(tabChar[i]+" | ");
		}
		
		System.out.println();
		
		// Tableau de caractères
		boolean [] tabBoolean = new boolean[10];
		for (int i=0;i<tabBoolean.length;i++)
		{
			System.out.print(tabBoolean[i]+" | ");
		}

	}

}
