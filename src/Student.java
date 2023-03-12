import java.awt.*;
import java.util.Objects;

public class Student {
    private int Id;

    private String name;
    private int age;
    private Grade grade;

    public Student(int id, String name, int age, Grade grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.Id = id;
    }

    public int getId() {
        return Id;
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

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getId() == student.getId() && getAge() == student.getAge() && Objects.equals(getName(), student.getName()) && getGrade() == student.getGrade();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAge(), getGrade());
    }
}
