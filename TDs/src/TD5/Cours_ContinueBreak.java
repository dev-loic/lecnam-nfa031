package cours05;

public class Cours_ContinueBreak {

	public static void main(String[] args) {
		int i = 0 ;
		
		while (i<10)
		{
			i++;
			if (i==1) continue;
			
			// On fait qqs trucs qui modifient i
			
			if (i%2==i) break;
			
			// On fait d'autres choses
		}
	}

}


