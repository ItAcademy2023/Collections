import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeolocationsLecture {
    public static <Students> void main(String[] args) {
        List<Student> students2 = new ArrayList<>(Arrays.asList(
                new Student(1, 25, "Anthony", Grade.UNIVERSITY),
                new Student(2, 24, "Doe", Grade.PRIMARY),
                new Student(3, 15, "Robert", Grade.PRIMARY),
                new Student(4, 60, "John", Grade.PRIMARY),
                new Student(5, 11, "Rita", Grade.PRIMARY)
        ));

//                List.of(new Student(25, "name1", Grade.UNIVERSITY),
//                new Student(24, "Doe", Grade.PRIMARY),
//                new Student(15, "Robert", Grade.PRIMARY));
//                students.add(new Student(11, "Rita", Grade.UNIVERSITY));
//                Student rita = students.get(3);

        students2.remove(2);

        for (Student student : students2) System.out.println(student);



    }
}
