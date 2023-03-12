public class Student {

    private int age;
    private String name;
    private Grade grade;
    private Integer id;

    public Student(int age, String name, Grade grade, int id) {
        this.age = age;
        this.name = name;
        this.grade = grade;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (id != student.id) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return grade == student.grade;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (grade != null ? grade.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }

    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }
}
