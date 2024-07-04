
public class Article extends Thread {

	private String line;
	private int count;

	public Article() {

	}

	public Article(String line) {
	
		this.line = line;
	
	}
	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public void run() {
		
	count = 0;
	String[] words = line.split("\\s+");
	
		for(String word : words) {
			if(word.equalsIgnoreCase("a") || word.equalsIgnoreCase("an") || word.equalsIgnoreCase("the") ) {
				count++;
			}
		}
	}
	
}
