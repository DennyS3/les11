public class Search {
    public void shortWord(String text){
        String splitText[] = text.trim().split(" ");
        String shortWord = splitText[0], longWord = splitText[0];
        for (String splitText1 : splitText) {
            if(shortWord.length() >= splitText1.length()){
                shortWord = splitText1;
            }
            if(longWord.length() <= splitText1.length()){
                longWord = splitText1;
            }
        }
        System.out.println("самое короткое слово " + shortWord);
        System.out.println("самое длинное слово " + longWord);
    }
}
