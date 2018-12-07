package TD3;

import java.util.Scanner;

// rq : certaines lignes sont commentées car elles génèrent des erreurs de
// compilation et j'aime pas voir du rouge sur Eclipse :) 

// Réponses à la question 1 : directement dans le code
// Réponse à la question 2 : On les retrouve l.33, l.34 et l.22.

public class _TD3PbsCompilation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Err1 : mauvaise déclaration -> d et double sont inversés (erreur de syntaxe)
		//d double;
		int x=7;
		x = x+1;
		// Err2 : Manque le point virgule (erreur de syntaxe)
		//int z
		char c='{';
		// Err3 : z non initialisée
		//x=x+z;
		System.out.print(x);
		System.out.println("c="+c);
		//boolean tt;
		// Err4 : on met la valeur d’un int dans un booléen => impossible (erreur de typage)
		//tt=x+4;
		// Err5 : bb n’est pas initialisée et on compare 3 qui est un int avec tt qui est un booléen (erreur de typage)
		//bb = 3 < tt;
		// Err6 : ligne invalide car on essaye d’affecter une valeur à x+1 => java ne prend pas en compte ce type d’expression (il aurait plutôt fallu écrire x = 3-1 = 2)
		//x+1 = 3;
		sc.nextInt();
		System.out.println(sc.nextInt(3));
		System.out.println(sc.nextInt()+4);
		Math.min(sc.nextInt(), x);
		x=2;
		System.out.println(Math.min(sc.nextInt(), x));
		x = sc.nextInt();
		System.out.println(131486249+"    ");
		System.out.println();
		sc.close();
	}
}


