import java.util.Comparator;

public class Student {
    //private String name;
    private String name;
    private int age;
    private Grade grade;

    private int ID;

    public Student(int age, String name, Grade grade, int ID) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Grade getGrade() {
        return grade;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", ID=" + ID +
                '}';
    }
    //Custom comparator
    static class Sortbyname implements Comparator<Student> {
        // Sorting in ascending order of name
        public int compare(Student a, Student b) {
            return a.name.compareTo(b.name);
        }
    }
}
