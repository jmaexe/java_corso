public class StringManager {
    private String string;

    public StringManager(String string) {
        this.string = string;
    }

    public String reverse() {
        StringBuilder s = new StringBuilder(string.length());
        for (int i = string.length() - 1; i >= 0; i--) {
            s.append(string.charAt(i));
        }
        return s.toString();
    }

    public boolean isRotation(String string) {
        return this.string.length() == string.length() && (this.string + this.string).contains(string);
    }
}
