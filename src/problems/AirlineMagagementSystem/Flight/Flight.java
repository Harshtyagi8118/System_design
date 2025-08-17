package problems.AirlineMagagementSystem.Flight;

import problems.AirlineMagagementSystem.Seat.Seat;

import java.time.LocalDateTime;
import java.util.List;

public class Flight {
    private final String flightNumber;
    private final String source;
    private final String destinaion;
    private final LocalDateTime departureTime;
    private final LocalDateTime arrivalTime;
    private final List<Seat> seatList;

    public Flight(String flightNumber, String source, String destinaion, LocalDateTime departureTime, LocalDateTime arrivalTime, List<Seat> seatList) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destinaion = destinaion;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.seatList = seatList;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getSource() {
        return source;
    }

    public String getDestinaion() {
        return destinaion;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }
}
