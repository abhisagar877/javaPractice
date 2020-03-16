package Arrray;

public class threedayArray {
	public static void main(String[] args) {
		int [][][] array =new int [2][3][4];
		
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array.length; j++) {
				for (int k=0; k<array.length; k++) {
					array [i][j][k]=(int)(Math.random()*1000);
					System.out.print(array [i][j][k]+ " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
