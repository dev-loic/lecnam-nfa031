package DM;

public class RandomMastermind {

	public static void main(String[] args) {
		// Pour utiliser generateRandomCombination, il suffit de recupérer le tableau de couleurs généré. 
		String [] combinaisonSecrete = generateRandomCombination();
		
		for(int i=0;i<4;i++)
			System.out.println(combinaisonSecrete[i]);
	}
	
	// Generate random combination of 4 colors 
	static String [] generateRandomCombination() {
		String [] combination = new String[4];
		
		// Tableau de reference
		String [] tabRefColors = {
				"rouge",
				"jaune",
				"vert",
				"bleu",
				"orange",
				"blanc",
				"violet",
				"fuchsia"
		};
		
		for (int i=0;i<4;i++) {
			int index = 0;
			String randomColor = "";
			boolean alreadyIn = true;

			do 
			{
				index = (int)(7*Math.random());
				randomColor = tabRefColors[index];
				if(!isIn(combination,randomColor)) alreadyIn = false;
			} while (alreadyIn);
			
			combination[i] = randomColor;
		}
		
		return combination;
	}
	
	static boolean isIn(String [] iTab, String iStringToFind)
	{
		boolean output = false;
		int size = iTab.length;
		
		for(int i=0;i<size;i++)
		{
			if(iStringToFind.equals(iTab[i]))
			{
				output=true;
				break;
			}
		}
		
		return output;
	}

}
