package TD13;

public class Exo714_CodeCesar {

	public static void main(String[] args) {
		// on peut facilement transformer les char en int (un char=un int)
		// 'a' = 97
		System.out.println((int)'a');
		// 'z' = 122
		System.out.println((int)'z');
		// 'A' = 65
		System.out.println((int)'A');
		// 'B' = 90
		System.out.println((int)'Z');
		
		// Pour l'exercice, on ne prend pas les caracteres accentués comme é, è, ç, etc
		String test = "Bonjour a tous !";
		String codedTest = encodageCesar(test);
		String decodedTest = decodageCesar(codedTest);
		System.out.println("Chaine de départ : " + test);
		System.out.println("Chaine cryptée : " + codedTest);
		System.out.println("Chaine decryptée : " + decodedTest);
	}
	
	// Methode qui encode une chaine de caractere a laide du code cesar
	static String encodageCesar (String iChaineToCode) {
		int sizeChaineToCode = iChaineToCode.length();
		char [] iTabCharCoded = new char[sizeChaineToCode];
		
		for (int i=0;i<sizeChaineToCode;i++) {
			if (!Character.isLetter(iChaineToCode.charAt(i))) {
				// si pas une lettre, on ne touche à rien
				iTabCharCoded[i]=iChaineToCode.charAt(i);
			} else {
				iTabCharCoded[i]=encodeCesar(iChaineToCode.charAt(i));
			}
		}
		return new String(iTabCharCoded);
	}
	
	// methode qui encode un caractere a l aide du code cesar
	static char encodeCesar (char iCharacter) {
		// Minuscule, on prend en ref 'a'
		int beginCharCode = 0, curCharCode = 0, charCodedCode = 0;
		if (Character.isLowerCase(iCharacter)) {
			// Minuscule, on prend en ref 'a'
			beginCharCode = 'a';
		} else if (Character.isUpperCase(iCharacter)) {
			// Minuscule, on prend en ref 'A'
			beginCharCode = 'A';
		}
		curCharCode = iCharacter-beginCharCode;// on ramène le code entre 0 et 25
		// on ajoute les 3 qu'on module 26 afin de recupérer le reste de la division entiere
		// Exemples : 
		// ('a'-'a'+3)%26 = (0 + 3)%26 = 'd'
		// ('y'-'a'+3)%26 = (24+3)%26 = 27%26 = 1 => 'b'
		charCodedCode=(curCharCode+3)%26+beginCharCode; 
		return (char)charCodedCode;
	}
	
	// Decodage Cesar d une chaine de caractere
	static String decodageCesar (String iChaineToDecode) {
		int sizeChaineToDecode = iChaineToDecode.length();
		char [] iTabCharDecoded = new char[sizeChaineToDecode];
		
		for (int i=0;i<sizeChaineToDecode;i++) {
			if (!Character.isLetter(iChaineToDecode.charAt(i))) {
				// si pas une lettre, on ne touche à rien
				iTabCharDecoded[i]=iChaineToDecode.charAt(i);
			} else {
				iTabCharDecoded[i]=decodeCesar(iChaineToDecode.charAt(i));
			}
		}
		return new String(iTabCharDecoded);
	}
	
	// decodage cesar d un caractere
	static char decodeCesar (char iCharacter) {
		int endCharCode = 0, curCharCode = 0, charCodedCode = 0;
		if (Character.isLowerCase(iCharacter)) {
			// Minuscule, on prend en ref 'z'
			endCharCode = 'z';
		} else if (Character.isUpperCase(iCharacter)) {
			// Minuscule, on prend en ref 'Z'
			endCharCode = 'Z';
		}
		curCharCode = iCharacter-endCharCode;
		// operation inverse du codage
		charCodedCode=endCharCode+(curCharCode-3)%26; 
		return (char)charCodedCode;
	}
}
