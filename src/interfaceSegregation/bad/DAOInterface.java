package interfaceSegregation.bad;

/**
 * This DAO interface is created in such a war that it can access the file system
 * as well as file system.
 *
 * this is bad because we have accumulated both the operation in single interface
 */

public interface DAOInterface {
    public void openConnection();
    public void createRecord();
    public void openFile();
    public void deleteRecord();
}
