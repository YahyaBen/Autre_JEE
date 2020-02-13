package poly;

public class Pomme extends Fruit {

	public Pomme(int P) {
		this.Poids = P;
		System.out.println("Creation d'une pomme de " + Poids + " grammes");
	}
	
	public void afficher() {
		System.out.println("C'est une Pomme ");
	}
	public void afficherPoids() {
		System.out.println("Poids de la Pomme : "+this.Poids);
	}
}
