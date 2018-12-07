package TD4;

// Point sur les unsigned int introduit en Java à partir de JAVA8
// Ne vous prenez pas la tête avec cette notion si ça vous paraît obscur, vous ne serez jamais interroger 
// dessus dans mon cours :) 

public class TestUnsignedInt {

	public static void main(String[] args) {
		
		int i = Integer.MAX_VALUE; 
		i = i + 100;		
		System.out.println(" Utilisation des méthodes unsigned");
		System.out.println(" --> i(attendu) = 2147483747 \n --> i(reel)    = " + Integer.toUnsignedString(i));
		System.out.println(" Si on considère i comme un int");
		System.out.println(" --> i(attendu) = -2147483549 \n --> i(reel)    = " + i + "\n");
		
		i = i + 100; // i doit maintenant être égal à 2147483847
		System.out.println(" Utilisation des méthodes unsigned");
		System.out.println(" --> i(attendu) = 2147483847 \n --> i(reel)    = " + Integer.toUnsignedString(i));
		System.out.println(" Si on considère i comme un int");
		System.out.println(" --> i(attendu) = -2147483449 \n --> i(reel)    = " + i + "\n");

	}

}
