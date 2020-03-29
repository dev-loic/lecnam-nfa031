package TD4;

import java.util.Scanner;

public class Exercice3_Q2_TableMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int nbUser = 0, result = 0, i = 0;
		boolean isCorrect = false;

		do {
			System.out.print("Saisissez l'entier de la table : ");
			nbUser = sc.nextInt();

			if (nbUser<1 || nbUser>9) {
				System.out.println("Veuillez saisir un entier compris entre 1 et 9.");
				continue; // on recommence la boucle while
			} else {
				isCorrect = true;
			}
			// rq : comme on a un continue qui recommence la boucle, dans ce cas précis, 
			// le "else" n'est pas nécessaire. En effet on passera jamais dans le code qui
			// suit le "if (nbUser<1 || nbUser>9)" si l'entier n'est pas correct. 
		} while(!isCorrect);

		System.out.println("Table de multiplication de "+nbUser);
		for (i=1;i<=9;i++) {
			result = i*nbUser;
			System.out.println(i+" x "+nbUser+" = "+result);
		}
		sc.close();
	}
}

