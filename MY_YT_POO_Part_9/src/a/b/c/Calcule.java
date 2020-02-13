package a.b.c;

import java.util.Date;

public class Calcule<U> {
	
	private U x;

	public <T> boolean Comparer(T a, T b) {
		if (a instanceof Date) {
			
		}
		else if (a instanceof String) {
			
		}
		return a.equals(b);
	}

	public Calcule() {

	}

	public Calcule(U x) {
		this.x = x;
	}
	
	
}
