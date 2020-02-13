package poly;

import java.util.ArrayList;

public class Maiin {

	public static void main(String[] args) {
		/*------------------------------Partie 3 ArrayList*/
		ArrayList<Fruit> LesFruits = new ArrayList<Fruit>();
		LesFruits.add(new Pomme(80));
		LesFruits.add(new Pomme(10));
		LesFruits.add(new Orange(1000));
		for(int i=0;i<LesFruits.size();i++) {
			LesFruits.get(i).afficher();;
		}
		/*------------------------------Partie 2 Methode abstract Oblige la redifinition
		Fruit[] LesFruits = new Fruit[5];
			LesFruits[0] = new Pomme(10);
			LesFruits[1] = new Pomme(20);
			LesFruits[2] = new Pomme(30);
			LesFruits[3] = new Pomme(40);
			LesFruits[4] = new Orange(5);
		for(int i=0;i<LesFruits.length;i++) {
			if(LesFruits[i] instanceof Pomme) { //Objet of
				System.out.println("Pomme");
			}else System.out.println("Orange");
		}*/
		
		/*------------------------------Partie 1 Polymorphisme
		 * Pomme A = new Pomme(40);
		 * 
		 * Orange B = new Orange(60);
		 * 
		 * Fruit C = new Pomme(80);//Sous casting - Late Binding Fruit D; D=new
		 * Pomme(900); D=new Orange(55); A.afficherPoids(); B.afficherPoids();
		 * 
		 * //((Pomme)C).afficherPoids(); //((Orange)C).afficherPoids();
		 */

	}
}
