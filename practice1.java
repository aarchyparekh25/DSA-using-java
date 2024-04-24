import java.util.HashMap;

public class practice1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("John", 1);
        map.put("Johnson", 2);
        map.put("Doe", 3);

        for (String mykey : map.keySet()) {
            System.out.println(mykey);
        }
    }
}