import java.util.ArrayList;
/**
 * This program demonstrates various operations on an ArrayList.
 */
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        System.out.println("ArrayList: " + num);
        System.out.println("Element at index 2: " + num.get(2));
        num.set(3, 45);
        System.out.println("Updated ArrayList: " + num);
        num.remove(1);
        System.out.println("ArrayList after removing element at index 1: " + num);
        num.remove(Integer.valueOf(30));
        System.out.println("ArrayList after removing element 30: " + num);
        if (num.contains(40)) {
            System.out.println("ArrayList contains 40");
        } else {
            System.out.println("ArrayList does not contain 40");
        }        System.out.println("Size of ArrayList: " + num.size());
        System.out.print("Elements of ArrayList:");
        for (int nums : num) {
            System.out.print(" " + nums);
        }        System.out.println();num.clear();
        System.out.println("ArrayList after clearing: " + num);
    }
}
