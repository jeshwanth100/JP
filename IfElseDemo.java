import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Eenter the number:");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("It's a positive number");
        }
        else {
            System.out.println("It's a negative number");
        }
        sc.close();
    }
}
