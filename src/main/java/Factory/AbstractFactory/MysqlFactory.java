package Factory.AbstractFactory;

import Factory.Utils.MysqlQuery;
import Factory.Utils.Query;

public class MysqlFactory implements AbstractFactory{


    @Override
    public Query CreateQuery() {
        return new MysqlQuery();
    }
}
