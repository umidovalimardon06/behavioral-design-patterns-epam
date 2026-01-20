public class ConcreteAggregate<T> implements Aggregate<T> {

    private T[] items;

    public ConcreteAggregate(T[] items) {
        this.items = items;
    }

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(items);
    }
}
