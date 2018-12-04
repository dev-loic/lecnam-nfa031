package cours04;

import java.util.Scanner;

public class Exercice4_Correction_EurosDollarBoucle {

	public static void main(String[] args) {
		double coursDollar=0.0, sommeEuros=0.0, sommeDollars=0.0;
		boolean out = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisissez le cours du dollar en cours (valeur de 1 dollar) : ");
		coursDollar=sc.nextDouble();
		
		while(!out)
		{			
			System.out.print("Saisissez une somme en euros : ");
			sommeEuros=sc.nextDouble();
			
			sommeDollars=sommeEuros/coursDollar;
			System.out.println(sommeEuros+"€ vaut "+sommeDollars+"$");
			
			System.out.print("Voulez-vous convertir une autre somme? (O ou N)");
			if(sc.next().charAt(0)=='N') { System.out.println("Byebye"); out=true; }
		}
		sc.close();
	}

}


