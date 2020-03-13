
public class calculater {

	public int getSum (int num1,int num2) {
		int result=num1+num2;
		return result;
		
	}
	
	
	public int GetSub (int num1,int num2) {
		int result =num1-num2;
		return result;
		
	}
	
	public int getmul(int num1,int num2) {
		int result=num1*num2;
		return result;
		
	}
	/*
	public  void main() {
		calculater cl=new calculater();
		int i=cl.getSum(12, 16);
		System.out.println("the Sum is  :"+i);
		cl.getmul(15, 20);
		cl.GetSub(15, 15);
	}
	*/
	public static void main(String[] args) {
		calculater cl=new calculater();
		int i=cl.getSum(12, 16);
		System.out.println("the Sum is  :"+i);
		int j=cl.getmul(15, 20);
		System.out.println("the mul is  :"+j);
		int k=cl.GetSub(15, 15);
		System.out.println("the sub is  :"+k);
		
	}
}

