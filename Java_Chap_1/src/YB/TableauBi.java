package YB;

public class TableauBi {

	public static void main(String[] args) {
		int tableauA [][]= {{1,2,3,4},{5,6,7,8}};

		for(int A[] :tableauA) {//for(int i=0;i<2;i++)
			int i=0;
			int j=0;
			System.out.println(" ");
			for(int B :A) {//for(int j=0;j<4;j++)
				System.out.print(" "+tableauA[i][j]);
				System.out.print(+B);
				j++;
			}
			i++;
		}

	}

}
