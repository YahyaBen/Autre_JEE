package poly;

public class Orange extends Fruit {

	public Orange(int P) {
		this.Poids = P;
		System.out.println("Creation d'une Orange de " + Poids + " grammes");
	}
	
	public void afficher() {
		System.out.println("C'est une Orange ");
	}
	public void afficherPoids() {
		System.out.println("Poids de la Orange : "+this.Poids);
	}
}