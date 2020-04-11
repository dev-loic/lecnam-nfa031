package TD11;

public class Exo611_avectrycatch {

	public static void main(String[] args) {
		int sizeArgs=args.length, somme=0;
		double moyenne=0.0;
		
		for (int i=0;i<sizeArgs;i++) {
			// Le try-catch est utile pour "capturer" les exceptions
			// Ici si on n'a pas de int, on aura une exception
			try {
				somme+=Integer.parseInt(args[i]);
			} catch (Exception e) {
				System.out.println("Le " + i + "e argument n'est pas de type int !");
				continue;
			}
		}
		moyenne = ((double)somme)/sizeArgs;
		System.out.println("Moyenne = " + moyenne);
	}
}
