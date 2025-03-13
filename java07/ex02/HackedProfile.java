public class HackedProfile extends GamingProfile {

    public HackedProfile(String username) {
        super(username);
    }

    public HackedProfile(GamingProfile profile) {
        super(profile.getUsername());
    }

    @Override
    public boolean isFirstUsername() {
        return true;
    }

    
}