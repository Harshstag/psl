public abstract class HotelRoom{
    protected String hotelName;
    protected int numberOfSqFeet;
    
    HotelRoom(){}

    HotelRoom(String hotelName,int numberOfSqFeet)
    {
        this.hotelName=hotelName;
        this.numberOfSqFeet=numberOfSqFeet;
    } 
    
    public abstract int calculateTariff(); 
    
    public String getHotelName() {
        return hotelName;
    }
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
    public int getNumberOfSqFeet() {
        return numberOfSqFeet;
    }
    public void setNumberOfSqFeet(int numberOfSqFeet) {
        this.numberOfSqFeet = numberOfSqFeet;
    }
}   