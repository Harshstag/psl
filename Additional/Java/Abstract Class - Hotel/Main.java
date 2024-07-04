import java.io.*;

public class Main {  
    
    public static void main(String args[]) throws IOException {        
        System.out.println("Hotel Tariff Calculator");        
        System.out.println("1. Deluxe Room");
        System.out.println("2. Deluxe AC Room");
        System.out.println("3. Suite AC Room");
        System.out.println("Select Room Type:");


        HotelRoom room = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int option = Integer.parseInt(br.readLine());
        switch (option) {
            case 1:
                {
                    System.out.println("Hotel Name:");
                    String name = br.readLine();

                    System.out.println("Room Square Feet Area:");
                    int SqFeetArea = Integer.parseInt(br.readLine());

                    System.out.println("Room has TV (yes/no):");
                    String yesNo = br.readLine();

                    DeluxeRoom DR = new DeluxeRoom(name, SqFeetArea, yesNo, 10);
                    
                    int roomTariff = DR.calculateTariff();

                    System.out.println("Room Tariff per day is:"+roomTariff);
                    break;
                }
            case 2:
                {
                    System.out.println("Hotel Name:");
                    String name = br.readLine();

                    System.out.println("Room Square Feet Area:");
                    int SqFeetArea = Integer.parseInt(br.readLine());

                    System.out.println("Room has AC (yes/no):");
                    String yesNo = br.readLine();

                    DeluxeACRoom DAC = new DeluxeACRoom(name, SqFeetArea, yesNo, 12);
                    
                    int roomTariff = DAC.calculateTariff();

                    System.out.println("Room Tariff per day is:"+roomTariff);
                    break;
                }
            case 3:
                {
                    System.out.println("Hotel Name:");
                    String name = br.readLine();

                    System.out.println("Room Square Feet Area:");
                    int SqFeetArea = Integer.parseInt(br.readLine());

                    System.out.println("Room has Wifi (yes/no):");
                    String yesNo = br.readLine();

                    SuiteACRoom SAC = new SuiteACRoom(name, SqFeetArea, yesNo, 15);
                    
                    int roomTariff = SAC.calculateTariff();
                    
                    System.out.println("Room Tariff per day is:"+roomTariff);
                    break;
                }
            default:
                System.out.println("Invalid Option");
                break;
        }
    }
}
