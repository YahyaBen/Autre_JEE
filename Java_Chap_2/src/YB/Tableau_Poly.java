package YB;

public class Tableau_Poly {

	public static void main(String[] args) {
		
		Ville[] tableau = new Ville[6];
		        
		
		String[] tab = {"Marseille", "lille", "caen", "lyon", "paris", "nantes"};
		int[] tab2 = {12345, 17845, 6549, 7583, 1594, 213};
		         
		
		for(int i = 0; i < 6; i++){
		  if (i <3){
		    Ville V = new Ville(tab[i], "france", tab2[i]);
		    tableau[i] = V;
		  }
		         
		  else{
		    Capitale C = new Capitale(tab[i], "france", tab2[i], "la tour Eiffel");
		    tableau[i] = C;
		  }
		}
		for(Ville V : tableau){
		  System.out.println(V.toString()+"\n");
		}

	}

}
