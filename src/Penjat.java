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

    static void initLListaDeParaules(String [] llistaParaules) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= llistaParaules.length; i++) {
            System.out.print("Word " + i + ": ");
            llistaParaules[i-1] = sc.nextLine();
        }
    }

    static String novaPartida(String [] llistaParaules) {
        int word_to_pick = (int) (Math.random() * TOTAL_WORDS);
        return llistaParaules[word_to_pick];
    }

    static void initLletrasEncertades(boolean [] lletresEncertades, String paraulaEsbrinar) {
        for (int i = 0; i < paraulaEsbrinar.length(); i++)
            lletresEncertades[i] = false;
    }

    static boolean lletraEncertada (String paraulaEsbrinar, int pos, char c, boolean [] lletresEncertades) {
        if (c == paraulaEsbrinar.charAt(pos)) {
            lletresEncertades[pos] = true;
            return true;
        }
        return false;
    }

    static String mostraParaula(String paraulaEsbrinar, boolean [] lletresEncertades) {
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < paraulaEsbrinar.length(); i++) {
            if (lletresEncertades[i])
                word.append(paraulaEsbrinar.charAt(i));
            else
                word.append("?");
        }
        return word.toString();
    }

    static boolean jocAcabat(boolean [] lletresEncertades) {
        for (boolean word : lletresEncertades) {
            if (!word)
                return false;
        }
        return true;
    }
}