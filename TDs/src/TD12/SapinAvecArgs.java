package TD12;

public class SapinAvecArgs {

	public static void main(String[] args) {
		int N = 0, iEspaces = 0, ligne = 1;
		String patternEspaces="";
		String patternEtoiles="";

		// le try est nécessaire pour gérer les erreurs éventuelles du parseInt
		try {
			if (args.length!=1) {
				System.out.println("Vous devez donner la taille du sapin en argument");
			} else {
				System.out.println("Vous avez demandé un sapin de "+args[0]+" lignes de haut!");
				N = Integer.parseInt(args[0]);
				
				String spaces = "";
				String stars = "*";
				for(int i=1; i<=N-1; i++) {
					spaces = spaces + " ";
				}
				for (int i=1; i<=N; i++) {
					System.out.println(spaces+stars);
					if(spaces.length()!=0) {
						spaces = spaces.substring(1);
					}
					stars = stars + "**";
				}
			}
		} catch (Exception e) {
			System.out.print(e);
		}
	}
}
