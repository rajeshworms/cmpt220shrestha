public class Course {
        private final String courseName;
        private String[] students = new String[10];
        private int numberOfStudents;

        Course(String courseName) {
            this.courseName = courseName;
        }

        //To add students
        void addStudent(String student) {
            if (numberOfStudents >= students.length) {
                String[] temp = new String[students.length * 2];
                System.arraycopy(students, 0, temp, 0, students.length);
                students = temp;
            }
            students[numberOfStudents] = student;
            numberOfStudents++;
        }

        //Returns student
        String[] getStudents() {
            return students;
        }

        //Returns number of students
        int getNumberOfStudents() {
            return numberOfStudents;
        }

        //Returns course name
        String getCourseName() {
            return courseName;
        }

        //Drops the student from class
        void dropStudent(String student) {
            int index = getIndexOfStudent(student);
            if (index >= 0) {
                System.arraycopy(students, index + 1, students, index, numberOfStudents - index - 1);
            }
            students[--numberOfStudents] = null;
        }

        //Returns the index of student
        int getIndexOfStudent(String student) {
            for (int i = 0; i < numberOfStudents; i++) {
                if (students[i].equals(student)) {
                    return i;
                }
            }
            return -1;
        }

        //Removes all the students
        void clear() {
            students = new String[100];
            numberOfStudents = 0;
        }
    }