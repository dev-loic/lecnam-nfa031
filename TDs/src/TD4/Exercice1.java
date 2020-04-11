package TD4;

import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x;
		System.out.print("Saisissez un entier svp : ");
		x = sc.nextInt();
		for(int i=0;i<4;i++) {
			System.out.println(x+i);
		}
		System.out.println("Fini");
		sc.close();
	}
}

