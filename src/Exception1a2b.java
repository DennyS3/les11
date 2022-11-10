public class Exception1a2b extends Exception{
    public Exception1a2b(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Исключение Exception1a2b"
                + getMessage()
                +" программа продолжилда работу";
    }
}
