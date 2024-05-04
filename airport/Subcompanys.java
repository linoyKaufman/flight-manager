package airport;
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

    public static void main(String[] args) {
        Subcompanys company = new Subcompanys("Subsidiary Airlines");
        company.addFlight("Flight 1");
        company.addFlight("Flight 2");
        company.addFlight("Flight 3");

        company.printFlights();

        company.removeFlight("Flight 2");

        company.printFlights();
    }

    @Override
    public void printdetails() {

        System.out.println("subcompany : " + this.companyName );
    }
}
