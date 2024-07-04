
class DeluxeACRoom extends HotelRoom
{
    private int ratePerSqFeet;
    private String hasAC;
    
    public String getHasAC() {
        return hasAC;
    }
    public void setHasAC(String hasAC) {
        this.hasAC = hasAC;
    }
    
    DeluxeACRoom(String hotelName,int numberOfSqFeet,String hasAC, int ratePerSqFeet)
    {
        //Fill your code here
        super.hotelName = hotelName;
        super.numberOfSqFeet = numberOfSqFeet;

        this.hasAC = hasAC;
        this.ratePerSqFeet = ratePerSqFeet;

    }

    @Override
    public int calculateTariff()
    {
        if (hasAC.equalsIgnoreCase("yes")) {
            this.ratePerSqFeet = this.ratePerSqFeet + 2;
        }
        return (super.numberOfSqFeet * this.ratePerSqFeet);
    }
}