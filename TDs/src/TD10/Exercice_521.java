package TD10;

public class Exercice_521 {
	
	public static void main(String[] args) {
		int n1 = 2, n2 = 3, n3 = 10;
		System.out.println("n=2 --> attendu : 5 | calculé : "+ sommeCarresIteratif(n1));
		System.out.println("n=2 --> attendu : 5 | calculé : "+ sommeCarresRecursif(n1));
		System.out.println("n=3 --> attendu : 14 | calculé : "+ sommeCarresIteratif(n2));
		System.out.println("n=3 --> attendu : 14 | calculé : "+ sommeCarresRecursif(n2));
		System.out.println("n=10 --> attendu : 385 | calculé : "+ sommeCarresIteratif(n3));
		System.out.println("n=10 --> attendu : 385 | calculé : "+ sommeCarresRecursif(n3));
	}
	
	// 0^2 + 1^2 + 2^2 + 3^2
	// 0^2 + 1^2 + 2^2
	// 0^2 + 1^2
	// 0^2	
	static int sommeCarresRecursif (int n) {
		int somme = 0;		
		if (n==0) {
			somme = 0;
		} else {
			somme = sommeCarresRecursif(n-1) + n*n;		
		}
		return somme;
	}
	
	static int sommeCarresIteratif (int n) {
		int somme = 0;	
		for (int i=0;i<=n;i++) {
			somme+=i*i;
		}	
		return somme;
	}
}
