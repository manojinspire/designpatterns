package Factory.DBS;

import Factory.AbstractFactory.AbstractFactory;

public class PostgreSqlDB implements Database{


    @Override
    public void createConnection() {

    }

    @Override
    public void initiateTransaction() {

    }

    @Override
    public AbstractFactory AbstractFactoryClass() {
        return null;
    }
}
