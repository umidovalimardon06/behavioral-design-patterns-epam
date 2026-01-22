package state;

class PublishedState implements DocumentState {

    @Override
    public void edit(DocumentContext ctx) {
        System.out.println("Cannot edit. Document is published.");
    }

    @Override
    public void publish(DocumentContext ctx) {
        System.out.println("Already published.");
    }

    @Override
    public String name() {
        return "PUBLISHED";
    }
}