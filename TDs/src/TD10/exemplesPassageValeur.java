package TD10;

public class exemplesPassageValeur {
	
	public static void main(String[] args) 
	{		
		int [] tabInt = {1,2,3,4,5};
		inversionTableau(tabInt);
	}
	
	static void inversionTableau (int [] iTab)
	{
		int i=0, size=iTab.length, j=size-1, temp=0;
		for (i=0;i<size/2;i++)
		{
			temp=iTab[i];
			iTab[i]=iTab[j];
			iTab[j]=temp;
			j--;
		}
	}
	
	
	static int multiplieParDeux(int a)
	{
		int b = a*2;
		return b;
	}
}

