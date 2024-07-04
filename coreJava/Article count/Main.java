import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of lines");
		int n = sc.nextInt();
		sc.nextLine();
		Article[] articles = new Article[n];
		
		for(int i =  0; i < n; i++) {
			System.out.println("Enter line "+ (i+1));
			String line = sc.nextLine();
			articles[i] = new Article(line);
			articles[i].start();
			
		}
		
		int totalArticleCount = 0;
		
		for(int i = 0; i < n; i++) {
			try {
				articles[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			totalArticleCount += articles[i].getCount();
			
			
		}
		System.out.println("There are " + totalArticleCount + " articles in the given input");
		
		sc.close();

	}
};