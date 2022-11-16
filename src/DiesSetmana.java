import java.util.Scanner;

public class DiesSetmana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user_choice;
        System.out.print("Enter a number from 1 - 7: ");
        user_choice = sc.nextInt(); sc.nextLine();
        System.out.println("Day of week corresponding to " + user_choice + " is: " + nomDiesSetmana(user_choice));
    }

    /**
     * Takes number and matches it with day of the week
     * If number not in the week error
     * @param n Day of week number
     * @return Day of week in words
     */
    static String nomDiesSetmana(int n) {
        return switch (n) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Error";
        };
    }
}
