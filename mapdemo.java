import java.util.*;

class mapdemo{
    public static void main(String[] args) {
        HashMap<Integer, Double> hashMap = new HashMap<>();
        TreeMap<Integer, Double> treeMap = new TreeMap<>();
        hashMap.put(103, 500.0);
        hashMap.put(101, 250.0);
        hashMap.put(102, 350.0);
        treeMap.put(103, 500.0);
        treeMap.put(101, 250.0);
        treeMap.put(102, 350.0);
        int id = 102;
        if (hashMap.containsKey(id)) {
            System.out.println("Product found");
            System.out.println("Price: " + hashMap.get(id));
        } else {
            System.out.println("Product not found");
        }
        hashMap.put(102, 400.0);
        treeMap.put(102, 400.0);
        System.out.println("Updated Price: " + hashMap.get(102));
        System.out.println("Products in sorted order:");
        for (Map.Entry<Integer, Double> entry : treeMap.entrySet()) {
            System.out.println("Product ID: " + entry.getKey()
                    + ", Price: " + entry.getValue());
        }
    }
}