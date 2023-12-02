package Factory.DBS;

import Factory.AbstractFactory.AbstractFactory;

public interface Database {

    public void createConnection() ;

    public void initiateTransaction();

    public AbstractFactory AbstractFactoryClass();
}
