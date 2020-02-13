package a.b.c;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		 Scanner Scr = new Scanner(System.in);
		 System.out.print("A : ");
		 int a = Scr.nextInt();
		 System.out.print("B : ");
		 int b = Scr.nextInt();
		 int c=0;
		 try {
		 c=a/b;
		 }
		 catch(ArithmeticException e) {
			 System.out.println(""+e.getMessage());
			 System.out.println(""+e.toString());
			 e.printStackTrace();
		 }
		 System.out.print("C : "+c);
		 Scr.close();
		 

	}

}
