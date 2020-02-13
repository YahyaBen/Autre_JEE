package a.b.c;

import java.util.*;

public class Application2 {

	public static void main(String[] args) {
		try {
			Scanner Clavier = new Scanner(System.in);
			System.out.print("Code : ");
			int A = Clavier.nextInt();
			System.out.print("Solde : ");
			float B = Clavier.nextFloat();
			Compte AA = new Compte(A, B);
			System.out.print(" Entrer le montant a verser : ");
			float C = Clavier.nextFloat();
			AA.Verser(C);
			System.out.print(" Entrer le montant a retirer : ");
			float D = Clavier.nextFloat();
			AA.Retirer(D);
			Clavier.close();
			System.out.println("Solde restant est de : " + AA.getSolde());
		} catch (SoldeInsuufException | NegativeExce e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException a) {
			System.out.println("Probleme de Saisie !");
		} finally {
			System.out.println("Bloc Finally");//fermer connexion BD 
		}

	}

}
