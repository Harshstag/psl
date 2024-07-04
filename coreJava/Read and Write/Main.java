
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args){
		
		try(BufferedReader br = new BufferedReader(new FileReader("input.txt"))){
			
			EventBO BO =  new EventBO();
			List<Event> listEvent = BO.readFromFile(br);
			
			try(FileWriter fr = new FileWriter("output.txt")){
				
				BO.writeFile(listEvent, fr);
				
			}
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
