package TD13;

public class exo711_StringToInt {

	public static void main(String[] args) {
		String test1 = "123";
		String test2 = "1a3";
		String test3 = "-123";
		
		// Tests
		System.out.println("Expected : 123 | Computed : "+stringToInt(test1));
		System.out.println("Expected : ERROR | Computed : "+stringToInt(test2));
		System.out.println("Expected : -123 | Computed : "+stringToInt(test3));
	}
	
	static int stringToInt (String iChaine)
	{
		// on trim iChaine i.e quon enleve les espaces avant et apres
		// la méthode toCharArray permet de transformer notre chaine en tableau de char
		char [] tabChaine = iChaine.trim().toCharArray();
		int sizeChaine=tabChaine.length, i=0, result=0, signe=1;
		
		// on teste si le premier element est un signe -
		if(tabChaine[0]=='-')
		{
			// Si cest le cas on a un nombre negatif et on passe i a 1, pour continuer le parcours de la chaine
			signe=-1;
			i=1;
		}
		
		// on parcourt alors la chaine, a la recherche de nos chiffres
		// on ne reinitialise pas i car soit il est a 0, soit on vient de le passer a 1 car le premier caractere est un signe moins
		for (;i<sizeChaine;i++)
		{
			if(!Character.isDigit(tabChaine[i])) 
			{
				System.out.println("[ERREUR] Un des caractères n'est pas un chiffre, on sort.");
				result=Integer.MIN_VALUE; // on met en valeur par defaut le minimum representable par le type int
				break;
			}
			else 
			{
				// Importance du trim au depart, ici on prend en compte la taille de la chaine pour notre calcul
				// on multiplie le digit en cours par la puissance de 10 correspondante et on l ajoute au resultat
				// rque : la methode Math.pow permet d'élever le premier argument à la puissance 
				// correspondant au deuxième argument
				result+=(Character.getNumericValue(tabChaine[i]))*Math.pow(10, sizeChaine-1-i);		
			}
		}
		return signe*result;
	}

}
