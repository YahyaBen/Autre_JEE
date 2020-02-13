package a.b.c;

import java.io.Serializable;

public class Traitement <T extends Produit& Serializable &  Cloneable>{//Que le type que herite du Produit
	
	private T a;
	private T b;
	
	public Traitement() {
	}

	public Traitement(T a, T b) {
		this.a = a;
		this.b = b;
	}

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}

	public T getB() {
		return b;
	}

	public void setB(T b) {
		this.b = b;
	}
	
	
}
