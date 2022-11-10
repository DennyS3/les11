public class Exception555 extends Exception{
    public Exception555(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Исключение Exception555 "
                + getMessage()
                +" программа продолжила работу";
    }
}
