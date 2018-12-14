package TD9;

public class Ex5 {
	
	public static void main(String[] args) {
		int i=0, sizeTab3;
		int [] tab1 = {12,17,15,10};
		int [] tab2 = {13,14,11};
		int [] tab3;
		
		System.out.println("concatenate(tab1,tab2) --> ");
		System.out.println("Attendu : {12,17,15,10,13,14,11}");
		tab3 = concatenate(tab1,tab2);
		sizeTab3 = tab3.length;
		System.out.print("Résultat : {");
		for(i=0;i<sizeTab3;i++)
			System.out.print(tab3[i]+",");
		System.out.print("}");
	}
	
	static int [] concatenate(int [] iTab1, int [] iTab2)
	{
		int sizeTab1 = iTab1.length, sizeTab2 = iTab2.length, i=0;
		// on cree notre tableau resultat
		int [] tabResult = new int[sizeTab1+sizeTab2]; 
		
		// On parcourt le premier tableau et on remplit tabResult avec les cases correspondantes
		for (i=0;i<sizeTab1;i++)
		{
			tabResult[i]=iTab1[i];
		}
		// arrive ici, i vaut sizeTab1, donc pas besoin de le réinitialiser
		// on repart direct pour remplir le reste du tableau
		for (;i<sizeTab1+sizeTab2;i++)
		{
			// /!\ l'indice i en cours, prend en compte la taille de iTab1 car on l'a déjà parcouru
			// Mais iTab2 lui est indicé de 0 à sizeTab2-1, donc il ne faut pas oublier de retirer
			// sizeTab1 à i pour tomber sur des indices entre 0 et sizeTab2-1
			tabResult[i]=iTab2[i-sizeTab1];
		}
		return tabResult;
	}

}
