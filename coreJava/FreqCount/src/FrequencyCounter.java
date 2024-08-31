
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class FrequencyCounter extends Thread {

	private String strInput;
	private int[] freq;
	private Map<Character, Integer> freqMap;

	public FrequencyCounter(String strInput) {
		this.strInput = strInput;
	}

	@Override
	public void run() {
		for (char c : strInput.toCharArray()) {
			freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
		}
	}

	public void printCharFreq() {
		List<Character> keys = new ArrayList<>(freqMap.keySet());
		Collections.sort(keys);

		for (char c : keys) {
			System.out.println(c + "->" + freqMap.get(c) + " | ");
		}
	}

}
