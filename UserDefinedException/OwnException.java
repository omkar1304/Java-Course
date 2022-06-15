package UserDefinedException;

public class OwnException extends Exception {  // we need to extend exception in order to make our own exception class.

    public OwnException(String s) {
        super(s); // to pass message in catch block
    }
}
