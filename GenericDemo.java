class Box<T> {
    private T value;
    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}
class GenericDemo {
    public static <T> void display(T value) {
        System.out.println("Value: " + value);
    }
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setValue(100);
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Java Generics");
        Box<Double> doubleBox = new Box<>();
        doubleBox.setValue(25.5);
        System.out.println("Integer Value: " + intBox.getValue());
        System.out.println("String Value: " + stringBox.getValue());
        System.out.println("Double Value: " + doubleBox.getValue());
        display(500);
        display("Hello");
        display(10.5);
    }
}

