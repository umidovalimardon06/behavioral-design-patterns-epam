public class ConcreteIterator<T> implements Iterator<T> {
    private T[] items;
    private int currentPosition = 0;

    public ConcreteIterator(T[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < items.length;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            return null;
        }
        return items[currentPosition++];
    }
}