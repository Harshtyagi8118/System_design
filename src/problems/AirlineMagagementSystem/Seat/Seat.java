package problems.AirlineMagagementSystem.Seat;

public class Seat {
    private final String seatNo;
    private final SeatType seatType;
    private SeatStatus seatStatus;

    public Seat(String seatNo, SeatType seatType, SeatStatus seatStatus) {
        this.seatNo = seatNo;
        this.seatType = seatType;
        this.seatStatus = seatStatus;
    }
    public void reserve(){
        seatStatus = SeatStatus.RESERVED;
    }
    public void release(){
        seatStatus = SeatStatus.AVAILABLE;
    }
}
