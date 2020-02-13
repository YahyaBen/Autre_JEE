package a.b.c;

import java.io.*;

public class Application_3 {

	public static void main(String[] args) throws IOException {
		File A =new File("copie.txt");
		FileReader AA = new FileReader(A);
		File B =new File("copie2.txt");
		FileWriter BB = new FileWriter(B);
		System.out.println(" " +A);
		int c;
		while((c=AA.read())!=-1) {
			BB.write(c-1);
		}
		AA.close();
		BB.close();
	}

}
