import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // First task
        String cars[] = {"Subaru", "BMW", "Suzuki"};

        System.out.println(cars[1]);

        cars[2] = "Honda";

        System.out.println(cars.length);

        for (String car : cars) {
            System.out.println(car);
        }

        // Second task
        int numbers[] = {40, 55, 63, 17, 22, 68, 89, 97, 89};

        System.out.println(Arrays.toString(numbers));

        // Third task
        Integer newArr[] = {1, 2, 3, 4, 5, 6};

        List<Integer> newList = Arrays.asList(newArr);

        System.out.println(newList);


        // Fourth task
        List <Student> listOfStudents = new ArrayList<>();

        listOfStudents.add(new Student("Alex", 20, Education.Secondary, 1));
        listOfStudents.add(new Student("James", 21, Education.University, 2));
        listOfStudents.add(new Student("Howard", 26, Education.University, 3));
        listOfStudents.add(new Student("Peter", 24, Education.Primary, 4));
        listOfStudents.add(new Student("Anna", 22, Education.Secondary, 5));

        for (Student student : new ArrayList<>(listOfStudents)) {
            if (student.getAge() > 25) listOfStudents.remove(student);
        }

        System.out.println(listOfStudents);

        // Fifth task
        String fruits = "Apple Pear Banana Banana";

        List <String> fruitsList = new ArrayList <>(
                Arrays.asList(
                        fruits.split(" ")));

        System.out.println(fruitsList.size());

        Set <String> fruitsSet = new HashSet<>(fruitsList);

        System.out.println(fruitsList);
        System.out.println(fruitsSet);
        System.out.println(fruitsSet.size());

        // Sixth task
        Map <Integer, Student> studentsMap = listOfStudents
                .stream()
                .collect(Collectors
                        .toMap(Student:: getID, student -> student));

        System.out.println(studentsMap);

        studentsMap.get(4).setAge(17);
        studentsMap.get(4).setEducation(Education.Primary);

        System.out.println(studentsMap);
    }
}