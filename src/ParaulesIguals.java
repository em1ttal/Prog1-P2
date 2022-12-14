import java.util.Scanner;

public class ParaulesIguals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first_word, second_word;
        System.out.print("Enter your first word: ");
        first_word = sc.nextLine();
        System.out.print("Enter your second word: ");
        second_word = sc.nextLine();
        if(paraulesIguals(first_word, second_word))
            System.out.println("The words are the same");
        else
            System.out.println("The words are not the same");
    }

    /**
     * Checks if two words are the same
     * Case matters
     * @param paraula1 first word
     * @param paraula2 second word
     * @return words same or not
     */
    static boolean paraulesIguals(String paraula1, String paraula2) {
        return paraula2.equals(paraula1);
    }
}