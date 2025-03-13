public class StringRotationTest {
    public static void main(String[] args) {
        StringManager manager = new StringManager("waterbottle");
        System.out.println(manager.isRotation("waterbottle"));
        System.out.println(manager.isRotation("erbottlewat"));
        System.out.println(manager.isRotation("bottleofwater"));
        System.out.println(manager.isRotation("bo'owhfawfawf"));
    }
}
