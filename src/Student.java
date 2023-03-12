import java.util.Objects;

public class Student {
    private String name;
    private Grade grade;
    private int age;
    private Integer id;

    public Student(String name, Grade grade, int age, Integer id) {
        this.name = name;
        this.grade = grade;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && grade == student.grade && Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade, age, id);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }
}
