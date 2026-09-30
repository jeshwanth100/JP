public class mulcatchblock {
    public static void main(String[] args) {
        try {

            int result = 10 / 0; 
            
            
             int[] numbers = {1, 2, 3};
             int value = numbers[5]; 
            
             int num = Integer.parseInt("abc"); 

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide a number by zero!");
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: You accessed an array index that does not exist!");
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid string format for number conversion!");
        }
        
        System.out.println("Program continues running smoothly after the catch block.");
    }
}
