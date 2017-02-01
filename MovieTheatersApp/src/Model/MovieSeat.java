package Model;


public class MovieSeat {
    
    private Movie movie;
    private String seatNumber;
    private boolean takenSeat;
    
    public MovieSeat(Movie movie, String seatNumber) {
        this.movie = movie;
        this.seatNumber = seatNumber;
        this.takenSeat = false;
    }
    
    public void setTakenSeat() {
        takenSeat = true;
    }
    
}
