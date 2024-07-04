class TicketBooking{
    private String customerName;
    private Integer noOfTickets;
    private Double price;
    
    
    public TicketBooking() {
		super();
		// TODO Auto-generated constructor stub
	}



	public TicketBooking(String customerName, Integer noOfTickets, Double price) {
		super();
		this.customerName = customerName;
		this.noOfTickets = noOfTickets;
		this.price = price;
	}
    


    String getCustomerName(){
        return this.customerName;
    }
    Integer getNoOfTickets(){
        return this.noOfTickets;
    }
    Double getPrice(){
        return this.price;
    }
    
    public String toString() {
    	return String.format("%-10s %-15d %-15.1f", customerName, noOfTickets, price);
    } 
}
