public class MultiFunctionDevice implements Printer, Scanner {

    @Override
    public String scan(Document document) {
        System.out.println("Scanning document...");
        return document.getContent();
    }

    @Override
    public Document print(String message) {
        System.out.println("Printing '" + message + "'");
        return new Document(message);
    }

}