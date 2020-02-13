package a.b.c;

public abstract class Compte implements ICompte{

	protected int Code;
	protected float Solde;
	
	public Compte(int C,float S) {
		this.Code= C;
		this.Solde = S;
	}

	public Compte() {

	}
	
	public void Verser(Float V) {
		this.Solde +=V;
	}
	
	public void Retirer(Float R) {
		this.Solde -=R;
	}

	public int getCode() {
		return Code;
	}

	public float getSolde() {
		return Solde;
	}
	
	public String toString() {
		return " Le solde du compte N : "+this.Code+" est egale a : "+this.getSolde();
	}
	
	public abstract void afficher();
}
