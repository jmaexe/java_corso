import java.util.Date;

public class Agency {
    private Date favoriteDate;
    private String name;

    public Agency(String name, Date favoriteDate) {
        this.favoriteDate = new Date(favoriteDate.getTime());
        this.name = name;
    }

    public Date getFavoriteDate() {
        return new Date(favoriteDate.getTime());
    }
}
