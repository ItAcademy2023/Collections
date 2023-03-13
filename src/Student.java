import java.util.Objects;

public class Student {
    private int age;
    private String name;
    private Grade grade;
    private int id;

    public Student(int id, int age, String name, Grade grade) {
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

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + " " +
                "Age: " + this.getAge() + " " +
                "Grade: " + this.getGrade() + " " +
                "Id: " + this.getId();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && id == student.id && Objects.equals(name, student.name) && grade == student.grade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, grade, id);
    }
}
