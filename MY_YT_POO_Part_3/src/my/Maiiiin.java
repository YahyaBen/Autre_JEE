package my;

public class Maiiiin {

	public static void main(String[] args) {
		Compte A;
		Compte B=new Compte();
		Compte C = new Compte(5000);
		A=new Compte(4000);
		B.setSolde(500);
		//Compte Q=new Compte();
		//Compte D=new Compte();
		//Compte E=new Compte();
		
		
		System.out.println(A);
		System.out.println("-------------------");
		System.out.println(B);
		System.out.println("-------------------");
		System.out.println(C);

	}

}
