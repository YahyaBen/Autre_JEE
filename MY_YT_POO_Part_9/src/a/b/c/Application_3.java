package a.b.c;

public class Application_3 {

	public static void main(String[] args) {
			Calcule<String> A=new Calcule<String>();
			Calcule<String> B=new Calcule<String>();
			Calcule<String> C=new Calcule<String>();
			System.out.println(A.Comparer("Abb","AbB"));
			System.out.println(B.Comparer('a','a'));
			System.out.println(C.Comparer(4,4));
			
			char x='a';
			char y='a';
			
			System.out.println(A.Comparer(x, y));
			
			Produit AA=new Produit(10,"OMO",100.0);
			Produit AB=new Produit(10,"OMO",100.0);
			
			System.out.println(A.Comparer(AA,AB));// redefinir equal pour chaque attribut

	}

}
