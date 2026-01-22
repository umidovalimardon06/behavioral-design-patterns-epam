public class Main {
    public static void main(String[] args) {

        Document document  = new Document(DocumentState.DRAFT);

        System.out.println("Current state: "+document.getState());
        document.edit();


    }
}
