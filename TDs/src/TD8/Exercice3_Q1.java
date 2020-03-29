package TD8;

import java.util.Scanner;

public class Exercice3_Q1 {

	// On se fixe une image de 2 pixels x 2 pixels (pour les tests)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Xsize=2, Ysize=2, iX=0, iY=0, valuePixel=0, countWhite=0;
		double nbPixels=Xsize*Ysize;
		int [][] image = new int [Xsize][Ysize];
		boolean correctValue = false;
		
		// Saisie utilisateur de l'image
		System.out.println(" ** Saisie de l'image (valeur des pixels entre 0 et 255) **");
		for(iX=0;iX<Xsize;iX++) {
			for	(iY=0;iY<Ysize;iY++) {
				do {
					System.out.print("Saisissez la valeur du pixel ("+iX+","+iY+") : ");
					valuePixel=sc.nextInt();
					if(valuePixel<0 || valuePixel>255) {
						System.out.println("La valeur du pixel doit être comprise en 0 et 255, recommencez.");
						continue;
					}
					image[iX][iY]=valuePixel;
					correctValue=true;
					
				} while(!correctValue);
				correctValue=false; // Pour le test sur le prochain pixel.				
			}
		}
		
		// Affichage de l'image et calcule du nb de points blancs en même temps
		for(iX=0;iX<Xsize;iX++) {
			for	(iY=0;iY<Ysize;iY++) {
				System.out.print(image[iX][iY] + " ");
				if(image[iX][iY]==255) {
					countWhite++;
				}
			}
			System.out.println();
		}
		// Pourcentage de points blancs
		System.out.println("Il y a " + (countWhite/nbPixels)*100 + "% de points blancs.");
		
		// On éclaicit l'image de 30
		System.out.println("Voici le résultat de l'éclaircissement de l'image : ");
		for(iX=0;iX<Xsize;iX++) {
			for	(iY=0;iY<Ysize;iY++) {
				image[iX][iY]+=30;
				if(image[iX][iY]>255) {
					image[iX][iY]=255;
				}
				System.out.print(image[iX][iY] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
