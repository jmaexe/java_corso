public class MovieRatingTest {

    public static void main(String[] args) {
        MovieLibrary library = new MovieLibrary();

        library.addMovie(new Movie("Inception", 8.0));
        library.addMovie(new Movie("The Godfather", 9.2));
        library.addMovie(new Movie("Interstellar", 8.6));


        Movie topRatedMovie = library.getTopRated();
        if(topRatedMovie != null) {
            System.out.println(topRatedMovie);
        }

    }
}