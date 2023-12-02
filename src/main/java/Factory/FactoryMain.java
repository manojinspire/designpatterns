package Factory;

import Factory.DBS.Database;

public class FactoryMain {

    public static void main(String[] args){

      userUI ui = new userUI(DataBases.MYSQL);
      String res = ui.getDatabase().AbstractFactoryClass().CreateQuery().run();

      System.out.println(res) ;
    }
}
