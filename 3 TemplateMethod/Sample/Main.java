import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // 'H'를 가진 CharDisplay 인스턴스를 하나 만든다 
        AbstractDisplay d1 = new CharDisplay('H');

        // "Hello, world."를 가진 StringDisplay 인스턴스를 하나 만든다 
        AbstractDisplay d2 = new StringDisplay("Hello, world.");

        // d1,d2 모두 같은 AbstractDisplay의 하위 클래스의 인스턴스이므로
        // 상속한 display 메소드를 호출할 수 있다
        // 실제 동작은 CharDisplay나 StringDisplay 클래스에서 정해진다
        d1.display();
        d2.display();


        Collection.sort(list, (a, b) -> s.compare(a, b));
        Collection.sort(list, (a, b) -> a - b);
        Collection.sort(list, (a, b) -> b - a);
        Collection.sort(list, (a, b) -> compareTo(a, b));

    }

    // template method의 대표적인 예
    InputStream is = new InputStream() {
        @Override
        public int read() throws IOException {
            return 0;
        }

    }

    // 2023.10.21(토) 16h30
    // template method pattern
    // 부모에 run() 제외하고 다 구현되어 있음, 하는 일만 다르고 다 같은 thread임, 자식은 자기가 하는 일만 적으면 됨
    // 부모가 바뀌어도 자식은 안 바뀜 = 좋은 형태의 상속
    class MyThreadInTemplateMethodPattern extends Thread { // 상속을 통한 override
        @Override
        public void run() {
            // 코드 작성
            // Thread가 다른 건 다 구현해 놨음
        }
    }

    // strategy pattern
    // 그 때 그 때 하고 싶은 것에 따라 다른 것을 줌
    // 인터페이스니까 위 클래스보다 더 유연함
    class MyThreadInStrategyPattern implements Runnable {
        @Override
        public void run() { // Thread(Runnable r) 주입
            // 코드 작성
        }
    }

    // 둘 다 목표 = run() 구현


}

