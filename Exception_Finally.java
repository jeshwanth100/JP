public class Exception_Finally {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 2;

            System.out.println(a / b);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
