import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

// 2023.10.21(토) 16h10
public class BookShelfIteratorImproved implements Iterator<Book> {
    // 2023.10.28(토) 9h25 ArrayList 클래스에서 Iterator 구현된 것 참고해서 아이디어 내봄
    // 이 iterator를 생성해서 사용하고자 할 때 Bookshelf(x) 순회 대상의 size 및 순회 중인 요소의 인덱스(o)를 전달받음
    private List<Book> elementData;
    private int size;
    private int index;

    public BookShelfIteratorImproved(List<Book> elementData, int size, int index) {
        this.elementData = elementData;
        this.size = size;
        this.index = index;
    }

    @Override
    public boolean hasNext() {
//        List<Book> booksList = new ArrayList<>();
//        booksList.iterator();
//
//        return false;
        return index != size; // 순회 중인 요소의 index가 size와 같다 = 더 이상 요소가 없음 vs 순회 중인 요소의 index가 size보다 작다/같지 않다 = 다음 요소가 있음
    }

    @Override
    public Book next() {
//        return null;
        if (!hasNext()) throw new NoSuchElementException();
        Book element = this.elementData.get(index);
        index++;
        return element;
    }

    @Override
    public void remove() {
//        Iterator.super.remove();
        if (index < 0) throw new IllegalStateException();

    }

    @Override
    public void forEachRemaining(Consumer<? super Book> action) {
        Iterator.super.forEachRemaining(action);
    }
}
