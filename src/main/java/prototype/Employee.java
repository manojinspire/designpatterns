package prototype;

public class Employee implements Prototype<Employee>{

    private String name ;


    private int age;
    private String company ;
    private double salary ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public Employee clone() {
        Employee e = new Employee() ;
        e.salary = 5000 ;
        e.company = "Adva" ;
        return e;
    }
}
