import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
		System.out.println("Choose Stall Type");
		System.out.println("1)Gold Stall");
		System.out.println("2)Premium Stall");
		System.out.println("3)Executive Stall");
		int choice = sc.nextInt();
		sc.nextLine();
		
		if(choice == 1) {
			
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets)");
			String details = sc.nextLine();
			String[] detailsArray = details.split(",");
			
			Integer cost = Integer.parseInt(detailsArray[1]);
			Integer tvSet = Integer.parseInt(detailsArray[3]);
			
			
			GoldStall gs = new GoldStall(detailsArray[0], cost ,detailsArray[2], tvSet );
			gs.display();
			
		}else if(choice == 2) {
			
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors)");
			String details = sc.nextLine();
			String[] detailsArray = details.split(",");
			
			Integer cost = Integer.parseInt(detailsArray[1]);
			Integer projector = Integer.parseInt(detailsArray[3]);
			
			PremiumStall ps = new PremiumStall(detailsArray[0], cost ,detailsArray[2], projector );
			ps.display();
			
		}
		else if(choice == 3) {
			
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Screens)");
			String details = sc.nextLine();
			String[] detailsArray = details.split(",");
			
			Integer cost = Integer.parseInt(detailsArray[1]);
			Integer screen = Integer.parseInt(detailsArray[3]);
			
			ExecutiveStall sd = new ExecutiveStall(detailsArray[0], cost ,detailsArray[2], screen );
			sd.display();
			
		}else {
			System.out.println("Invalid Stall Type");
		}
		
		
	}
}
