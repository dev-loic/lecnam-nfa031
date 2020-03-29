package TD9;

import java.util.Scanner;

public class Ex1_Q3 {

	// En maths, la division par zero est interdite,
	// En informatique, laisser cette possibilite est risquee
	// En effet, le resultat explose ce qui peut causer de serieux dommages dans les programmes.
	
	static int divisionEntiere(int x,int y) {
		int result=0, current=x;	
		if (y==0) {
			System.out.println("La division par 0 est impossible !!! ");
			return -1;
		}
		
		while(current>=y) {
			current-=y; // current = current-y
			result+=1; // result = result+1
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=0, y=0, result=-1;

		System.out.print("Entrez la valeur de x : ");
		x = Integer.parseInt(sc.nextLine());

		System.out.print("Entrez la valeur de y : ");
		y = Integer.parseInt(sc.nextLine());

		result = divisionEntiere(x,y);

		if (result==-1) {
			System.out.println("Le programme a rencontré une erreur.");
		} else {
			System.out.println(x+"/"+y+" = "+result);
		}

		sc.close();
	}
}
