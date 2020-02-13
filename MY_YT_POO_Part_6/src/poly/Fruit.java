package poly;

public abstract class Fruit {

	protected int Poids;

	public Fruit() {
		System.out.println("Creation d'un fruit");
	}

	public void afficher() {
		System.out.println("C'est un fruit ");
	}

	public Fruit(int P) {
		this.Poids = P;
	}

}
