package TD8;

public class ExempleSousProgrammes {

	public static void main(String[] args) {
		int [] tab = {1,2,3,4,5};
		int size = tab.length, j=size-1, temp=0;
		
		// Premier affichage du tableau
		for (int i=0;i<size;i++) {
			System.out.print(tab[i]+" | ");
		}
		
		// Inversion du tableau
		for (int i=0;i<size/2;i++) {
			temp=tab[i];
			tab[i]=tab[j];
			tab[j]=temp;
			j--;
		}
		
		System.out.println();
		// Deuxième affichage du tableau
		for (int i=0;i<size;i++) {
			System.out.print(tab[i]+" | ");
		}
	}
}

