package TD3;

public class _ExemplePorteeVariable1 {

	public static void main(String[] args) {
		int a = 2;
		int x = 4;
		System.out.println("**Bloc Main**");
		System.out.println("a="+a);
		System.out.println("x="+x);
		if(a<12)
		{
			int k = 12;
			x = a + x;
			k = k + 1 ;
			System.out.println("**Bloc 1**");
			System.out.println("a="+a);
			System.out.println("k="+k);
			System.out.println("x="+x);
			System.out.println("**FIN Bloc 1**");
		}
		// System.out.println("k="+k);
		int k = 3;
		System.out.println("a="+a);
		System.out.println("k="+k);
		System.out.println("x="+x);
		System.out.println("**FIN Bloc Main**");
	}

}

