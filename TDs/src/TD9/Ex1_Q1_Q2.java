package TD9;

import java.util.Scanner;

public class Ex1_Q1_Q2 {

	// Question 1 : Ce programme affiche le resultat de la division entiere.
	
	// Question 2 : Creation d une fonction divisionEntiere
	
	static int divisionEntiere(int x,int y) {
		int result=0, current=x;
		while(current>=y) {
			current-=y; // current = current-y
			result+=1; // result = result+1
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=0, y=0;
		int result = 0;
		
		System.out.print("Entrez la valeur de x : ");
		x = Integer.parseInt(sc.nextLine());
		
		System.out.print("Entrez la valeur de y : ");
		y = Integer.parseInt(sc.nextLine());
		
		result = divisionEntiere(x,y);
		System.out.println(x+"/"+y+" = "+result);
	
		sc.close();
	}
}
