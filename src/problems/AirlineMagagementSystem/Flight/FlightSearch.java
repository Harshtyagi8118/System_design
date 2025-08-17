package problems.AirlineMagagementSystem.Flight;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {
    private final List<Flight> flights;


    public FlightSearch(List<Flight> flights) {
        this.flights = flights;
    }
    public List<Flight> searchFlight(String source, String destination, LocalDateTime onDate) {
        return flights.stream().filter(flight ->
                flight.getSource().equalsIgnoreCase(source)
                        && flight.getDestinaion().equalsIgnoreCase(destination)
                        && flight.getDepartureTime().toLocalDate().equals(onDate)).collect(Collectors.toList());
    }
}

