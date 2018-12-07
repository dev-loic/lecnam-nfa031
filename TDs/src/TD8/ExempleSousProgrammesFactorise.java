package TD8;

public class ExempleSousProgrammesFactorise {

	public static void main(String[] args) {
		int [] tab = {1,2,3,4,5};
		
		// Premier affichage du tableau
		afficherTableau(tab);
		
		// Inversion du tableau
		inverserTableau(tab);
		
		System.out.println();
		// Deuxième affichage du tableau
		afficherTableau(tab);

	}
	
	static void afficherTableau(int [] iTab)
	{
		int size = iTab.length, i=0;
		for (i=0;i<size;i++)
		{
			System.out.print(iTab[i]+" | ");
		}
	}
	
	static void inverserTableau(int [] iTab)
	{
		int size = iTab.length, i=0, j=size-1, temp=0;
		for (i=0;i<size/2;i++)
		{
			temp=iTab[i];
			iTab[i]=iTab[j];
			iTab[j]=temp;
			j--;
		}
	}
	
	
	

}
