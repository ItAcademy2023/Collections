public class Student {
    private int age;
    private String name;
    private Grade grade;
    private int ID;

    public Student(int age, String name, Grade grade, int ID) {
        this.age = age;
        this.name = name;
        this.grade = grade;
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
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
        return getClass().getName() + ": [Name: " + name + ", Age: " + age + ", Grade: " + grade + "]";
    }
}
