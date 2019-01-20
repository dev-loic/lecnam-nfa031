package TD12;

public class SapinAvecArgs {

	public static void main(String[] args) {
		int N = 0, iEspaces = 0, ligne = 1;
		String patternEspaces="";
		String patternEtoiles="";

		// le try est nécessaire pour gérer les erreurs éventuelles du parseInt
		
		try {
			if (args.length!=1) System.out.println("Vous devez donner la taille du sapin en argument");
			else
			{
				System.out.println("Vous avez demandé un sapin de "+args[0]+" lignes de haut!");


				N = Integer.parseInt(args[0]);

				// On construit les éléments de la première ligne 
				for (iEspaces=1;iEspaces<=N-1;iEspaces++)
				{
					patternEspaces+=" ";
				}
				patternEtoiles="*";

				while (ligne<=N)
				{
					System.out.println(patternEspaces+patternEtoiles);

					// on met à jour les pattern
					// Attention pour la derniere ligne, le pattern d espaces est vide
					// String test = "cnam";
					// test.substring(1) => nam
					if (ligne!=N) patternEspaces=patternEspaces.substring(1);
					patternEtoiles+="**";		

					// on passe à la ligne suivante 
					ligne++;
				}		
			}
		}
		catch (Exception e)
		{
			System.out.print(e);
		}
	}

}
