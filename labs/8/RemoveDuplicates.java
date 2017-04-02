import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
    	//Creating ArrayList class object
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in); //Creating scanner object
        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }
        removeDuplicate(list);
        displayList(list);
    }

    //Method to display the final data
    private static void displayList(ArrayList<Integer> list) {
        System.out.print("The distinct integers are");
        for (Integer i : list) {
            System.out.print(" " + i);
        }
    }

    //Method to remove duplicates from the arraylist
    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer i : list) {
            if (!newList.contains(i)){
            	newList.add(i);
            }
        }
        list.clear();
        list.addAll(newList);
    }

}