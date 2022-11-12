import java.util.Arrays;

/**
 * Not to turn in
 */
public class YahtzeeImproved {
    public static void main(String[] args) {
        int dice_throws = 5;
        int tries = 1;
        int[] all_throws = new int[dice_throws];
        boolean repeat = true;
        while (repeat) {
            tiraDados(all_throws);
            System.out.println("Try " + tries++ + ": "  + Arrays.toString(all_throws));
            if(esYahtzee(all_throws)) {
                System.out.println("Yahtzee!");
                repeat = false;
            } else {
                System.out.println("Unlucky, try again");
            }
        }
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
