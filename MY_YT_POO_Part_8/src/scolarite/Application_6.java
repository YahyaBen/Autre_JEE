package scolarite;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Application_6 {

	public static void main(String[] args) throws Exception {
		Etudiant E1 = new Etudiant(01, 18, "Math");
		Etudiant E2 = new Etudiant(02, 12, "Math");
		File F1 = new File("eco.txt");
		FileOutputStream A = new FileOutputStream(F1);
		ObjectOutputStream AA = new ObjectOutputStream(A);
		AA.writeObject(E1);
		AA.writeObject(E2);
		AA.close();

	}

}
