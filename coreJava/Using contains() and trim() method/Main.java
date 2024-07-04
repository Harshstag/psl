import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the text from the document");
		String str = br.readLine();
		
		System.out.println("Enter the string to be found in the data");
		String word = br.readLine();
		word  = word.trim();
		
		if(str.contains(word)) {
			System.out.println("String is found in the document");
			
		}else {
			System.out.println("String is not found in the documen");
		}
		
		} catch (Exception e) {
			System.out.println(e);
		}
		

	}
}