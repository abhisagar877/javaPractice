
package Loops;

public class nestedloops {
public static void main(String[] args) {
	/*
	 * 
	 * 
	 * 
	 * Multiply of all lopp
	 * till the time inner loop excution not finish there should be no chnage in outer loop
	 * outer loop only change when inner loop done intire itration
	 * 
	 * 
	 * 
	 * 
	 * the placing
	 */
	
	int i=0;
	int count=0;
	
	while (i<3) {
		for (int j=0; j<4; j++)
		{
			int k=0;
			do {
				System.out.println("i--->"+i+"j  --->"+j+"k   --->"+k);
				k++;
				count++;
					
			}while(k<5);
			
			}
		i++;
		
		}
	System.out.println("Total count is  : "+count);
	}
	
	
	
}

