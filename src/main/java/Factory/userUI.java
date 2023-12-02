package Factory;

import Factory.DBS.Database;
import Factory.DBS.MysqlDB;


public class userUI {


    public Database Database;
    public userUI(Enum value){



        if(DataBases.MYSQL==value){
            Database = new MysqlDB();
        }

    }


    public Database getDatabase(){
        return Database ;
    }



}
