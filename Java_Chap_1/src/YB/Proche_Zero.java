package YB;

public class Proche_Zero {
	public static void main(String[] args) {

		int Tab[] = { -5, -4,8,-2,7, 3, 4 };
		int Min = Tab[0];
		for (int i = 0; i < Tab.length; i++) {
			if ( Math.abs(Min)>= Math.abs(Tab[i] )) {
				Min = Tab[i];
			}
		}
		System.out.println("La Valeur la plus proche du Zero est :" + Min);

	}
}
