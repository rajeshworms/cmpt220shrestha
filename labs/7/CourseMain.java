public class CourseMain {
    public static void main(String[] args) {
        Course course = new Course("Science");
        course.addStudent("Roxanee");
        course.addStudent("Julie");
        course.addStudent("Matt");
        course.dropStudent("Hilda");
        
        //Loop to display the data
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.println("Student " + i + ": " + course.getStudents()[i]);
        }
    }
}