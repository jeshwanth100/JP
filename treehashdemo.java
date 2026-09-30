import java.util.*;
class treehashdemo{
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();
        hashSet.add("Electronics");
        hashSet.add("Clothes");
        hashSet.add("Books");
        hashSet.add("Electronics");
        treeSet.add("Electronics");
        treeSet.add("Clothes");
        treeSet.add("Books");
        treeSet.add("Electronics");
        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}