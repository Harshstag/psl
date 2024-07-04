
public class NonStaticMemeberDemo {
	
	int num;
	
	NonStaticMemeberDemo(){
		System.out.println("Inside  Constructor");
	}
	
	{
		System.out.println("Inside non static block");
	}
	
	public static void main(String[] args) {
		System.out.println("Inside main");
		new NonStaticMemeberDemo();
	}
}
