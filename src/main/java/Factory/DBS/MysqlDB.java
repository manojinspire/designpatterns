package Factory.DBS;

import Factory.AbstractFactory.AbstractFactory;
import Factory.AbstractFactory.MysqlFactory;

public class MysqlDB implements Database{
    @Override
    public void createConnection() {

    }

    @Override
    public void initiateTransaction() {

    }

    @Override
    public AbstractFactory AbstractFactoryClass() {
        return new MysqlFactory() ;
    }
}
