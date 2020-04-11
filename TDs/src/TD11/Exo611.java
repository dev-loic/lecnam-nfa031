package TD11;

public class Exo611 {

	public static void main(String[] args) {
		// rappel : args contient les arguments donnés à l'exe
		// Pour donner des arguments à un exe, cliquez sur la petite flèche
		// A cote du bouton de Run classique (lecture vert), puis "Run Configurations" 
		// Et enfin onglet "Argument". Vous pouvez alors préciser des arguments !
		int sizeArgs=args.length, somme=0;
		double moyenne=0.0;
		
		for (int i=0;i<sizeArgs;i++) {
			somme+=Integer.parseInt(args[i]);
		}
		moyenne = ((double)somme)/sizeArgs;
		System.out.println("Moyenne = " + moyenne);
	}

}
