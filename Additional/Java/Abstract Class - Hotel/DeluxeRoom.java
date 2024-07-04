
class DeluxeRoom extends HotelRoom
{
    private int ratePerSqFeet;
    private String hasTV;
    
    
    public String getHasTV() {
        return hasTV;
    }
    public void setHasTV(String hasTV) {
        this.hasTV = hasTV;
    }
    
    DeluxeRoom(String hotelName,int numberOfSqFeet, String hasTV, int ratePerSqFeet)
    {
        //Fill your code here
        super.hotelName = hotelName;
        super.numberOfSqFeet = numberOfSqFeet;

        this.hasTV = hasTV;
        this.ratePerSqFeet = ratePerSqFeet;

    }

    @Override
    public int calculateTariff()
    {
        if (hasTV.equalsIgnoreCase("yes")) {
            this.ratePerSqFeet = this.ratePerSqFeet + 2;
        }
        return (super.numberOfSqFeet * this.ratePerSqFeet);
    }
}