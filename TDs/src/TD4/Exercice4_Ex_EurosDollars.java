package TD4;

import java.util.Scanner;

public class Exercice4_Ex_EurosDollars {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double coursDollar=0.0, sommeEuros=0.0, sommeDollars=0.0;
		
		System.out.print("Saisissez le cours du dollar en cours (valeur de 1 dollar) : ");
		coursDollar=sc.nextDouble();
		
		System.out.print("Saisissez une somme en euros : ");
		sommeEuros=sc.nextDouble();
		
		sommeDollars=sommeEuros/coursDollar;
		System.out.print(((int)(sommeEuros*100))/100+"€ vaut "+((int)(sommeDollars*100))/100.+"$");
		
		sc.close();
	}
}

