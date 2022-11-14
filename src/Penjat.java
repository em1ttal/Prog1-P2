import java.util.*;

public class Penjat {
    static final int TOTAL_WORDS = 10;
    static final int PENJAT = 6;
    public static void main(String[] args) {
        String [] llistaParaules = new String[TOTAL_WORDS];
        System.out.println("Possible words");
        initLListaDeParaules(llistaParaules);
        System.out.println();

        String paraulaEndevinar = novaPartida(llistaParaules);

        boolean [] lletresEncertades = new boolean[paraulaEndevinar.length()];
        initLletrasEncertades(lletresEncertades, paraulaEndevinar);

        int tries = 0;
        int position = 0;
        Scanner sc = new Scanner(System.in);

        /*
          While all letters not guessed
          First(): First letter
          Next(): Next letter, or first again
          Last(): Last letter, or surpassed attempts allowed
          Cerca: All letters guessed, too many attempts
         */
        while (!jocAcabat(lletresEncertades) && tries < PENJAT) {
            System.out.println("Word to guess: " + mostraParaula(paraulaEndevinar, lletresEncertades));
            System.out.print("Guess letter at position " + position + ": ");
            char guess = sc.next().charAt(0);
            if (lletraEncertada(paraulaEndevinar, position, Character.toUpperCase(guess), lletresEncertades))
                position++;
            else
                tries++;
        }
        if (jocAcabat(lletresEncertades))
            System.out.println("Well done!");
        else
            System.out.println("Better luck next time");
    }

    /**
     * Initialize list of possible words
     * @param llistaParaules Array with possible words
     */
    static void initLListaDeParaules(String [] llistaParaules) {
        Scanner sc = new Scanner(System.in);
        /*
          Ask user to add words
          First(): First word
          Next(): Word number++
          Last(): Last word
          Recorregut
         */
        for (int i = 1; i <= llistaParaules.length; i++) {
            System.out.print("Word " + i + ": ");
            llistaParaules[i-1] = sc.nextLine();
        }
    }

    /**
     * Starts new game
     * @param llistaParaules List of possible words
     * @return Word to play with
     */
    static String novaPartida(String [] llistaParaules) {
        int word_to_pick = (int) (Math.random() * TOTAL_WORDS);
        return llistaParaules[word_to_pick];
    }

    /**
     * Set boolean array of letters guessed to false
     * @param lletresEncertades Array of whether letter has been guessed
     * @param paraulaEsbrinar Word to guess
     */
    static void initLletrasEncertades(boolean [] lletresEncertades, String paraulaEsbrinar) {
        /*
          Set array to all false
          First(): First letter
          Next(): Letter number++
          Last(): Last letter
          Recorregut
         */
        for (int i = 0; i < paraulaEsbrinar.length(); i++)
            lletresEncertades[i] = false;
    }

    /**
     * Check whether letter in that position has been guessed
     * @param paraulaEsbrinar Word to guess
     * @param pos Position being guessed
     * @param c Letter that has been guessed
     * @param lletresEncertades Array of whether letters have been guessed
     * @return Letter guessed?
     */
    static boolean lletraEncertada (String paraulaEsbrinar, int pos, char c, boolean [] lletresEncertades) {
        if (c == paraulaEsbrinar.charAt(pos)) {
            lletresEncertades[pos] = true;
            return true;
        }
        return false;
    }

    /**
     * Show word. Letter if guessed, "?" if not guessed
     * @param paraulaEsbrinar Word to guess
     * @param lletresEncertades Array of whether letters have been guessed
     * @return Word as mix of letters and "?"
     */
    static String mostraParaula(String paraulaEsbrinar, boolean [] lletresEncertades) {
        StringBuilder word = new StringBuilder();
        /*
          Build word as letter of "?"
          First(): First letter
          Next(): Letter number++
          Last(): Last letter
          Recorregut
         */
        for (int i = 0; i < paraulaEsbrinar.length(); i++) {
            if (lletresEncertades[i])
                word.append(paraulaEsbrinar.charAt(i));
            else
                word.append("?");
        }
        return word.toString();
    }

    /**
     * Game over or not
     * @param lletresEncertades Array of whether letters have been guessed
     * @return All letters guessed?
     */
    static boolean jocAcabat(boolean [] lletresEncertades) {
        /*
          Checks whether all letters guessed
          First(): First letter
          Next(): Letter number++
          Last(): Last letter, first not guessed letter
          Cerca: First letter not guessed, end of word
         */
        for (boolean word : lletresEncertades) {
            if (!word)
                return false;
        }
        return true;
    }
}