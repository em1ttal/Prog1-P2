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
            System.out.println("Unlucky, try again");
    }

    /**
     * Throws dice and saves numbers in array
     * @param daus Array of throws
     */
    static void tiraDados(int[] daus) {
        /*
          Generates each dice throw
          First(): Dice number 1
          Next(): Dice number++
          Last(): Last die
          Recorregut
         */
        for (int i = 0; i < daus.length; i++)
            daus[i] = (int) (Math.random() * 6) + 1;
    }

    /**
     * Checks whether conditions for yahtzee are met
     * @param daus Array of throws
     * @return Yahtzee?
     */
    static boolean esYahtzee(int[] daus) {
        boolean yahtzee = true;
        /*
          Checks whether all dice are the same
          First(): Dice number 1
          Next(): Dice number++
          Last(): Last die or first with different number
          Cerca: Throw of different number
         */
        for (int i = 0; (i < daus.length - 1) && yahtzee; i++) {
            if (daus[i] != daus[i + 1])
                yahtzee = false;
        }
        return yahtzee;
    }
}
