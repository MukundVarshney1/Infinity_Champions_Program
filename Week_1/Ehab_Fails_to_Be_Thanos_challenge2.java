package Week_1;
import java.util.*;

public class Ehab_Fails_to_Be_Thanos_challenge2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n * 2];

        for (int i = 0; i < n * 2; i++) {
            a[i] = in.nextInt();
        }

        // Check if all elements are equal
        boolean f = true;
        for (int i = 1; i < n * 2; i++) {
            if (a[i] != a[0]) {
                f = false;
                break;
            }
        }

        if (f) {
            System.out.println(-1);
            return;
        }

        // Sort and print
        Arrays.sort(a);
        for (int i = 0; i < n * 2; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
