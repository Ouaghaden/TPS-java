package ma.gstudents.student.repositories;

import ma.gstudents.student.models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements IStudentRepositoriy{
    List<Student>data=new ArrayList<Student>();
    public boolean create(Student s) {
        System.out.println("Rrepository:CREATE:Student"+s);
        data.add(s);
        System.out.println("DATA"+data);
        return true;
    }

    public boolean update(Student s) {
        data.stream().filter(x->{
            boolean b = x.getId()==s.getId();
            if (b==true) {
            }
            int index= data.indexOf(x);
            data.set(index,s);
                    return b;
                });
        return true;
    }

    public boolean delete(long id) {
        data.stream().filter(x->{
            boolean b = x.getId()==id;
            if (b==true) {
            }
            int index= data.indexOf(x);
            data.remove(id);
            return b;
        });
        return true;
    }

    public List<Student> select() {

        return null;
    }
}
