public class Str {
    public static String text;

    public Str(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public static String getText() {
        return text;
    }

    public static void twoBlock() {
        String a = text.substring(0, 4);
        String b = text.substring(9, 13);
        System.out.println(String.join("-", a, b));
    }

    public static void change() {
        System.out.println(text.replaceAll("\\b[A-z]{3}", "***"));
    }

    public static void lower() {
        String a = text.replaceAll("\\d{4}[-]|\\d", "/");
        StringBuilder b = new StringBuilder(a);
        b.deleteCharAt(0).deleteCharAt(3).deleteCharAt(7);
        a = b.toString();
        System.out.println(a.toLowerCase());
    }

    public static void lower1() {
        StringBuilder a = new StringBuilder(text);
        a.replace(0, 5, ":").replace(4, 10, "/").replace(8, 10, "/").setCharAt(10, (char) 057);
        String b = a.toString();
        System.out.println("Letters" + b.toUpperCase());

    }

    public static void contain() throws ExceptionABC {
        if (text.contains("abc") || text.contains("ABC")) {
            System.out.println("текст содержит последовательность abc(ABC)");
        } else {
            throw new ExceptionABC("текст содержит последовательность abc(ABC)");
        }
    }

    public static void start() throws Exception555{
        if (text.startsWith("555")) {
            System.out.println("текст начинается с 555");
        } else {
            throw new Exception555("текст не начинается с 555");
        }
    }

    public static void end() throws Exception1a2b{
        if (text.endsWith("1a2b")) {
            System.out.println("текст заканчивается с 1a2b");
        } else {
            throw new Exception1a2b("текст не заканчивается с 1a2b");
        }
    }
}
