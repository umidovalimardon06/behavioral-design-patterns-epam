public class Document {
    private DocumentState state;

    public Document(DocumentState state) {
        this.state = state;
    }

    public void edit() {
        if (state.equals(DocumentState.DRAFT)) {
            System.out.println("Editing the document..");
        } else if (state.equals(DocumentState.REVIEW)) {
            System.out.println("Cannot edit when in review");
        } else if (state.equals(DocumentState.PUBLISH)) {
            System.out.println("Cannot edit when publish");
        }
    }

    public void publish() {
        if (state == DocumentState.DRAFT) {
            state = DocumentState.REVIEW;
            System.out.println("Document sent for review.");
        } else if (state == DocumentState.REVIEW) {
            state = DocumentState.PUBLISH;
            System.out.println("Document published.");
        } else if (state == DocumentState.PUBLISH) {
            System.out.println("Already published.");
        }
    }

    ///  condionalar ko'paysa muammo bo'ladi.
    /// SOLID -> L


    public DocumentState getState() {
        return state;
    }

}
