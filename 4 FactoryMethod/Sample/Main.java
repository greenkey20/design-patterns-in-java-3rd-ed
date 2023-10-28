import framework.Factory;
import framework.Product;
import idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Youngjin Kim");
        Product card2 = factory.create("Heungmin Son");
        Product card3 = factory.create("Kane");
        card1.use();
        card2.use();
        card3.use();
    }


    Singleton s = Singleton.getInstance();

    class Singleton {
        private static Singleton s = new Singleton();

        // static factory method = 객체 생성해서 반환하는 메서드 != factory method(이건 디자인패턴)
        public static Singleton getInstance() {
            if (s = null) s = new Singleton();
            return s;
        }
    }

}
