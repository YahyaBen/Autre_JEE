package YB;

public class AAAA {
	private int[] Ta;
	private int t;
	static int Min;
	public AAAA(){
		t=0;
		Ta[t]=0;
	}
	public AAAA(int a,int[] A) {
		this.t=a;
		this.Ta[a]=A[a];
	}
	public int[] getTa() {
		return Ta;
	}
	public void setTa(int[] ta) {
		Ta = ta;
	}
	public int getT() {
		return t;
	}
	public void setT(int t) {
		this.t = t;
	}
	
	/*public void Zero() {
		for(int i = 0;i<this.T.length;i++)
	{
		if (Math.abs(T[i]) <= Math.abs(Min)) {
			Min = T	[i];
		}
	}
	System.out.println("La Valeur la plus proche du Zero est :"+Min);
}*/
	
	
	
}
