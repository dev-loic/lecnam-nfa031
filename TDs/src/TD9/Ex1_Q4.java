package TD9;

import java.util.Scanner;

public class Ex1_Q4 {
	
	static int divisionEntiere(int x,int y)
	{
		int result=0, current=Math.abs(x), signe=1;
		
		if (y==0)
		{
			System.out.println("La division par 0 est impossible !!! ");
			// le choix de Integer.MIN_VALUE est arbitraire
			return Integer.MIN_VALUE;
		}
		
		// On gère le signe du résultat
		// Si x et y sont tous les 2 négatifs ou tous les 2 positifs => signe positif
		// sinon signe négatif
		if ((x<0 && y<0) || (x>0 && y>0)) signe=1;
		else signe=-1;
		
		// On utilise la fonction valeur absolue (Math.abs)
		// Cette fonctionne permet de s'assurer que la valeur qu'on utilise est positive
		// Ex1 : Math.abs(-3) = 3
		// Ex2 : Math.abs(5) = 5
		// Ainsi en s'assurant de travailler avec des valeurs positives, on peut utiliser le même algo
		// Le signe étant déjà sauvegardé dans la variable "signe"
		while(current>=Math.abs(y))
		{
			current-=Math.abs(y); // current = current-y
			result+=1; // result = result+1
		}
		// On retourne alors le résultat affublé du signe calculé précedemment
		return signe*result;
	}
	
	public static void main(String[] args) {
		int x=0, y=0, result=-1;
		Scanner sc = new Scanner(System.in);

		System.out.print("Entrez la valeur de x : ");
		x = Integer.parseInt(sc.nextLine());

		System.out.print("Entrez la valeur de y : ");
		y = Integer.parseInt(sc.nextLine());

		result = divisionEntiere(x,y);

		if (result==Integer.MIN_VALUE) System.out.println("Le programme a rencontré une erreur.");
		else System.out.println(x+"/"+y+" = "+result);

		// Clôture du Scanner
		sc.close();
	}

}
