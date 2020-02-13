package YB;

public class Abstract_Test {
	public static void main(String[] args) {
		Abstrat_Animal l = new Loup("Gris bleuté", 20);
		Abstrat_Animal c = new Chien("Kalb",15);
		l.boire();
		l.manger();
		l.deplacement();
		l.crier();
		System.out.println(l.toString());
		System.out.println(" ");
		c.boire();
		c.manger();
		c.deplacement();
		c.crier();
		System.out.println(c.toString());
	}
}