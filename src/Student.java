import java.util.Objects;

public class Student {
    private String name;

    private int age;

    private Education education;

    private int ID;

    public Student(String name, int age, Education education, int id) {
        this.name = name;
        this.age = age;
        this.education = education;
        this.ID = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Education getEducation() {
        return education;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", education=" + education +
                ", ID=" + ID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return ID == student.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }
}
