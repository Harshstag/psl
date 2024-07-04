import java.io.*;
import java.util.*;

public class UserBO {

	public static void writeFile(ArrayList<User> userList, BufferedWriter bw) throws Exception {
		for(User user: userList) {
			bw.write(user.getName()+","+user.getMobileNumber()+","+user.getUsername()+","+ user.getPassword());
			bw.newLine();
		}
	}
}
