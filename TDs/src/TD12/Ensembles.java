package TD12;

import java.util.ArrayList;

public class Ensembles {

	public static void main(String[] args) {
		// on crée 2 sets {1,2,3} et {3,4,5}
		ArrayList<Integer> set1 = createSingleton(1);
		addElem(2,set1);
		addElem(3,set1);
		System.out.println("SET1 = {1,2,3}");
		displaySet(set1);
		
		ArrayList<Integer> set2 = createSingleton(3);
		addElem(4,set2);
		addElem(5,set2);
		System.out.println("SET2 = {3,4,5}");
		displaySet(set2);
		
		// UNION
		ArrayList<Integer> unionSet = unionSet(set1,set2);
		System.out.println("UNION SET = {1,2,3,4,5}");
		displaySet(unionSet);
		
		// INTERSECTION
		ArrayList<Integer> intersectionSet = intersectionSet(set1,set2);
		System.out.println("INTERSECTION SET = {3}");
		displaySet(intersectionSet);
		
		// IS 3 in Union Set ? 
		System.out.println("IS 3 IN UNION SET ? (YES)");
		System.out.println(isInSet(3,unionSet));
		// IS 10 in Union Set ? 
		System.out.println("IS 10 IN UNION SET ? (NO)");
		System.out.println(isInSet(10,unionSet));
		
		// Nb elems union
		System.out.println("Nb Elems in Union Set (5) : ");
		System.out.println(nbSetElems(unionSet));
		// Nb elems intersection
		System.out.println("Nb Elems in Union Set (1) : ");
		System.out.println(nbSetElems(intersectionSet));
	}
	
	static ArrayList<Integer> createSingleton(int iElem) {
		ArrayList<Integer> newSet = new ArrayList<Integer>();		
		newSet.add(iElem);	
		return newSet;
	}
	
	static void addElem(int iElem, ArrayList<Integer> ioSet) {
		if(!ioSet.contains(iElem)) { // on s assure que chaque element est present quune seule fois
			ioSet.add(iElem);
		}
	}
	
	static void displaySet(ArrayList<Integer> iSet) {
		int sizeSet = iSet.size(), i=0;
		for(i=0;i<sizeSet;i++) {
			System.out.print(iSet.get(i)+" | ");
		}
		System.out.println();
	}
	
	static ArrayList<Integer> unionSet(ArrayList<Integer> iSet1,ArrayList<Integer> iSet2) {
		ArrayList<Integer> unionSet = new ArrayList<Integer>();
		int sizeSet1 = iSet1.size(), sizeSet2 = iSet2.size(), i=0;
		for(i=0;i<sizeSet1;i++) {
			addElem(iSet1.get(i),unionSet);
		}
		for(i=0;i<sizeSet2;i++) {
			addElem(iSet2.get(i),unionSet);
		}
		return unionSet;
	}
	
	static ArrayList<Integer> intersectionSet(ArrayList<Integer> iSet1,ArrayList<Integer> iSet2) {
		ArrayList<Integer> intersectionSet = new ArrayList<Integer>();
		int sizeSet1 = iSet1.size(), i=0;
		for(i=0;i<sizeSet1;i++) {
			if(iSet2.contains(iSet1.get(i))) { // on ajoute que sil est present dans les deux
				intersectionSet.add(iSet1.get(i));
			}
		}
		return intersectionSet;
	}
	
	static boolean isInSet(int iElem, ArrayList<Integer> iSet) {
		return iSet.contains(iElem);
	}
	
	static int nbSetElems(ArrayList<Integer> iSet) {
		return iSet.size();
	}
}
