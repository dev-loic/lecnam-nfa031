package TD10;

public class factoriel {

	public static void main(String[] args) {
		System.out.println(factorielIteratif(6));
		System.out.println(factorielRecursif(6));
	}
	
	static int factorielIteratif(int n){
		int factoriel = 1;
		for (int i=1; i<=n; i++) {
			factoriel *= i;
		}
		return factoriel;
	} 
	
	static int factorielRecursif(int n){
		if(n==0) {
			return 1;
		} else {
			return (n*factorielRecursif(n-1));
		}
	} 
}
