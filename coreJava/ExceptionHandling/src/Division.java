import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		
		System.out.println("Enter 2 Numbers : ");
		try {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c= a / b;
		System.out.println("Result is : "+c);
		}
		catch(ArithmeticException e) {
			
			System.out.println("Do not entere 0 here : "+ e.getMessage());
		}
	
		System.out.println("Modre Code here ");
	}

}
