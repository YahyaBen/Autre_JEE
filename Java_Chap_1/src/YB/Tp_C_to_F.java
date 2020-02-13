package YB;

import java.util.*;

public class Tp_C_to_F {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		char A;
		char B;
		float Temp;
		float Resultat;
		System.out.println("Convertisseur CELSIUS et FEHRENHEIT");
		System.out.println("-----------------------------------");
		do {
			System.out.println("1 - Convertir °C to °F : ");
			System.out.println("2 - Convertir °F to °C : ");
			B = Sc.nextLine().charAt(0);
			if (B == '1') {
				System.out.println("Temperature a convertir = ");
				Temp = Sc.nextFloat();
				Resultat = (float) (1.8 * Temp) + 32;
				System.out.println(Temp + " °C Correspond a " + Resultat + " °F");
			} else if (B == '2') {
				System.out.println("Temperature a convertir = ");
				Temp = Sc.nextFloat();
				Resultat = (float) (Temp - 32) * 5 / 9;
				System.out.println(Temp + " °F Correspond a " + Resultat + " °C");
			}
			else {
				System.out.println("Svp Choisir soit Mode 1 ou 2 :S");
			}
			Sc.nextLine();
			System.out.println("Voulez vous continuez ? O/N");
			A = Sc.nextLine().charAt(0);
		} while (A == 'O');
		System.out.println("Au revoir !");
		Sc.close();
	}

}
