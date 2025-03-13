import java.util.Date;

public class GamingProfile {

    private final Date registrationDate = new Date();
    private String username;
    private boolean firstUsername = true ;

    public GamingProfile(String username) {
        this.username = username;
    }
    public void setUsername(String username) {
        this.username = username;

       if(isFirstUsername()) {
        System.out.println("Username changed for free to " + username  );
       }
       else {
        System.out.println("Username changed to " + username + "(cost: 5$)");
       } 
       setFirstUsername(false);
    }

    public void setFirstUsername(boolean firstUsername) {
        this.firstUsername = firstUsername;
    }
    public String getUsername() {
        return username;
    }
    public final boolean isFirstUsername() {
    return  firstUsername;
    }
}