import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    private int age;
    private String name;
    private Grade grade;

    private int id;

    public Student(int age, String name, Grade grade, int id) {
        this.age = age;
        this.name = name;
        this.grade = grade;
        this.id = id;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                "id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && grade == student.grade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, grade, id);
    }
}
