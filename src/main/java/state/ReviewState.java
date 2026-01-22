package state;

class ReviewState implements DocumentState {

    @Override
    public void edit(DocumentContext ctx) {
        System.out.println("Cannot edit. Document under review.");
    }

    @Override
    public void publish(DocumentContext ctx) {
        System.out.println("Review -> Published : Document published.");
        ctx.setState(new PublishedState());
    }

    @Override
    public String name() {
        return "REVIEW";
    }
}