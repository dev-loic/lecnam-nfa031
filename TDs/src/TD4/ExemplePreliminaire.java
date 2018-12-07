package TD4;

import java.util.Scanner;

public class ExemplePreliminaire {

	public static void main(String[] args) {
		int total = 0 ; 
		int x;
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("Entrez le multiplicateur : ");
		x = sc.nextInt();
		
		for (int i=1;i<=4;i++)
		{
			total += (i*x);
			// equivalent à total=total+(i*x)
		}
		System.out.println("La somme des 4 premiers multiples de " + x + " est : ");
		System.out.println(total);
		System.out.println();
		sc.close();
	}
}


