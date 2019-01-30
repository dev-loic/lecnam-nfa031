package TD13;

public class Exo714_2_CodeACle {

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
		int key = 23781;
		String codedTest = encodageCle(test,key);
		String decodedTest = decodageCle(codedTest,key);
		System.out.println("\nChaine de départ : " + test);
		System.out.println("Chaine cryptée : " + codedTest);
		System.out.println("Chaine decryptée : " + decodedTest);
	}
	
	static String encodageCle (String iChaineToCode, int key)
	{
		String keyString = Integer.toString(key);
		int sizeChaineToCode = iChaineToCode.length(), i=0, j=0, sizeKey=keyString.length(); 
		char [] iTabCharCoded = new char[sizeChaineToCode];
		
		for (i=0;i<sizeChaineToCode;i++)
		{ 
			if (!Character.isLetter(iChaineToCode.charAt(i)))
			{
				// si pas une lettre, on ne touche à rien
				iTabCharCoded[i]=iChaineToCode.charAt(i);
			}
			else 
			{
				j = i%sizeKey;
				iTabCharCoded[i]=encodeCharCle(iChaineToCode.charAt(i),Character.getNumericValue(keyString.charAt(j)));
			}

		}
		
		return new String(iTabCharCoded);
	}
	
	static char encodeCharCle (char iCharacter, int iShift)
	{
		// Minuscule, on prend en ref 'a'
		int beginCharCode = 0, curCharCode = 0, charCodedCode = 0;
		
		if (Character.isLowerCase(iCharacter))
		{
			// Minuscule, on prend en ref 'a'
			beginCharCode = 'a';
		}
		else if (Character.isUpperCase(iCharacter))
		{
			// Minuscule, on prend en ref 'A'
			beginCharCode = 'A';
		}
		
		curCharCode = iCharacter-beginCharCode;// on ramène le code entre 0 et 25
		// on ajoute les 3 qu'on module 26 afin de recupérer le reste de la division entiere
		// Exemples : 
		// ('a'-'a'+3)%26 = (0 + 3)%26 = 'd'
		// ('y'-'a'+3)%26 = (24+3)%26 = 27%26 = 1 => 'b'
		charCodedCode=(curCharCode+iShift)%26+beginCharCode; 
		
		return (char)charCodedCode;
	}
	
	static String decodageCle (String iChaineToDecode, int key)
	{
		String keyString = Integer.toString(key);
		int sizeChaineToDecode = iChaineToDecode.length(), i=0, j=0, sizeKey=keyString.length();
		char [] iTabCharDecoded = new char[sizeChaineToDecode];
		
		for (i=0;i<sizeChaineToDecode;i++)
		{
			if (!Character.isLetter(iChaineToDecode.charAt(i)))
			{
				// si pas une lettre, on ne touche à rien
				iTabCharDecoded[i]=iChaineToDecode.charAt(i);
			}
			else 
			{
				j = i%sizeKey;
				System.out.print(keyString.charAt(j)+ " ");
				iTabCharDecoded[i]=decodeCharCle(iChaineToDecode.charAt(i), Character.getNumericValue(keyString.charAt(j)));
			}

		}
		
		return new String(iTabCharDecoded);
	}
	
	static char decodeCharCle (char iCharacter, int iShift)
	{
		int endCharCode = 0, curCharCode = 0, charCodedCode = 0;
		
		if (Character.isLowerCase(iCharacter))
		{
			// Minuscule, on prend en ref 'z'
			endCharCode = 'z';
		}
		else if (Character.isUpperCase(iCharacter))
		{
			// Minuscule, on prend en ref 'Z'
			endCharCode = 'A';
		}
		
		curCharCode = iCharacter-endCharCode;
		// operation inverse du codage
		System.out.println((curCharCode-iShift)%26);
		charCodedCode=endCharCode+(curCharCode-iShift)%26; 
		
		return (char)charCodedCode;
	}


}
