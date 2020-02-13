package a.b.c;

import java.io.*;
import java.util.zip.*;

public class Application_5 {

	public static void main(String[] args) throws IOException {

		File A = new File("Tp_2_Interface_Graphique.docx");
		FileInputStream AA = new FileInputStream(A); // File Byte c pk InputStream
		BufferedInputStream AAA = new BufferedInputStream(AA); // Array cree pour lire le contenu du AA

		File B = new File("Tp_22.zip");
		FileOutputStream BB = new FileOutputStream(B);
		BufferedOutputStream BBB = new BufferedOutputStream(BB);
		ZipOutputStream  BBBB= new ZipOutputStream(BBB);
		
		
		BBBB.setMethod(ZipOutputStream.DEFLATED); // Methode de compression
		BBBB.putNextEntry(new ZipEntry(A.getName())); //
		
		
		int c ;
		while ((c=AAA.read()) !=-1) {
			BBBB.write(c);
		}
		
		AAA.close();
		BBBB.close();
		
		

	}

}
