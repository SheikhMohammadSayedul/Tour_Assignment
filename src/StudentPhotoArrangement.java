import java.util.Arrays;
import java.util.Comparator;
public class StudentPhotoArrangement {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        students[0] = new Student("Kamal", 160.5);
        students[1] = new Student("Babul", 172.3);
        students[2] = new Student("Monir", 168.9);
        students[3] = new Student("Dulal", 155.4);
        students[4] = new Student("Eva", 170.1);

        Arrays.sort(students, Comparator.comparingDouble(Student::getHeight));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
