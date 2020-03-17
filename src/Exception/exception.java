package Exception;

public class exception {

	public static void main(String[] args) {
		System.out.println("befor try block");
		try {
			System.out.println("begning");
			int divide =10/5;
			System.out.println(divide);
			System.out.println("Eneding");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("After Try block");
	}
}
