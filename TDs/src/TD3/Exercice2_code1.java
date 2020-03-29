package TD3;

import java.util.Scanner;

public class Exercice2_code1 {

	public static void main(String[] args) {
		// On declare nos variables
		Scanner sc = new Scanner (System.in);
		double noteExam=0.0, notePartiel=0.0, noteFinale=0.0;
		// On demande la note de l'exam final
		System.out.print("Saisissez la note obtenue à l'examen : ");
		noteExam = sc.nextInt();
		if (noteExam<7) {
			System.out.println("==> Vous êtes éliminé...");
		} else {
			// On demande la note de l'examen partiel
			System.out.print("Saisissez la note obtenue au partiel (saisissez -1 si pas de note) : ");
			notePartiel = sc.nextInt();
			// On stocke la moyenne des deux dans noteFinale
			noteFinale = (noteExam+notePartiel)/2;
			if (noteFinale < noteExam) {
				noteFinale=noteExam;
			}
			System.out.println("Vous validez avec une note finale de " + noteFinale);
		}
		sc.close();
	}
}



