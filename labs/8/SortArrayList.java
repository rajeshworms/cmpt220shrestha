import java.util.*;

public class SortArrayList {
    public static void main(String[] args) {
    	//Creating ArrayList object to user input
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in); //Creating scanner object to take input
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        sort(list);
        System.out.println(list);
    }

    //Method to sort datas stored in arraylist
    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }
}