package YB;

public class Ville {
	protected String nomVille;
	protected String nomPays;
	protected int nbrHabitant;
	protected static int Count = 0;
	protected static int pCount = 0;
	public char categorie;

	public Ville() {
		nomVille="Rien";
		nomPays="Rien";
		nbrHabitant=0;
		Count++;
		this.categories();
	}
	public Ville(String A,String B,int C) {
		nomVille=A;
		nomPays=B;
		nbrHabitant=C;
		pCount++;
		this.categories();
	}
	public String getNomVille() {
		return nomVille;
	}
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}
	public String getNomPays() {
		return nomPays;
	}
	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}
	public int getNbrHabitant() {
		return nbrHabitant;
	}
	public void setNbrHabitant(int nbrHabitant) {
		this.nbrHabitant = nbrHabitant;
	}
	public static int getCount() {
		return Count;
	}
	public static int getpCount() {
		return pCount;
	}
	
	public void categories() {
		int[] A= {0,1000,5000,10000,15000,20000};
		char[] AA= {'?','A','B','C','D','E'};
		int i=0;
		while(i<A.length && this.nbrHabitant>A[i]) {
			i++;
		}
		this.categorie=AA[i];
	}	
	public String toString() {
		String S = "Il habite a "+getNomVille()+" avec "+getNbrHabitant()+" Cette ville et de categorie "+this.categorie;
		return S;
	}
	/*public String decrisToi() {
		String S = "Il habite a "+getNomVille()+" avec "+getNbrHabitant()+" Cette ville et de categorie "+this.categorie;
		return S;
	}*/
	/*public void decrisToi() {
		System.out.println("Il habite a "+getNomVille()+" avec "+getNbrHabitant()+" Cette ville et de categorie "+this.categorie);
	}*/
	
	public String comparer(Ville V){
	    String A = new String();

	    if (V.getNbrHabitant() > this.nbrHabitant)
	      A = V.getNomVille()+" est une ville plus peuplée que "+this.nomVille;
	     
	    else
	      A =" "+this.nomVille+" est une ville plus peuplée que "+V.getNomVille()+" ";
	     
	    return A;
	  }

}
