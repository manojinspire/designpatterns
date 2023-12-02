package Builder;

public class Main1 {

    public static void main(String[] args){
        Student student =Student.Builder.builder()
                .id(1)
                .name("manoj")
                .email("xyz@gmail.com")
                .build();

        System.out.println(student.getPhoneNo()) ;
    }
}
