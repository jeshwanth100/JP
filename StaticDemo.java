class Counter {
    static int objectCount = 0;

    Counter() {
        objectCount++;
    }

    static void displayCount() {
        System.out.println("Number of objects created: " + objectCount);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        Counter.displayCount();
    }
}