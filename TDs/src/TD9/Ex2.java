package TD9;

public class Ex2 {

	public static void main(String[] args) {
		double ex1 = 0.0, ex2 = 2.0, ex3 = -3.0;
		
		// Exemples de tests unitaires sur les fonctions carre et cube
		System.out.println("\n **Exemple 1**");
		System.out.println("Attendu : 0^2=0 | Résultat : 0^2="+carre(ex1));
		System.out.println("Attendu : 0^3=0 | Résultat : 0^3="+cube(ex1));
		
		System.out.println("\n **Exemple 2**");
		System.out.println("Attendu : 2^2=4 | Résultat : 2^2="+carre(ex2));
		System.out.println("Attendu : 2^3=8 | Résultat : 2^3="+cube(ex2));
		
		System.out.println("\n **Exemple 3**");
		System.out.println("Attendu : (-3)^2=9 | Résultat : (-3)^2="+carre(ex3));
		System.out.println("Attendu : (-3)^3=-27 | Résultat : (-3)^3="+cube(ex3));

	}

	static double carre(double a) {
		return a*a;
	}
	
	static double cube(double a) {
		return carre(a)*a;
	}
}
