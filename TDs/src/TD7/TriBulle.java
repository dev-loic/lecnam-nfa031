package TD7;

public class TriBulle {

	public static void main(String[] args) {
		int [] tabInt = {3,5,0,10,1,7,9,5} ; 
		int sizeTab = tabInt.length;
		
		// Afficher le tableau
		for (int i=0;i<sizeTab;i++)
		{
			System.out.print(tabInt[i] + " | ");
		}
		System.out.println();
		
		for(int i=sizeTab-1;i>1;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(tabInt[j]>tabInt[j+1])
				{
					int temp = tabInt[j];
					tabInt[j] = tabInt[j+1];
					tabInt[j+1] = temp;
				}
			}
		}
		
		// Afficher le tableau
		for (int i=0;i<sizeTab;i++)
		{
			System.out.print(tabInt[i] + " | ");
		}
		System.out.println();

	}

}
