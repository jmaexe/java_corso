public final class Movie {

    private String title ;
    private double rating;

    public Movie(String title , double rating){
        this.title = title;
        this.rating = rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public double getRating() {
        return rating;
    }
    public String getTitle() {
        return title;
    }
    

    @Override
    public String toString() {
    return "Movie title:" + title + ", rating:" + rating ;
    }
}