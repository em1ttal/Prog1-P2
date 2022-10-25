import java.util.Scanner;

public class DiesSetmana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user_choice;
        System.out.print("Enter a number from 1 - 7: ");
        user_choice = sc.nextInt(); sc.nextLine();
        if(user_choice < 1 || user_choice > 7)
            System.out.println("Error");
        else
            System.out.println("Day of week corresponding to " + user_choice + " is: " + nomDiesSetmana(user_choice));
    }

    static String nomDiesSetmana(int n) {
        String day_of_week = "";
        switch (n) {
            case 1:
                day_of_week = "Monday";
                break;
            case 2:
                day_of_week = "Tuesday";
                break;
            case 3:
                day_of_week = "Wednesday";
                break;
            case 4:
                day_of_week = "Thursday";
                break;
            case 5:
                day_of_week = "Friday";
                break;
            case 6:
                day_of_week = "Saturday";
                break;
            case 7:
                day_of_week = "Sunday";
                break;
        }
        return day_of_week;
    }
}
