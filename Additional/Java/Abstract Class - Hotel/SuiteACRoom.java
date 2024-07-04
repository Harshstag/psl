
class SuiteACRoom extends HotelRoom
{
    private int ratePerSqFeet;
    private String hasWifi;
    
    public String getHasWifi() {
        return hasWifi;
    }
    public void setHasWifi(String hasWifi) {
        this.hasWifi = hasWifi;
    }
    
    SuiteACRoom(String hotelName,int numberOfSqFeet,String hasWifi, int ratePerSqFeet)
    {
        //Fill your code here
        super.hotelName = hotelName;
        super.numberOfSqFeet = numberOfSqFeet;

        this.hasWifi = hasWifi;
        this.ratePerSqFeet = ratePerSqFeet;
    }

    @Override
    public int calculateTariff()
    {
        if (hasWifi.equalsIgnoreCase("yes")) {
            this.ratePerSqFeet = this.ratePerSqFeet +  2;
        }
        return (super.numberOfSqFeet * this.ratePerSqFeet);
    }
}