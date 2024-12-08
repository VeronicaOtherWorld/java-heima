package Q4_replace;

public class FilterWord {
    private String word;
    private String[] badWords = {"kk", "ww", "moki"};
    public FilterWord() {
    }

    public void filterWord(String input) {
        for (int i = 0; i < badWords.length; i++) {
            input = input.replaceAll(badWords[i], "***");
        }
        word = input;
    }
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

}
