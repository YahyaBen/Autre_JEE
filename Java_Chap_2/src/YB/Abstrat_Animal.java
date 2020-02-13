package YB;

public abstract class Abstrat_Animal {
	protected int poids;
	protected String couleur;
	public void manger() {
		System.out.println("Je mande de la viande");
	}
	public void boire () {
		System.out.println("Je bois de l'eau");
	}
	abstract void deplacement();
	abstract void crier();
	public String toString() {
		return " Je suis un object de la classe  "+this.getClass()+" je suis de couleur "+this.couleur+" et je pese "+this.poids;
	} 

}
