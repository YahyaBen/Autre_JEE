package a.b.c;

import java.io.File;

public class Application_1 {

	public static void main(String[] args) {
		int i=0;
		File F = new File("H:\\Matlab");
		String [] Contenue=F.list();
		/*for(String A:Contenue) {
				System.out.println(A);
		}*/
		do {
			File J = new File("H:\\Matlab\\"+Contenue[i]);
			if (J.isDirectory()) {
			System.out.println("Repertoire : "+Contenue[i]);
			}
			else System.out.println("Fichier : "+Contenue[i]+" sa taille est :"+J.length()+" Octets");
			i++;
		}while(i<Contenue.length);
	}

}
