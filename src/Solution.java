import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Use LinkedHashSet to maintain insertion order
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        // Print in one line
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}
