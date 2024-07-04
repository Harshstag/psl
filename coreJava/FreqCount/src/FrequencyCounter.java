
import java.util.*;

public class FrequencyCounter extends Thread {

	 private String strInput;
	    private int[] freq;
	    private char[] charArray;

	    public FrequencyCounter(String strInput) {
	        this.strInput = strInput;
	    }

	    @Override
	    public void run() {
	        int length = strInput.length();
	        freq = new int[length];
	        charArray = strInput.toCharArray();

	        for (int i = 0; i < length; i++) {
	            freq[i] = 1;
	            for (int j = i + 1; j < length; j++) {
	                if (charArray[i] == charArray[j]) {
	                    freq[i]++;
	                    charArray[j] = '0';  // Mark as counted
	                }
	            }
	        }
	    }

	    public void printCharFreq() {
	        for (int i = 0; i < charArray.length; i++) {
	        	Arrays.sort(charArray);
	            if (charArray[i] != '0') {
	                System.out.print(charArray[i] + ":" + freq[i] + " ");
	            }
	        }
	        System.out.println();
	    }
}
