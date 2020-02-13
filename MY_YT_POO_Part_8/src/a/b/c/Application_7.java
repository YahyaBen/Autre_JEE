package a.b.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import scolarite.*;

public class Application_7 {

	public static void main(String[] args) throws Exception{
		File A = new File("eco.txt");
		FileInputStream AA = new FileInputStream(A);
		ObjectInputStream AAA= new ObjectInputStream(AA);
		Etudiant Q = (Etudiant) AAA.readObject();
		Etudiant S = (Etudiant) AAA.readObject();
		System.out.println(Q);
		System.out.println(S);

	}

}
