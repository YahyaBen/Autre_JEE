package a.b.c;

import java.util.Date;

public class Application_1 {

	public static void main(String[] args) {
		Couple<Integer> A = new Couple<Integer>(8, 5);
		Couple<Date> B = new Couple<Date>(new Date(),new Date() );
		Couple<String> C = new Couple<String>("A","B" );
		System.out.println(A.getA());
		System.out.println(A.getB());
		System.out.println(B.getB());
		System.out.println(B.getA());
		System.out.println(C.getB());
		System.out.println(C.getA());	
	}

}
