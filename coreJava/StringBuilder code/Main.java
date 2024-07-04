import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter the code");
    	String inputCode = sc.nextLine();
    	
    	StringBuilder formattedCode = new StringBuilder(inputCode);
    	
    	String cityCode = formattedCode.substring(0,2);
    	String cityNumber = formattedCode.substring(2);
    	
    	if(cityCode.equals("DH")) {
    		
    		formattedCode.replace(0,2,"DEL");
 
    	}else if(cityCode.equals("MB")) {
    		
    		formattedCode.replace(0,2,"MUB");
    		
    	}else if(cityCode.equals("KL")) {
    		
    		formattedCode.replace(0,2,"KOL");
    		
    	}
    	
    	while(cityNumber.length() < 5) {
    		
    		cityNumber =  "0".concat(cityNumber);
    		
    	}
    	formattedCode.replace(3,formattedCode.length(),cityNumber);
    	
    	
    	System.out.println("Formatted code");
    	System.out.println(formattedCode.toString());
    	
        
     }
}