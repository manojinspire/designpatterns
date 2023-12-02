package Factory.Utils;

public class MysqlQuery implements Query{
    @Override
    public String run() {
        return "running Mysql Query";
    }
}
