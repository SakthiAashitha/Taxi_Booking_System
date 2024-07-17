package taxi_Booking;
import java.util.*;
public class TaxiMain {
	public static void main(String[] args) throws CloneNotSupportedException{

		try {
	Scanner sc=new Scanner(System.in);

	boolean loop=true;
	while(loop) {
	//char currentLocation='A';
	System.out.println("-------------------------");
	System.out.println("Taxi Booking Application ");
	System.out.println("-------------------------");
	
	System.out.println("Choose a option");
	System.out.println("1) Book Taxi\n2) Display Details\n3) Exit");
	
	int ch=sc.nextInt();
	
	switch(ch){
	case 1:
	{	
	System.out.println("Enter the Pickup Location : ");
	char pickupLocation=sc.next().charAt(0);
	System.out.println("Enter the Drop Location : ");
	char dropLocation=sc.next().charAt(0);
	System.out.println("Enter the Pickup Time : ");
	int pickupTime=sc.nextInt();
	System.out.println(TaxiBooking.Booking(pickupLocation, dropLocation, pickupTime));
	break;
	}
	case 2:
	{
		
	TaxiBooking.display();	
	break;
	}
	case 3:
	{
		System.out.println("Thank You!!!!");
		sc.close();
		loop=false;
		break;
	}
}
		}
		}
	
	catch (CloneNotSupportedException e) {
        e.printStackTrace();
    }

	
}

	
}
