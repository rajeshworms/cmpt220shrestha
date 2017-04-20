package Problem_13_5;
abstract class GeometricObject implements Comparable<GeometricObject>{

    public abstract double getArea();

    //returns the object of greater shape
    static GeometricObject Max(GeometricObject o1, GeometricObject o2)throws NullPointerException{
        if (o1 == null || o2 == null) {
            throw new NullPointerException();
        }
        return o1.compareTo(o2) >= 0 ? o1 : o2;
    }

    //Compares the area of object
    @Override
    public int compareTo(GeometricObject o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }
}
