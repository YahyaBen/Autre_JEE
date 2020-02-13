package ma.projet.test;

import ma.projet.Professeur;
import ma.projet.Specialite;

public class Application_Test {

	public static void main(String[] args) {
				
		Specialite[] Sp = new Specialite[5];
		Professeur[] Prof = new Professeur[4];
		
		Sp[0] =new Specialite("01","Math");
		Sp[1] =new Specialite("02","informatique");
		Sp[2] =new Specialite("03","Physique");
		Sp[3] =new Specialite("04","Anglais");
		Sp[4] =new Specialite("05","Chimie");
		
		Prof[0]=new Professeur("Benabdallah", "yahya", "01 02 03 04 05", "Hyrkul@AA.com", Sp[0]);
		Prof[1]=new Professeur("Amar", "amina", "11 22 33 04 05", "Sakura@AA.com", Sp[0]);
		Prof[2]=new Professeur("Amrwi", "ilyas", "01 42 43 54 55", "Ai@AA.com", Sp[3]);
		Prof[3]=new Professeur("Khir", "Isane", "11 22 33 44 55", "IK@AA.com", Sp[3]);

		System.out.println("Professeur par Specialite : ");	
		for(Specialite S : Sp) {
			System.out.println(" \n"+S);
			for(Professeur P:Prof) {
				if(P.getSp().getLibelle().equals(S.getLibelle())) {
					System.out.println(" "+P);
				}
				else System.out.println("----------- Pas de prof -------------");
			}
			
		}
	}
}
