package state;

public interface DocumentState {
    void edit(DocumentContext documentContext);

    void publish(DocumentContext documentContext);

    String name();
}
