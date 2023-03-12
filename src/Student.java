import enums.Grade;

import java.util.Objects;

public class Student {

    // Add id to Student class
    private int studentID;
    private String name;
    private int age;
    private Grade grade;

    public Student(int studentID, String name, int age, Grade grade) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getStudentID() {
        return studentID;
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

    public void changeGradeAndAge(Grade grade, int age) {
        this.grade = grade;
        this.age = age;
    }

    @Override
    public String toString() {

        return String.format("\nStudent %s is %s years old, going to %s grade. ID is %s", getName(), getAge(), getGrade(), getStudentID());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && studentID == student.studentID && name.equals(student.name) && grade == student.grade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, grade);
    }
}
