import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of Counters :");
		int n = sc.nextInt();
		sc.nextLine();
		
		FrequencyCounter[] FC = new FrequencyCounter[n];

		for (int i = 0; i < n; i++) {

			System.out.println("Enter text for counter " + (i + 1) + " :");
			String str = sc.nextLine();
			FC[i] = new FrequencyCounter(str);
			
			FC[i].start(); 

		}

		for (int i = 0; i < n; i++) {

			System.out.println("Counter " + (i + 1) + " Result :");
			try {
				FC[i].join();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			FC[i].printCharFreq();
			
		}
		sc.close();

	}

}
