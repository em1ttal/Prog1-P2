import java.util.Scanner;

public class Prim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user_entry = 1;
        while (user_entry <= 1) {
            System.out.print("Enter a number bigger than 1: ");
            user_entry = sc.nextInt();
        }
        if(esPrim(user_entry))
            System.out.println(user_entry + " is a prime number");
        else
            System.out.println(user_entry + " is not a prime number");
    }

    /**
     * Checks whether number is prime
     * @param n Number to check
     * @return prime or not
     */
    static boolean esPrim(int n) {
        boolean temp_prim = true;
        int counter = 2;
        /*
          While counter isn't bigger than number and still prime
          First(): 2
          Next(): Prime, counter++
          Last(): Not prime or counter = n
          Cerca: Number not prime,
         */
        while (temp_prim && counter < n) {
            if (n % counter == 0)
                temp_prim = false;
            counter++;
        }
        return temp_prim;
    }
}
