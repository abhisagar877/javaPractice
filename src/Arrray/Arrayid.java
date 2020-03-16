package Arrray;

public class Arrayid {
	
	public static void main(String[] args) {
		
		int [] array =new int [10];
		String[] myArray=new String [13];
		System.out.println(myArray.length);
		
		for (int index=0; index<array.length; index++) {
			array[index]=(int) (Math.random()*1000);
			
			for (int var:array) {
				System.out.println(var);
			}
		}
	}

}
