package ma.gstudents.student.controllers;

import ma.gstudents.student.models.Student;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String n;
        int age;
        StudentController controller=new StudentController();

        Scanner sc=new Scanner(System.in);
        System.out.println(" entrer le nom");
        n =sc.nextLine();
        System.out.println("entrer l'age");
        age = sc.nextInt();

        Student s=new Student(1,n,age);
        System.out.println(s);

    }
}
