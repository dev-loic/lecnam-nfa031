package TD4;

import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {
		int puis=1;
		int x,res;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisissez un entier svp : ");
		x = sc.nextInt();
		res=x;
		while (res<1000)
		{
			res=res*x;
			puis=puis+1;
		}
		System.out.println("Le résultat est : ");
		System.out.println(puis);
		System.out.println();
		sc.close();
	}
}

