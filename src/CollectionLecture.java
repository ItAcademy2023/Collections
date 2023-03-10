import java.util.*;
import java.util.stream.Collectors;

public class CollectionLecture {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add( new Student(22, "Jonas Peterson", "University", 1));
        students.add(new Student(23, "Peter Johnson", "Primary", 2));
        students.add(new Student(36, "Tony Soprano", "Sunday school", 3));
        students.add(new Student(12, "Mark Norris", "Secondary", 4));
        students.add(new Student(12, "Mark Norris", "Secondary", 5));
        students.add(new Student(14, "Nora Jones", "Primary", 6));

//        for (Student student: students) {
//            System.out.println(student);
//        }
//        List<Student> studentsToRemove = new ArrayList<>();
//        for (Student student:students) {
//            if(student.getAge() >= 25){
//                studentsToRemove.add(student);
//            }
//        }
//        for (Student student: studentsToRemove) {
//            System.out.println(student);
//        }
//            students.removeAll(studentsToRemove);
//
//        System.out.println("My final list: " + students);

        students.removeIf(streamstud -> streamstud.getAge()>=25);

        System.out.println("streamed list: " + students);

        Set<Student> uniqueStudent = new HashSet<>(students);
        System.out.println("List size: " + students.size());
        System.out.println("Set size: " + uniqueStudent.size());

        uniqueStudent.removeIf(s -> (s.getGrade()== "Secondary"));
        System.out.println(uniqueStudent);

        Map<Integer, Student> studentsMap = uniqueStudent.stream().collect(Collectors.toMap(Student::getId, student -> student));



//        keyValuePairs.put("Karolis", new Student(33, "Karolis", "Primary", 7));
        System.out.println("Students MAP"+studentsMap);

        ///padaryti!!
//        students.removeIf(streamstud -> streamstud.getId()=4);
//        Student modifiedStudent = new Student(99, studentsMap.get(4).getName(), studentsMap.get(4).getGrade(), 4);

//        System.out.println(keyValuePairs.values());

//        System.out.println(keyValuePairs.get("Nora Jones"));
    }
}


