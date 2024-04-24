import java.util.*;

public class repeatwords {
    public static void main(String[] args) {
        String str = "the quick brown fox jumped over the lazy dog";
        String[] strArray = str.split(" ");

        int max = 0;
        String ans = "";
        for (String word : strArray) {
            int count = 0;
            for (String curWord : strArray) {
                if (curWord.equals(word))
                    count++;
            }
            if (count > max) {
                max = count;
                ans = word;
            }
        }
        System.out.println("Word mostly used: " + ans);
    }
}
