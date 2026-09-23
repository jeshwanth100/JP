public class OrderProcessor {
    public static void main(String[] args) {
        int[] itemPrices = {120,250,80};
        int itemIndex = 5;

        try {
 	    System.out.println("Processing order...");
            System.out.ptintln("Price: " + itemPrices[itemIndex]);
       	    System.out.println("Order placed successfully!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Sorry, that item is no longer available. Please choose another. ");
        }
        System.out.println("Returning to menu...");
  }
}