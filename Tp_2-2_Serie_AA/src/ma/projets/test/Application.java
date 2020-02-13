package ma.projets.test;

import ma.projets.classes.*;

public class Application {

	public static void main(String[] args) {
		
		Etudiant [] E = new Etudiant[2];
		Employer [] Emp = new Employer[2];
		Professeur [] Prof = new Professeur[2];
		
		E[0]=new Etudiant("BENABDALLAH", "Yahya", "F58874");
		E[1]=new Etudiant("AMAR", "Amina", "F57414");
		
		Emp[0]=new Employer("Amraoui", "Ilyass", 10000.0);
		Emp[1]=new Employer("Khir", "Ihsane", 8000.0);
		
		Prof[0]=new Professeur("Garziad", "Sara", 12000, "UML");
		Prof[1]=new Professeur("Mani", "Med", 15000, "Java");
		
		System.out.println("La liste des employer :");
		for (int i=0;i<Emp.length;i++) {
			System.out.println(Emp[i].toString());
		}
		System.out.println("La liste des etudiants :");
		for (int i=0;i<E.length;i++) {
			System.out.println(E[i].toString());
		}
		System.out.println("La liste des professeurs :");
		for (int i=0;i<Prof.length;i++) {
			System.out.println(Prof[i].toString());
		}
	}

}
