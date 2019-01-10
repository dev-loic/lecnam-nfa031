package TD11;

public class Exo612 {

	public static void main(String[] args) 
	{
		char [] exOKtabChar = {'c','n','a','m'};
		String exOKchain = "cnam";
		String exKOchain = "pas cnam";

		System.out.println("Ex OK -> Résulat : " + areEquals(exOKtabChar,exOKchain));
		System.out.println("Ex KO -> Résulat : " + areEquals(exOKtabChar,exKOchain));
	}
	
	static boolean areEquals (char [] iTabChar, String iChain)
	{
		boolean areEquals=true;
		int i=0, sizeTabChar=iTabChar.length, sizeChainChar=iChain.length();
		
		// Deja si les 2 n'ont pas la même taille, pas la peine d'aller plus loin
		if(sizeTabChar!=sizeChainChar)
		{
			areEquals=false;
		}
		else
		{	
			for (i=0;i<sizeTabChar;i++)
			{
				// On parcourt les elems de la chaine et du tableau et on compare chaque elem au même indice
				// Si a un moment, un caractere est différent, on change la valeur de areEquals et on break la boucle for
				if(iTabChar[i]!=iChain.charAt(i)) 
				{
					areEquals=false;
					break;
				}
			}
		}
		
		// AUTRE SOLUTION
		// Transformer iTabChar en String et d utiliser le equals de la classe String
		// pour creation d un string a partir d un tab de char, voir correction exo suivant
		return areEquals;
	}
}
