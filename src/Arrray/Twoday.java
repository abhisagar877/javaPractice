package Arrray;

public class Twoday {

	public static void main(String[] args) {
		
		int [][] myArray =new int [2][3];
		myArray [0][0]=1;
		myArray [0][1]=5;
		myArray [0][2]=6;
		
		
		myArray [1][0]=6;
		myArray [1][1]=3;
		myArray [1][2]=7;
		System.out.println(myArray[0].length);
		
		for (int i=0; i<myArray.length; i++) {
			
			for (int j=0; j<myArray[i].length; j++) {
			
			System.out.println(myArray[i][j]+ " ");
		}
		System.out.println();
	}
	}
}