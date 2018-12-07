package TD5;

import java.util.Scanner;

public class Exercice4_Enonce {

	public static void main(String args[]) 
	{
		int a=0, b=0, r=1; 
		Scanner sc = new Scanner(System.in);

		System.out.print("Entrez a : "); 
		a = sc.nextInt(); 
		System.out.print("Entrez b : "); 
		b = sc.nextInt(); 

		while (b != 0) 
		{
			if (b % 2 == 0) 
			{ 
				a = a*a;
				b = b/2;
			} 
			else 
			{
				r = r*a;
				b = b-1; 
			}
		}
		System.out.println("Résultat "+a); 
		System.out.println("Résultat "+b); 
		System.out.println("Résultat "+r);
		sc.close();
	}

}



