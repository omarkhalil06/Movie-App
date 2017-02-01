package Model;

import Controller.MovieSeatsController;

public class Movie {
    
    private String title;
    private String rating;
    private String movieTime;
    private MovieSeatsController movieSeats;
    
    public Movie(String title, String rating, String movieTime) {
        this.title = title;
        this.rating = rating;
        this.movieTime = movieTime;
        this.movieSeats = new MovieSeatsController();
    }
    
}
