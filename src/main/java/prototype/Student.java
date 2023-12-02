package prototype;

public class Student implements Prototype<Student>{

    String name ;
    String sec ;
    int standard;
    int age ;

    public Student() {

    }



    public Student(Student oldStudent){
       this.sec = oldStudent.sec;
       this.standard = oldStudent.standard ;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Student clone() {

        Student s = new Student(this) ;

        return s;

    }
}
