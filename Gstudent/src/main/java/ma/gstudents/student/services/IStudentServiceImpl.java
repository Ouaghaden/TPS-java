package ma.gstudents.student.services;

import ma.gstudents.student.models.Student;
import ma.gstudents.student.repositories.IStudentRepositoriy;
import ma.gstudents.student.repositories.StudentRepositoryImpl;

import javax.swing.plaf.TreeUI;
import java.util.List;

public class IStudentServiceImpl implements IStudentService {
    IStudentRepositoriy r=new StudentRepositoryImpl();
    public boolean create(Student s) {
        System.out.println("SERVICE:CREATE:Student"+s);
        r.create(s) ;
        return true;
    }

    public boolean update(Student s) {
        System.out.println("SERVICE:UPDATE:Student"+s);
        r.update(s);
        return true;
    }

    public boolean delete(long id) {
        System.out.println("SERVICE:DELETE:Student"+id);
        r.delete(id) ;
        return true;
    }

    public List<Student> select() {
        return null;
    }
}
