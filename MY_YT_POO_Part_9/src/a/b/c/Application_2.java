package a.b.c;

import java.util.Date;

public class Application_2 {

	public static void main(String[] args) {
		Triplet<Integer, Date> A =new Triplet<Integer, Date>(10, 20, new Date());
		System.out.println(A.getA() +" "+A.getB()+" "+A.getC());
		
	}

}