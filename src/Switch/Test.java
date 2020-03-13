package Switch;

public class Test {

	public static void main(String[] args) {
		
		int day =8;
		switch (day) {
		
		case 1:
	System.out.println("Sunday");
	break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
		case 7:
			System.out.println("Saterday");
			break;
			
			default :
				System.out.println("Nothing matched  ");
		}
	}
}
