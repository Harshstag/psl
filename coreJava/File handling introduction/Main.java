import java.io.*;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("input.csv"));
			UserBO userBO = new UserBO();
			List<User> userList = userBO.readFromFile(br);
			userBO.display(userList);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
