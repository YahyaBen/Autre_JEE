package metier;

public class Maiiiiin {

	public static void main(String[] args) {
		Compte A=new Compte();
		A.setCode(10);
		A.setSolde(7900);
		System.out.println(A.toString());
		A.Verser(500);
		A.Retirer(1000);
		System.out.println(A);
	}
}
