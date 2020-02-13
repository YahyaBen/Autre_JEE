package YB;

public class ClasseDebutant {

	public static void main(String[] args) {
		String A;
		A = "hello";
		String[] tabA = { "a", "b", "n", "j", "k", "u", "o", "l", "m" };
		int[] tabAA = { 1, 4, 7, 2, 5, 8, 3, 6, 9 };
		String B = new String("HIIIIIIIi");
		String C = new String();
		C = "haaaaaaaa";
		String D = "HOOOOOOABOOO";
		String AA, BB, CC, DD;
		AA = A.toUpperCase();
		BB = B.toLowerCase();
		CC = C.toUpperCase();
		DD = D.toLowerCase();
		System.out.println(A + " ====> " + AA);
		System.out.println(B + " ====> " + BB);
		System.out.println(C + " ====> " + CC);
		System.out.println(D + " ====> " + DD);
		System.out.println(A.length() + " ");
		System.out.println(D.charAt(6) + " ");
		System.out.println(D.charAt(7) + " ");
		System.out.println(D.charAt(8) + " ");

		parcourir(tabA);
		parcourir(tabAA);
		System.out.println(toString(tabA));

	}

public static void parcourir(String[] tabA) {
	for(String A : tabA) {
		System.out.print(A);
}
}
	public static void parcourir(int[] tabA) {
		for(int A : tabA) {
			System.out.print(A);
	}
}
static String toString(String[] tabB) {
	System.out.println("\n Methode Deuuuux");
	String retour="";
	for(String A : tabB) 
		retour = retour + A+"\n";
	return retour;
	
}
}

