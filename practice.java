import java.util.HashMap;

public class practice {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("John", 1);
        map.put("Johnson", 2);
        map.put("Doe", 3);

        System.out.println(map.containsKey("Smith"));
        System.out.println(map.containsKey("John"));
        System.out.println(map);
    }
}