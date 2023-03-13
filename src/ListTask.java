import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTask {
    public static void main(String[] args) {
        // lists task
        Integer[] integerArr = {2, 5, 7, 8};

//        List<Integer> integerList = new ArrayList<>();
//        for (int i = 0; i < integerArr.length; i++) {
//            integerList.add(integerArr[i]);
//        }
        List<Integer> integerList = new ArrayList<>(Arrays.asList(integerArr));
        System.out.println(integerList);


        // populating students list
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student(1, 25, "Anthony", Grade.UNIVERSITY),
                new Student(2, 24, "Doe", Grade.PRIMARY),
                new Student(3, 15, "Robert", Grade.UNIVERSITY),
                new Student(4, 60, "John", Grade.PRIMARY),
                new Student(5, 11, "Rita", Grade.PRIMARY)
        ));

        // removing using for loop
        int listSize = students.size();
        for(int i = 0; i < listSize; i++) {
            if(students.get(i).getAge() > 25) {
                students.remove(students.get(i));
                listSize--;
            }
        }
        // removing using stream
        students.removeIf(student -> student.getAge() > 25);
        for (Student student : students) System.out.println(student);
    }
}
