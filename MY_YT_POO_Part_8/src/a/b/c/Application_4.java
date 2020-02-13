package a.b.c;

import java.io.*;

public class Application_4 {

	public static void main(String[] args) throws IOException {
		File A =new File("note.txt");
		FileReader AA = new FileReader(A);
		BufferedReader Br = new BufferedReader(AA);
		System.out.println(" " +A);
		String c;
		float Somme=0;
		int nbr =0; 
		while((c=Br.readLine())!=null) {
			String[] Sp =c.split(";");
			System.out.println(Sp[2]);
			nbr++;
			Somme= Somme + Float.parseFloat(Sp[2]);
		}
		System.out.println("La Moyenne de Classe est "+Somme/nbr);
		AA.close();
		Br.close();
	}

}
