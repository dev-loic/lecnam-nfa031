package TD5;

public class Exercice1_Enonce {

	public static void main(String[] args) {
		for (int i=1;i<=2;i++) {
			for (int j=1;j<=i;j++) {
				int k=i*j;
				if (k<10) {
					System.out.println('0');
				}
				System.out.println(k+" ");
			}
			System.out.println();
		}
	}
}


