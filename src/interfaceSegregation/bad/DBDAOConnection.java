package interfaceSegregation.bad;

public class DBDAOConnection implements DAOInterface{
    @Override
    public void openConnection() {

    }

    @Override
    public void createRecord() {

    }

    @Override
    public void openFile() {
        throw new UnsupportedOperationException("Open a File is not supported");

    }

    @Override
    public void deleteRecord() {

    }
}
