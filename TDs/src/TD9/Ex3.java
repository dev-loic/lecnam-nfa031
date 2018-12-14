package TD9;

public class Ex3 {

	public static void main(String[] args) {
		int[] t1 = {4, 5, 6};
		int[] t2 = {4, 5, 6};
		int[] t3 = {4, 5};
		int[] t4 = {6, 5, 4};

		System.out.println("estEgal(t1,t2) --> attendu : true | résultat : "+ estEgal(t1,t2));
		System.out.println("t1 == t2 --> attendu : false | résultat : "+ (t1==t2));
		System.out.println("estEgal(t1,t3) --> attendu : false | résultat : "+ estEgal(t1,t3));
		System.out.println("t1 == t3 --> attendu : false | résultat : "+ (t1==t3));
		System.out.println("estEgal(t1,t4) --> attendu : false | résultat : "+ estEgal(t1,t4));
		System.out.println("t1 == t4 --> attendu : false | résultat : "+ (t1==t4));
	}
	
	static boolean estEgal(int [] iTab1,int [] iTab2)
	{
		int sizeTab1 = iTab1.length, sizeTab2 = iTab2.length, i=0;
		
		// on élimine déjà l'égalité si leur taille est différente
		if (sizeTab1!=sizeTab2) return false;
		
		for (i=0;i<sizeTab1;i++) // on peut aussi prendre sizeTab2
		{
			if (iTab1[i]!=iTab2[i]) return false;
		}
		// Si on est sorti sans encombre de la boucle précédente, 
		// Les 2 tableaux sont forcément égaux. 
		return true; 
	}

}
