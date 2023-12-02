package prototype;

public class IntelligentStudent extends  Student{

    private int iq ;

  public IntelligentStudent(){

  }
    public IntelligentStudent(IntelligentStudent oldIntelligent){
        super(oldIntelligent) ;
        this.iq = oldIntelligent.iq ;

    }
    public IntelligentStudent clone(){
        IntelligentStudent is = new IntelligentStudent(this) ;
        return is;
    }

    @Override
    public String toString() {
        return "IntelligentStudent{" +
                "iq=" + iq +
                ", name='" + name + '\'' +
                ", sec='" + sec + '\'' +
                ", standard=" + standard +
                ", age=" + age +
                '}';
    }
}
