package interfaceSegregation.bad;

public class FileDAOConnnection implements DAOInterface{
    @Override
    public void openConnection() {
        throw new UnsupportedOperationException("Open connection not supported");
    }

    @Override
    public void createRecord() {

    }

    @Override
    public void openFile() {

    }

    @Override
    public void deleteRecord() {

    }
}
