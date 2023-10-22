import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Iterable<Book> {
    private List<Book> books;

    public BookShelf(int initialsize) {
        this.books = new ArrayList<>(initialsize);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }

    // 2023.10.29(토) 9h35 내가 만든/수정한 iterator 사용 가능하도록 추가
    public BookShelfIteratorImproved iteratorImproved() {
        return new BookShelfIteratorImproved(getBooks(), getLength(), 0);
    }

    // 2023.10.29(토) 11h10 추가
    public List<Book> getBooks() {
        return books;
    }

    public BookShelf() {
    }
}
