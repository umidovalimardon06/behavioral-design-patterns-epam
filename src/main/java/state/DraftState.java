package state;

public class DraftState implements DocumentState {
    @Override
    public void edit(DocumentContext documentContext) {
        System.out.println("Editing document (Draft)..");
    }

    @Override
    public void publish(DocumentContext documentContext) {
        System.out.println("Draft -> Review");
        documentContext.setState(new ReviewState());
    }

    @Override
    public String name() {
        return "DRAFT";
    }
}
