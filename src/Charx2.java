public class Charx2 {
    public void charx2(String text) {
        String textCharx2 = "";
        for (int i = 0; i < text.length(); i++) {
                textCharx2 += text.charAt(i);
                textCharx2 += text.charAt(i);
        }
        System.out.println(textCharx2);

    }
}
