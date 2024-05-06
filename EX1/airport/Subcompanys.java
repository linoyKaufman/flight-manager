package EX1.airport;
import java.util.ArrayList;
import java.util.List;
// This class represents a subsidiary airline company.
public class Subcompanys implements AirlineInterface {
    private String companyName;
    private List<String> flights;

     // Constructor to initialize the Subcompanys object with the company name.
    public Subcompanys(String companyName) {
        this.companyName = companyName;
        this.flights = new ArrayList<>();
    }
    // Method to get the company name of the subsidiary airline.
    public String getCompanyName() {
        return companyName;
    }
    // Method to set the company name of the subsidiary airline.
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    // Method to add a flight to the subsidiary airline's list of flights.
    public void addFlight(String flightName) {
        flights.add(flightName);
    }
    // Method to remove a flight from the subsidiary airline's list of flights.
    public void removeFlight(String flightName) {
        flights.remove(flightName);
    }
    // Method to print the list of flights operated by the subsidiary airline.
    public void printFlights() {
        System.out.println("Flights of " + companyName + ":");
        for (String flight : flights) {
            System.out.println(flight);
        }
    }
    // Method to print details of the subsidiary airline.
    @Override
    public void printdetails() {

        System.out.println("subcompany : " + this.companyName );
    }
}
