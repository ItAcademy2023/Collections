import java.util.Objects;

public class Student {
    private int age;
    private String name;
    private String grade;

    private int id;

    public Student(int age, String name, String grade, int id) {
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

    public String getGrade() {
        return grade;
    }

    public int  getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", Id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(grade, student.grade) && id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, grade, id);
    }
}

