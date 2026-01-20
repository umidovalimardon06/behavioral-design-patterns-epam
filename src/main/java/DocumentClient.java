public class DocumentClient {

    private static TextDocument document = new TextDocument();
    public static void main(String[] args) {
        document.write("Hi");
        document.print();
        document.save();
        document.write(" world!");
        document.print();
        document.undo();
        document.print();
    }
}
