package cours03;

public class _ExemplePorteeVariable2 {

	public static void main(String[] args) {
		int i = 1; 
		char a = 'x';
		if (a == 'x')
		{
			int j = 2 ; 
			char b = 'y';
			if (j==2)
			{
				int k = 3 ; 
				char c = 'z';
				System.out.println("i="+i+" | a="+a);
				System.out.println("j="+j+" | b="+b);
				System.out.println("k="+k+" | c="+c);
			}
			System.out.println("i="+i+" | a="+a);
			System.out.println("j="+j+" | b="+b);
			//System.out.printn("k="+k+" | c="+c);
		}
		System.out.println("i="+i+" | a="+a);
		//System.out.println("j="+j+" | b="+b);
		//System.out.printn("k="+k+" | c="+c);
	}
}



