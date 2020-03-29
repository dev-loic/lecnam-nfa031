package TD11;

public class exemple_cours {
	
	public static void main(String[] args) {
		
		//String chaine1 = "ceci est ma chaine";
		//String chaine2 = new String("ceci est ma Deuxieme chaine");
		
		char [] tabChar = {'a','b','c'};
		String chaine3 = new String(tabChar);
		// chaine3="abc";
		
		for(int i=0;i<tabChar.length;i++)
			System.out.print(tabChar[i]);
		
		System.out.println();
		System.out.println(chaine3);
		
		tabChar[0]='o';
		tabChar[1]='p';
		tabChar[2]='t';
		
		for(int i=0;i<tabChar.length;i++) {
			System.out.print(tabChar[i]);
		}
		
		System.out.println();
		System.out.println(chaine3);
		
		char [] tabChar2;
		
		tabChar2=tabChar;
		
		tabChar2[1]='4';
		for(int i=0;i<tabChar.length;i++) {
			System.out.print(tabChar[i]);
		}
	}
}
