package ma.gstudents.student.models;

public class Student {
long id ;
String name ;
int age ;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(long id, String name, int age){
    this.id=id;
    this.name=name;
    this.age=age;
}
public Student(){}

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
