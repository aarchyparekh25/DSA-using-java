import java.util.ArrayDeque;
import java.util.Queue;
import java.util.*;

public class queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> q = new ArrayDeque<>();
        System.out.println("How many Students:");
        int noOfStudent = sc.nextInt();
        for (int i = 1; i <= noOfStudent; i++) {
            String name = sc.next();
            q.add(name);
        }
        System.out.println("How many seats:");
        int noOfSeats = sc.nextInt();
        for (int i = 1; i <= noOfSeats; i++) {
            String name = q.remove();
            System.out.println(name + " got the seat");
        }
    }

}
