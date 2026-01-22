import state.DocumentContext;

public class Main {
    public static void main(String[] args) {

        DocumentContext doc = new DocumentContext();

        System.out.println("Current state: " + doc.getState());
        doc.edit();

        doc.publish();
        System.out.println("Current state: " + doc.getState());

        doc.edit();

        doc.publish();
        System.out.println("Current state: " + doc.getState());

        doc.edit();
        doc.publish();

    }
}
