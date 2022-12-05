import java.util.Arrays;
import java.util.Scanner;

public class Repetits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers: ");
        int len = sc.nextInt(); sc.nextLine();
        int[] nums = new int[len];
        System.out.print("Enter" + len + " numbers: ");
        for (int i = 0; i < len; i++)
            nums[i] = sc.nextInt();
        int[] reps = repes(nums, len);
    }

    static int[] repes(int[] nums, int n) {
        int[] repeats = new int[2 * n];
        for (int i = 0; i < n; i++) {
            
        }
        return repeats;
    }
}
