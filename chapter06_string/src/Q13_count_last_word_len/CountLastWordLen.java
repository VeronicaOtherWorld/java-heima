package Q13_count_last_word_len;


/*
* give you a sentence, has some space between the words
* return the len of the last word in it
* 15/12/2024
* */
public class CountLastWordLen {
    public static void main(String[] args) {
        String str = "di di da is a song";
        int len = str.length() - 1 ;
        int count = 0;
        for (int i = len; i >= 0; i--) {
            System.out.println(str.charAt(i));
            if (str.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
