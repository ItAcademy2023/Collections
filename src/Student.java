public class Student {
    private String name;

    private int age;

    private Education education;

    public Student(String name, int age, Education education) {
        this.name = name;
        this.age = age;
        this.education = education;
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
                '}';
    }
}
