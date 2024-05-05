package EX1.airport;
import java.util.ArrayList;
import java.util.List;

public class Subcompanys implements AirlineInterface {
    private String companyName;
    private List<String> flights;

    public Subcompanys(String companyName) {
        this.companyName = companyName;
        this.flights = new ArrayList<>();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void addFlight(String flightName) {
        flights.add(flightName);
    }

    public void removeFlight(String flightName) {
        flights.remove(flightName);
    }

    public void printFlights() {
        System.out.println("Flights of " + companyName + ":");
        for (String flight : flights) {
            System.out.println(flight);
        }
    }
    @Override
    public void printdetails() {

        System.out.println("subcompany : " + this.companyName );
    }
}
