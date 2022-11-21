import java.util.Arrays;
import java.util.Scanner;

public class Repetits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int len = sc.nextInt(); sc.nextLine();
        int[] nums = new int[len];
        System.out.print("Enter numbers: ");
        for (int i = 0; i < len; i++)
            nums[i] = sc.nextInt();
        int[] reps = repes(nums, len);
    }

    static int[] repes(int[] nums, int n) {
        int[] repeats = new int[2 * n];
        int[] aux = {};
        Arrays.fill(repeats, Integer.MIN_VALUE);
        Arrays.fill(aux, Integer.MIN_VALUE);

        return repeats;
    }
}
