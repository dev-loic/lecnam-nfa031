package TD11;

public class Exo613 {
	
	public static void main(String[] args) 
	{
		char [] exOKtabChar = {'c','n','A','m'};
		String exOKchain1 = "cnAm";
		String exOKchain2 = "cNaM";
		String exKOchain = "pAs cNam";

		System.out.println("Ex OK (ancien algo) -> Attendu : true | Résulat : " + areEquals(exOKtabChar,exOKchain1));
		System.out.println("Ex OK (nouvel algo) -> Attendu : true | Résulat : " + areEqualsCasse(exOKtabChar,exOKchain1));
		System.out.println("Ex OK (ancien algo) -> Attendu : false | Résulat : " + areEquals(exOKtabChar,exOKchain2));
		System.out.println("Ex OK (nouvel algo) -> Attendu : true | Résulat : " + areEqualsCasse(exOKtabChar,exOKchain2));
		System.out.println("Ex KO (ancien algo) -> Attendu : false | Résulat : " + areEquals(exOKtabChar,exKOchain));
		System.out.println("Ex KO (nouvel algo) -> Attendu : false | Résulat : " + areEqualsCasse(exOKtabChar,exKOchain));
	}
	
	static boolean areEqualsCasse (char [] iTabChar, String chain)
	{
		boolean areEquals=true;
		// On construit un string a partir d iTabChar
		String stringTabChar = new String(iTabChar);
		// on passe les 2 strings en miniscules 
		// on pourrait faire la même en majuscule, le tout est d avoir la meme casse pour les 2
		stringTabChar=stringTabChar.toLowerCase();
		chain=chain.toLowerCase();
		
		if (!stringTabChar.equals(chain)) areEquals=false;
		
		return areEquals;
	}
	
	static boolean areEquals(char [] iTabChar, String chain)
	{
		boolean areEquals=true;
		// On construit un string a partir d iTabChar
		String stringTabChar = new String(iTabChar);
		
		if (!stringTabChar.equals(chain)) areEquals=false;
		
		return areEquals;
		
		// Rque : on pourrait utiliser la méthode telle quelle de l exo precedent
		// Mais on voit ici que c est bien plus rapide
	}

}
