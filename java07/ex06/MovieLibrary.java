import java.util.ArrayList;

public class MovieLibrary {

    private ArrayList<Movie> movies;

    public MovieLibrary() {
        this.movies = new ArrayList<Movie>();
    }


    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public Movie getTopRated() {
        double maxRating = 0;
        Movie topRatedMovie = null;
        for (Movie movie : movies) {
            if (movie.getRating() > maxRating) {
                maxRating = movie.getRating();
                topRatedMovie = movie;
            }
        }
        return topRatedMovie;
    }


}