package YB;


import java.util.*;

public class Variables {

	public static void main(String[] args) {
		// Types Declaration !
		
		String A = new String();
		A="Hello 1 - A";
		String B = "Hello 2 - B";
		String C;
		C="Hello 3 - C";
		String D = new String("Hello 4 - D");
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
		
		//------------------------
		// Conversion d'ajustement
		double nbrA = 1.2547d, nbrB = 2.1458d;
		int resultatA;
		double resultatB;
		resultatA= (int)(nbrA*nbrB);
		resultatB=(nbrA*nbrB);
		System.out.println(resultatA);
		System.out.println(resultatB);
		
		//-----------------------
		// Lire du clavier 
		
		
		Scanner scA = new Scanner(System.in);
		System.out.print("Entrer un String souhaite :  ");
		String strA = scA.nextLine();
		System.out.print("Entrer un int souhaite :  ");
		int strB = scA.nextInt();
		System.out.print("Entrer un double souhaite :  ");
		float strC = scA.nextFloat();
		System.out.println("Vous avez saisi : " + strA);
		System.out.println("Vous avez saisi : " + strB);
		System.out.println("Vous avez saisi : " + strC);
		scA.close();
		
		//------------------------
		// Conditions
		
		if (strB>0) {
			switch(strB){
			case 10:
				System.out.println("La Moyenne");
				break;
			case 18:
				System.out.println("Wowowowoowwo !");
			break;
			default:
				System.out.println("Kappa");
			}
		}
		else {
			System.out.println("absent");
		}
	}
}
