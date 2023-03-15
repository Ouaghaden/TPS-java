package ma.gstudents.student.controllers;

import ma.gstudents.student.models.Student;
import ma.gstudents.student.services.IStudentService;
import ma.gstudents.student.services.IStudentServiceImpl;

public class StudentController {
    IStudentService S=new IStudentServiceImpl();
   public boolean create(Student o){
   System.out.println("Controller:create:Student"+o);
   return S.create(o);
}
    public boolean update(Student o){
        System.out.println("Controller:update:Student"+o);
        return S.update(o);
}
    public boolean delete(long id){
        System.out.println("Controller:delete:Student"+id);
        return S.delete(id);
    }
}