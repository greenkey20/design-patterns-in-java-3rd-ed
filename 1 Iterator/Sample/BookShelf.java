import java.util.Iterator;

public class BookShelf implements Iterable<Book> {
    private Book[] books; // 배열보다는 ArrayList 사용하는 게 좋음
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }

    // 2023.10.21(토) 16h15 BookShelfIterator에서 요청 받을 메서드
    //
}
