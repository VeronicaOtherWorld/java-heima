package Q4_replace;

public class FilterWordApp {
    public static void main(String[] args) {
        FilterWord fw = new FilterWord();
        String word = "kk, moki is here";
        fw.filterWord(word);
        fw.getWord();
        System.out.println(fw.getWord());
    }
}
