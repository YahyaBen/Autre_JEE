package YB;

public class Classe_main {

	public static void main(String[] args) {

				Ville A = new Ville();
				A.setNbrHabitant(10000);
				A.setNomPays("France");
				A.setNomVille("Lille");
				//Ville B= new Ville("Paris","France",15000);
				//Ville C= new Ville("Douai","France",20000);
				//Ville D= new Ville("Arras","France",5000);
				//Ville E = new Ville();
				//B.decrisToi();//Marche plus car j'ai transformer methode to fonction
				//B.decrisToi();
				//C.decrisToi();
				//D.decrisToi();
				//E.decrisToi();
				//System.out.println(C.comparer(A));
				
				// Heritage 
				
				Capitale K= new Capitale();
				//K.decrisToi();
				K.setMonument("Kalb");
				System.out.println(""+K.getNomVille());
				//System.out.println(K.decrisToi());//decris toi Capitale
				//System.out.println(K.decrisToi());//decris toi Ville
			}
}


