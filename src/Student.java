import java.util.Objects;

public class Student {

    private int id;
    private int age;
    private String name;
    private Grade grade;

    public Student(int id, int age, String name, Grade grade) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
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

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getId() == student.getId() && getAge() == student.getAge() && Objects.equals(getName(), student.getName()) && getGrade() == student.getGrade();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getAge(), getName(), getGrade());
    }
}
