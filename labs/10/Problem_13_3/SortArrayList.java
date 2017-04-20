package Problem_13_3;
import java.util.ArrayList;
import java.util.Random;

public class SortArrayList {
    public static void main(String[] args) {
    	//Creating ArrayList object
        ArrayList<Number> list = generateRandomArray(10);
        System.out.println("Original list");
        System.out.println(list);
        sort(list); 
        System.out.println("After Sorting");
        System.out.println(list);

    }

    //Method to generate random numbers and store it in arraylist
    private static ArrayList<Number> generateRandomArray(int size) {
        ArrayList<Number> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(size));
        }
        return list;
    }

    //Method to sort the values
    public static void sort(ArrayList<Number> list) {
            boolean sorted;
            Number temp;
            do {
                sorted = true;
                for (int i = 0; i < list.size() - 1; i++) {
                    if (list.get(i).doubleValue() > list.get(i + 1).doubleValue()) {
                        temp = list.remove(i);
                        list.add(i + 1, temp);
                        sorted = false;
                    }
                }
            } while (!sorted);

    }
}