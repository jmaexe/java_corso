public class InterfaceSegregationTest {

    public static void main(String[] args) {

        MultiFunctionDevice device = new MultiFunctionDevice();
        Document document = device.print("Ciao a tutti");

        String content = device.scan(document);

        System.out.println("Scanned : '" + content + "' ");

    }
}