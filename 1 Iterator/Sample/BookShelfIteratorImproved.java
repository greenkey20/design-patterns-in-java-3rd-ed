import java.util.Iterator;
import java.util.function.Consumer;

// 2023.10.21(토) 16h10
public class BookShelfIteratorImproved implements Iterator<Book> {

    @Override
    public boolean hasNext() {

        return false;
    }

    @Override
    public Book next() {
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public void forEachRemaining(Consumer<? super Book> action) {
        Iterator.super.forEachRemaining(action);
    }
}
