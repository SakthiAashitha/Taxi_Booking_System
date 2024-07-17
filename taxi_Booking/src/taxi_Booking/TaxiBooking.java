package taxi_Booking;

import java.util.ArrayList;

public class TaxiBooking {
	private static ArrayList<Taxi> taxiBooking=new ArrayList<Taxi>();
	private static ArrayList<Taxi> bookingHistory=new ArrayList<Taxi>();
	private static int setTaxiLimit=2;
	private static int id=1;
	//@SuppressWarnings("null")
	public static String Booking(char pickupLocation, char dropLocation, int pickupTime) throws CloneNotSupportedException  {
		
		if(taxiBooking.size()<setTaxiLimit) {
			taxiBooking.add(new Taxi());
		}
		int earn=0;
		int min=Integer.MAX_VALUE;
		Taxi taxiReady=null;
		for(Taxi t:taxiBooking) {
			if(t.getDropTime()<=pickupTime && Math.abs(t.getCurrentLocation()-pickupLocation)<=min) {
				if(Math.abs(t.getCurrentLocation()-pickupLocation)==min) {
					if(earn>=t.getEarnings()) {
					taxiReady=t;
					}
				}
				else {
				earn=t.getEarnings();
				min=Math.abs(t.getCurrentLocation()-pickupLocation);
				taxiReady=t;
				}
			}
		}
		if(taxiReady!=null) {
			taxiReady.setDropLocation(dropLocation);
			taxiReady.setCustomerId(id++);
			taxiReady.setCurrentLocation(dropLocation);
			taxiReady.setDropTime(pickupTime + Math.abs(dropLocation-pickupLocation));
			taxiReady.setTaxiId(taxiBooking.indexOf(taxiReady)+1);
			taxiReady.setEarnings((taxiReady.getEarnings())+((Math.abs(pickupLocation-dropLocation)*15-5)*10+(100)));
			taxiReady.setpickupTime(pickupTime);
			taxiReady.setPickupLocation(pickupLocation);
			bookingHistory.add((Taxi)taxiReady.clone());
		}
		return taxiReady == null ? "Taxi is not Available" : "Taxi-"+taxiReady.getTaxiId()+" is booked";
	}
	
	public static void display() {
		
		for(Taxi t:bookingHistory) {
			System.out.println(t.toString());
			System.out.println("--------------------------------");
		}
		
	}
	
	
}