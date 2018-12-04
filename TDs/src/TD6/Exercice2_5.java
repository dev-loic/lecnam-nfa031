package TD6;

import java.util.Scanner;

public class Exercice2_5 {

	public static void main(String[] args) {	
		int i=0, sizeTab = 0;
		boolean error = true;
		Scanner sc = new Scanner(System.in);
		
		// On demande à l'utilisateur la taille souhaitée pour son tableau
		do
		{
			System.out.print("Quelle taille pour votre tableau ? ");
			sizeTab=sc.nextInt();
			if(sizeTab<0) 
			{
				System.out.print("[ERREUR] Saisissez une taille positive");
			}
			error = false;
		} while (error);
		sc.nextLine(); // Obligatoire sinon on conserve le saut de ligne du nextInt
		
		// On peut alors initialiser notre tableau
		char [] tab = new char[sizeTab];
		for (i=0;i<sizeTab;i++)
		{
			System.out.print("Saisissez un caractère : ");
			tab[i]=sc.nextLine().charAt(0);
		}
		
		// On affiche le tableau
		for (i=0;i<sizeTab;i++)
		{
			System.out.print(tab[i]+" | ");
		}
		// Pour clore le Scanner
		sc.close();
	}

}
