package prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main2 {

    public static  void  main(String[] args){

        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.sec = "a";
        intelligentStudent.standard = 9 ;
        intelligentStudent.name="manoj" ;

        IntelligentStudent copy = intelligentStudent.clone();

        System.out.println(copy.toString());


        // registery checker


        Student s1 = new Student();
        s1.sec="a";
        s1.standard=4 ;

        Student s2 = new Student();
        s2.sec = "b";
        s2.standard=5 ;

        StudentRegistery sr = new StudentRegistery();
        sr.insert("s1" , s1);
        sr.insert("s2", s2);

        Student s1copy = sr.getStudentObject("s1").clone();
        System.out.println(s1copy.sec+ " "+s1copy.standard) ;




    }
}
