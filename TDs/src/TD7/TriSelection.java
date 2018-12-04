package TD7;

public class TriSelection {

	public static void main(String[] args) {

		int [] tabInt = {3,5,0,10,1,7,9,5} ; 
		int sizeTab = tabInt.length, curMinIndex = 0;

		// Afficher le tableau
		for (int i=0;i<sizeTab;i++)
		{
			System.out.print(tabInt[i] + " | ");
		}
		System.out.println();
		
		for (int i=0;i<sizeTab;i++)
		{
			curMinIndex = i ;
			for(int j=i;j<sizeTab;j++)
			{
				if(tabInt[curMinIndex]>tabInt[j])
				{
					curMinIndex = j;
				}
			}
			// on echange 
			int temp = tabInt[i];
			tabInt[i] = tabInt[curMinIndex];
			tabInt[curMinIndex] = temp;
		}

		// Afficher le tableau
		for (int i=0;i<sizeTab;i++)
		{
			System.out.print(tabInt[i] + " | ");
		}
		System.out.println();
		
	}

}
