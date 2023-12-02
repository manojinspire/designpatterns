package Builder;

public class Student{

    private int id ;
    private String name ;
    private String email ;
    private String phoneNo;

    private Student(int id, String name, String email, String phoneNo) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public  static class Builder{

        private int id ;
        private String name ;
        private String email ;
        private String phoneNo;

        public Builder(){

        }

        public static Builder builder(){
            return new Builder();
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder email(String email){
            this.email = email;
            return this;
        }
        public Builder id(int id){
            this.id = id;
            return this;
        }
        public Builder phoneNo(String phoneNo){
            this.phoneNo = phoneNo;
            return this;
        }

        public void verify(){

            if(id == 0){
                throw new RuntimeException("Id should be > 0") ;
            }
            if(name==null){
                throw new RuntimeException("name should not be null");
            }
            if(email == null){
                throw new RuntimeException("email should not be null");
            }
        }
        public Student build(){
            verify() ;
            return new Student(id,name ,email,phoneNo);
        }

    }
}
