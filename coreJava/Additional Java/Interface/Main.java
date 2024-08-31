import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose Stall Type");				
		System.out.println("1)Gold Stall");
		System.out.println("2)Premium Stall");
		System.out.println("3)Executive Stall");

		int option = sc.nextInt();
		

		switch (option) {
			case 1:
				sc.nextLine();

				System.out.println(
						"Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets)");
				String[] GoldStallDetails = sc.nextLine().split(",");

				String stallName = GoldStallDetails[0];
				int cost = Integer.parseInt(GoldStallDetails[1]);
				String ownerName = GoldStallDetails[2];
				int tvSet = Integer.parseInt(GoldStallDetails[3]);

				GoldStall goldStall = new GoldStall(stallName, cost, ownerName, tvSet);
				goldStall.display();
				
				break;

			case 2:
				sc.nextLine();

				System.out.println(
						"Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors)");
				String[] PremiumStallDetails = sc.nextLine().split(",");

				String stallName2 = PremiumStallDetails[0];
				int cost2 = Integer.parseInt(PremiumStallDetails[1]);
				String ownerName2 = PremiumStallDetails[2];
				int projectors = Integer.parseInt(PremiumStallDetails[3]);

				PremiumStall premiumStall = new PremiumStall(stallName2, cost2, ownerName2, projectors);
				premiumStall.display();

				break;

			case 3:
				sc.nextLine();

				System.out.println(
						"Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Screens)");
				String[] ExecutiveStallDetails = sc.nextLine().split(",");

				String stallName3 = ExecutiveStallDetails[0];
				int cost3 = Integer.parseInt(ExecutiveStallDetails[1]);
				String ownerName3 = ExecutiveStallDetails[2];
				int screen = Integer.parseInt(ExecutiveStallDetails[3]);

				ExecutiveStall executiveStall = new ExecutiveStall(stallName3, cost3, ownerName3, screen);
				executiveStall.display();

				break;
			case 4:
				System.out.println("Invalid Stall Type");
				break;

			default:
				System.out.println("Invalid Stall Type");
				break;
		}
			
	sc.close();


	}
}
