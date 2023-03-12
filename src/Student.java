public class Student {

    private int age;
private int id;
    private String name;
    private Grade grade;


    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }
    public Grade getGrade(){
        return grade;
    }
    public int getAge(){
        return age;
    }

    public Student(int age, int id, String name, Grade grade) {
        this.age = age;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }



    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}






