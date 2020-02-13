package YB;

import java.util.*;

public class Boucles {

	public static void main(String[] args) {
		char Reponse;
		String Nom;
		String Prenom;
		System.out.print("Entrer Au formulaire O/N : ");
		Scanner Sc = new Scanner(System.in);
		Reponse = Sc.nextLine().charAt(0);
		while ( Reponse == 'O') {
			System.out.print("Entrer votre Nom : ");
			Nom = Sc.nextLine();
			System.out.print("Entrer votre Prenom : ");
			Prenom = Sc.nextLine();
			System.out.println("Bonjour Mr " + Nom + " " + Prenom);
			Reponse=' ';
			while( Reponse != 'O' &&  Reponse != 'N') {
			System.out.print("Ressayer O/N ?????");
			Reponse = Sc.nextLine().charAt(0);
			}
		}
		System.out.print("Bye Bye");
		Sc.close();
	}

}
