package AdvanceOOPS;

public class finalizedExample{


    @Override
    public void finalize(){
        System.out.println("finalized method is getting called");
    }
    public static void main(String[] args){

        finalizedExample f1 = new finalizedExample();
        finalizedExample f2 = new finalizedExample() ;

        f1=null;
        f2=null;
        System.gc();


        System.out.println("after gc");
    }
}
