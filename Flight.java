import java.util.*;


public class Flight  {
    private String flightcode;
    private boolean iscancelled;
    private float price;
    private int departureTime;
    private int LandingTime;
    private List <Traveler> passengers;
    private String destination;

    public Flight(String flightcode, boolean iscancelled, float price, int departureTime, int LandingTime , List <Traveler> passengers,String destination ) {
        this.flightcode = flightcode;
        this.iscancelled = iscancelled;
        this.price = price;
        this.departureTime = departureTime;
        this.LandingTime = LandingTime;
        this.destination=destination;
        
    }

    public int getdepartureTime() {
        return departureTime;
    }

    public String getdetination() {
        return destination;
    }

    public int getFlightTime() {
       int flightTime = LandingTime - departureTime;
        return flightTime;
    }

    public float getPrice() {
        return price;
    }

    public boolean iscancelled() {
        return iscancelled;
    }

    public String getName() {
        return flightcode;
    }

    public void setPrice(float price){
        this.price = price;
       // notifyObservers();
    }

    public void iscancelled(boolean iscancelled ){ //fix
        
        
    }

    public void setDepartureTime(int newdepartureTime){
        int delay = newdepartureTime - this.departureTime;
        this.LandingTime = this.LandingTime + delay;
        this.departureTime = newdepartureTime;
        //notifyObservers();

    }

    public String toString() {
        return  this.flightcode ;
    }
    
    public void setPrice(int price){
        this.price=price;
       // notifyObservers();
    }

    public void addPassenger(Traveler passenger) {
        passengers.add(passenger);
    }

    public int getNumPassengers() {
        return passengers.size();
    }

    public void setFlightNumber(String newname) {
        this.flightcode = newname;


    }
}