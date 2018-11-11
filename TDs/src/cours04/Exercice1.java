package cours04;

import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisissez un entier svp : ");
		x = sc.nextInt();
		for(int i=0;i<4;i++)
		{
			System.out.println(x+i);
		}
		System.out.println("Fini");
		sc.close();
	}
}

