package cours05;

public class Exercice1_Enonce {

	public static void main(String[] args) {
		int i=0, j=0, k=0;
		
		for (i=1;i<=2;i++)
		{
			for (j=1;j<=i;j++)
			{
				k=i*j;
				if (k<10)
					System.out.println('0');
				System.out.println(k+" ");
			}
			System.out.println();
		}
	}

}


