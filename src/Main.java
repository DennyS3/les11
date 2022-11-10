public class Main {
    public static void main(String[] args) {
        Str str = new Str("1234-Yyy-1548-yYy-1y1y");
        str.getText();
        str.twoBlock();
        str.change();
        str.lower();
        str.lower1();
        try {
            str.contain();
        } catch (ExceptionABC abc) {
            System.out.println(abc);
        }
        try {
            str.start();
        } catch (Exception555 ex555) {
            System.out.println(ex555);
        }
        try {
            str.end();
        } catch (Exception1a2b ex1a2b){
            System.out.println(ex1a2b);
        }


        Search sr = new Search();
        sr.shortWord("Hello word im denny");
        Charx2 cr = new Charx2();
        cr.charx2("Hello my mentor");
    }
}
