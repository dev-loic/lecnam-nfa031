package cours06;

import java.util.Scanner;

public class Exercice1_5 {

	public static void main(String[] args) {
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
		int index1=0, index2=-1, temp = 0, i=0, sizeTab=tab.length;
		boolean error = true;
		Scanner sc = new Scanner(System.in);
		
		do 
		{
			System.out.print("Saisissez le 1er indice : ");
			index1 = sc.nextInt();
			// si l'index est erroné on recommence la boucle
			if (index1<0 || index1>=sizeTab) 
			{
				System.out.println("[ERREUR] Veuillez saisir un indice entre 0 et "+sizeTab);
				continue;
			}
			System.out.print("Saisissez le 2ème indice : ");
			index2 = sc.nextInt();
			// si l'index est erroné on recommence la boucle
			if (index2<0 || index2>=sizeTab) 
			{
				System.out.println("[ERREUR] Veuillez saisir un indice entre 0 et "+sizeTab);
				continue;
			}
			error = false;
		} while (error);

		// On affiche le tableau avant 
		for (i=0;i<sizeTab;i++)
		{
			System.out.print(tab[i]+" | ");
		}
		System.out.println();
		// On échange les indices
		// Pour cela on utilise un entier tampon temp qui stocke provisoirement
		// La valeur de tab[index1]
		temp = tab[index1];
		tab[index1]=tab[index2];
		tab[index2]=temp;
		// On affiche le tableau après 
		for (i=0;i<sizeTab;i++)
		{
			System.out.print(tab[i]+" | ");
		}
		// Pour clore le Scanner
		sc.close();
	}

}
