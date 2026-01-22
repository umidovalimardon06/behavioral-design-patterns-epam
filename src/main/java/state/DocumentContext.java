package state;

public class DocumentContext {
    private DocumentState state;

    public DocumentContext() {
        state = new DraftState();
    }


    void setState(DocumentState newState) {
        this.state = newState;
    }

    public void edit() {
        state.edit(this);
    }

    public void publish() {
        state.publish(this);
    }

    public String getState() {
        return state.name();
    }
}
