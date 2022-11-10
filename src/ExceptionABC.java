public class ExceptionABC extends Exception{
    public ExceptionABC(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Исключение ExceptionABC "
                + getMessage()
                + " программа продолжила работу";
    }
}
