import java.util.*;
import java.util.HashMap;

public class reapeatwordshash {
    public static void main(String[] args) {
        String str = "the quick brown fox jumps over the lazy dog";
        String[] strArr = str.split("");
        HashMap<String, Integer> map = new HashMap<>();
        for (String curWord : strArr) {
            if (map.containsKey(curWord)) {
                int previousValue = map.get(curWord);
                map.put(curWord, previousValue + 1);

            } else {
                map.put(curWord, 1);
            }
        }
        int max = 0;
        String ans = "";
        for (String key : map.keySet()) {
            int freq = map.get(key);
            if (freq > max) {
                max = freq;
                ans = key;
            }

        }
        System.out.println("The repeated words is" + ans);
    }

}
