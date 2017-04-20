package Problem_13_11;

public class OctagonMain {
    public static void main(String[] args) {
    	//Creating octagon class objects
        Octagon octagon1 = new Octagon(5);
        Octagon octagon2 = (Octagon) octagon1.clone();

        //Display the result to the user
        System.out.println("octagon1");
        System.out.println("   Perimeter = " + octagon1.getPerimeter());
        System.out.println("   Area =      " + octagon1.getArea());
        System.out.println("octagon2");
        System.out.println("   Perimeter = " + octagon2.getPerimeter());
        System.out.println("   Area =      " + octagon2.getArea());
        System.out.println();
        System.out.println("octagon1.compareTo(octagon2) = " + octagon1.compareTo(octagon2));
    }
}
