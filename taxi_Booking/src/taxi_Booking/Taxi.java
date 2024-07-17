package taxi_Booking;

public class Taxi implements Cloneable{
	private char currentLocation='A';
	private int customerId;
	private int taxiId;
	private char dropLocation;
	private char pickupLocation;
	private int earnings;
	private int pickupTime;
	private int dropTime;
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public char getDropLocation() {
		return dropLocation;
	}
	
	public void setDropLocation(char dropLocation) {
		this.dropLocation=dropLocation;
	}
	
	public char getCurrentLocation() {
		return currentLocation;
	}
	
	public void setCurrentLocation(char currentLocation) {
		this.currentLocation=currentLocation;
	}
	
	public char getPickupLocation() {
		return pickupLocation;
	}
	
	public void setPickupLocation(char pickupLocation) {
		this.pickupLocation=pickupLocation;
	}
	
	public int getEarnings(){
		return earnings;
	}
	
	public void setEarnings(int earnings) {
		this.earnings=earnings;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId=customerId;
	}
	
	public int getPickupTime() {
		return pickupTime;
	}
	
	public void setpickupTime(int pickupTime) {
		this.pickupTime=pickupTime;
	}
	
	public int getDropTime() {
		return dropTime;
	}
	
	public void setDropTime(int dropTime) {
		this.dropTime=dropTime;
	}
	
	public int getTaxiId() {
		return taxiId;
	}
	
	public void setTaxiId(int taxiId) {
		this.taxiId=taxiId;
	}
	
	@Override
	public String toString() {
		return "TAXI - "+getTaxiId()+"\nCURRENT LOCATION : "+currentLocation+"\nEARNINGS : "+earnings;
	}

	
}
