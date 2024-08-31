import java.util.*;

class Main {
	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);

		// System.out.println("Enter the code");
		// String inputCode = sc.nextLine();

		// StringBuilder formattedCode = new StringBuilder(inputCode);

		// String cityCode = formattedCode.substring(0,2);
		// String cityNumber = formattedCode.substring(2);

		// if(cityCode.equals("DH")) {

		// formattedCode.replace(0,2,"DEL");

		// }else if(cityCode.equals("MB")) {

		// formattedCode.replace(0,2,"MUB");

		// }else if(cityCode.equals("KL")) {

		// formattedCode.replace(0,2,"KOL");

		// }

		// while(cityNumber.length() < 5) {

		// cityNumber = "0".concat(cityNumber);

		// }
		// formattedCode.replace(3,formattedCode.length(),cityNumber);

		// System.out.println("Formatted code");
		// System.out.println(formattedCode.toString());

		Scanner sc = new Scanner(System.in);

		System.out.println("Enetyer Code:");
		String code = sc.nextLine();

		StringBuilder sb = new StringBuilder(code);

		String cityCode = sb.substring(0, 2);
		String cityNum = sb.substring(2);

		if (cityCode.equalsIgnoreCase("DH")) {
			sb.replace(0, 2, "DEL");
		} else if (cityCode.equalsIgnoreCase("MB")) {
			sb.replace(0, 2, "MUM");
		} else if (cityCode.equalsIgnoreCase("KL")) {
			sb.replace(0, 2, "KOL");
		} else {
			System.out.println("Invalid Code");
		}

		while (cityNum.length() < 5) {
			cityNum = "0".concat(cityNum);
		}

		sb.replace(3, sb.length(), cityNum);
		System.out.println("Formatted code : " + sb);

		sc.close();

	}
}