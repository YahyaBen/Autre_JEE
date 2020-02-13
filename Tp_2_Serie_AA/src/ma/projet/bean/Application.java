package ma.projet.bean;

public class Application {

	public static void main(String[] args) {
		Devloppeur [] Dev =new Devloppeur[2];
		Manager [] Man =new Manager[2];
		
		Dev [0]= new Devloppeur(1,"BENABDALLAH","Yahya","Hyrkul@AA.fr","01 02 03 04 05 06",20000.0,"Java");
		Dev [1]= new Devloppeur(2,"AMAR","Amina","Sakura@AA.fr","01 02 03 04 05 06",25000.0,"Php");
		
		Man[0]=new Manager(1, "Lich", "Support", "lol@lul.Fr", "04 08 07 01 03", 30000.0, "RH");
		Man[1]=new Manager(3, "Mk", "incursio", "lol@lul.Fr", "04 08 07 01 03", 31000.0, "Feed");
		
		// La methode abstract a permet de resoudre probleme polymorphisme
		
		System.out.println("Le salaire du "+Dev[0].getClass().getSimpleName()+
				"  "+Dev[0].getNom()+" "+Dev[0].getPrenom()+"  "+Dev[0].calculerSalaire()+" Dh/mois Specialite "+Dev[0].getSpecialite());
		System.out.println("Le salaire du "+Dev[1].getClass().getSimpleName()+
				"  "+Dev[1].getNom()+" "+Dev[1].getPrenom()+"  "+Dev[1].calculerSalaire()+" Dh/mois Specialite "+Dev[1].getSpecialite());
		
		System.out.println("Le salaire du "+Man[0].getClass().getSimpleName()+
				"  "+Man[0].getNom()+" "+Man[0].getPrenom()+"  "+Man[0].calculerSalaire()+" Dh/mois Service "+Man[0].getService());
		System.out.println("Le salaire du "+Man[1].getClass().getSimpleName()+
				"  "+Man[1].getNom()+" "+Man[1].getPrenom()+"  "+Man[1].calculerSalaire()+" Dh/mois Service "+Man[1].getService());
	}

}
