package TD13;

public class Exo713_chiffres_romains {

	public static void main(String[] args) {
		String test = "MCCLXVI";
		System.out.println(convertRomanNumberToInt(test));
	}

	// convertit un nombre (plusieurs chiffres) romain en entier
	static int convertRomanNumberToInt(String iRomanNumber) {
		int result = 0, sizeNumber=iRomanNumber.length();
		char nextLetter, curLetter;
		int nextValue=0, curValue=0;
		
		for(int i=sizeNumber-1;i>=0;i--) {
			// On est oblige de calculer la lettre suivante, afin de faire les calculs inverses
			// Ex1 : IX = 9 car I place devant X enleve 1 a 10
			// Ex2 : XI = 11 car I place apres X ajoute 1 a 10 
			curLetter=iRomanNumber.charAt(i);
			if(i<sizeNumber-1) {
				nextLetter=iRomanNumber.charAt(i+1);
			} else {
				nextLetter=curLetter;
			}
			
			curValue=convertRomanLetterToInt(curLetter);
			nextValue=convertRomanLetterToInt(nextLetter);
			
			if (curValue<nextValue) {
				result-=curValue;
			} else {
				result+=curValue;
			}
		}	
		return result;
	}
	
	// Prend en entree un caractere romain et renvoie sa valeur numerique
	static int convertRomanLetterToInt (char iRomanLetter) {
		char [] tabRomanChar         = {'I','V', 'X' ,'L', 'C' , 'D' , 'M'  };
		int  [] tabIntCorrespondance = { 1 , 5 , 10  ,50 , 100 , 500 , 1000 };
		int sizeTabs = tabRomanChar.length; // les deux ont la meme taille
		int result=0;

		for(int i=0;i<sizeTabs;i++) {
			if(iRomanLetter==tabRomanChar[i]) {
				result = tabIntCorrespondance[i];
				break;
			}
		}
		if (i==sizeTabs) { // Erreur
			System.out.println("[ERREUR] : la lettre entrée ne correspond pas à un chiffre romain");
		}
		return result;
	}
}
