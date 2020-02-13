package YB;

public class Capitale extends Ville{
	private String monument;
	public Capitale() {
		super();
		monument="aucun";
	}
	public Capitale(String A,String B,int C,String D) {
		super(A,B,C);
		monument=D;
	}
	public String getMonument() {
		return monument;
	}
	public void setMonument(String monument) {
		this.monument = monument;
	}
	public String toString() {
		String AA = super.toString()+" ===>"+this.monument;
		return AA;
	}
	/*public String decrisToi() {
		String AA = super.decrisToi()+" ===>"+this.monument;
		return AA;
	}*/
}
