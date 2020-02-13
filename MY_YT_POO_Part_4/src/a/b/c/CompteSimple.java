package a.b.c;

public class CompteSimple extends Compte{
	private float decouverte;
	public CompteSimple() {
		
	}
	public CompteSimple(int C, float S,float D) {
		super(C,S);
		this.decouverte=D;
	}
	@Override
	public void Retirer(Float R) {
		if (Solde+decouverte>R) Solde -=R; 	
	}
	@Override
	public void afficher() {
		System.out.println("C'est un compte Simpele");
	}
	@Override
	public void Verser(float A) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Retirer(float B) {
		// TODO Auto-generated method stub
		
	}
}
