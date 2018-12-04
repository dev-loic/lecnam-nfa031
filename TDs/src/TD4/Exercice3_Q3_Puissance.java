package cours04;

import java.util.Scanner;

public class Exercice3_Q3_Puissance {

	public static void main(String[] args) {
		int x = 0, y = 0, count = 0, result = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisissez x : ");
		x = sc.nextInt();
		System.out.print("Saisissez y : ");
		y = sc.nextInt();

		while(count<y)
		{
			result=result*x;
			count++;
		}
		System.out.print(x+"^"+y+" = "+result);
		sc.close();
	}

}

