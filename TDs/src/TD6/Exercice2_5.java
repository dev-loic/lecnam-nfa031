package TD6;

import java.util.Scanner;

public class Exercice2_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeTab = 0;
		boolean error = true;
		
		// On demande à l'utilisateur la taille souhaitée pour son tableau
		do {
			System.out.print("Quelle taille pour votre tableau ? ");
			sizeTab=Integer.parseInt(sc.nextLine());
			if(sizeTab<0) {
				System.out.print("[ERREUR] Saisissez une taille positive");
			}
			error = false;
		} while (error);
		
		// On peut alors initialiser notre tableau
		char [] tab = new char[sizeTab];
		for (int i=0;i<sizeTab;i++) {
			System.out.print("Saisissez un caractère : ");
			tab[i]=sc.nextLine().charAt(0);
		}
		
		// On affiche le tableau
		for (int i=0;i<sizeTab;i++) {
			System.out.print(tab[i]+" | ");
		}
		sc.close();
	}
}
