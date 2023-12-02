package prototype;

import java.util.HashMap;

public class StudentRegistery {

    private HashMap<String , Student> studentHashMap = new HashMap<>() ;

    public void insert(String key , Student student){

        if(studentHashMap.containsKey(key)){
            throw new RuntimeException("Student prototype already present");
        }
        else{
            studentHashMap.put(key,student);
        }
    }


    public Student getStudentObject(String key){

        if(studentHashMap.containsKey(key)){
            return studentHashMap.get(key);
        }
        else{
            throw new RuntimeException("Student PROTOTYPE NOT FOUND");
        }
    }
}
