import java.util.Arrays;

public class Yahtzee {
    public static void main(String[] args) {
        int dice_throws = 5;
        int[] all_throws = new int[dice_throws];
        tiraDados(all_throws);
        System.out.println(Arrays.toString(all_throws));
        if(esYahtzee(all_throws))
            System.out.println("Yahtzee!");
        else
            System.out.println("Unlucky, Try Again.");
    }

    static void tiraDados(int[] daus) {
        for (int i = 0; i < daus.length; i++)
            daus[i] = (int) (Math.random() * 6) + 1;
    }

    static boolean esYahtzee(int[] daus) {
        boolean yahtzee = true;
        for (int i = 0; (i < daus.length - 1) && yahtzee; i++) {
            if (daus[i] != daus[i + 1])
                yahtzee = false;
        }
        return yahtzee;
    }
}
