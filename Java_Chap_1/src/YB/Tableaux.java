package YB;

import java.util.*;

public class Tableaux {

	public static void main(String[] args) {
		char tableauA []= {'a','z','e','r','t','y'};
		char retry = 'O';
		char rechercheA;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Bonjour : Mr - Mlle ");
		do {
			System.out.println("Entre ne alphabet pour commencer la recherche : ");
			rechercheA=Sc.nextLine().charAt(0);
			for(int i=0 ;i<tableauA.length;i++) {
				if(rechercheA==tableauA[i]) {
					System.out.println(rechercheA+" ce trouve a l'emplacement :"+i);
					break;
				}
				else if(rechercheA!=tableauA[i] && i==tableauA.length-1) {
					System.out.println(rechercheA+" n'existe pas dans le tabeau");
				}
			}
		System.out.println("Recommencer la recherche ? O/N");
		retry=Sc.nextLine().charAt(0);
		}while(retry=='O');
		System.out.println("Bye Bye");
		Sc.close();
	}

}
