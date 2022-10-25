import java.util.*;

public class Conjunts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, array_element = -1;
        System.out.print("Size of set: ");
        size = sc.nextInt();
        int[] set1 = new int[size];
        int[] set2 = new int[size];

        System.out.println("Enter numbers for set 1 (End with 0): ");
        /*
          Element introduced is not 0 or array not filled
          First(): First element
          Next(): Next element introduced
          Last(): 0 introduced or array filled
          Cerca: 0 introduced
         */
        for(int i = 0; i < size && array_element != 0; i++) {
            array_element = sc.nextInt();
            set1[i] = array_element;
        }
        array_element = -1;
        System.out.println("Enter numbers for set 2 (End with 0): ");
        /*
          Element introduced is not 0 or array not filled
          First(): First element
          Next(): Next element introduced
          Last(): 0 introduced or array filled
          Cerca: 0 introduced
         */
        for(int i = 0; i < size && array_element != 0; i++) {
            array_element = sc.nextInt();
            set2[i] = array_element;
        }

        if(conjuntsIguals(set1, set2, size))
            System.out.println("Sets are the same");
        else
            System.out.println("Sets are not the same");
    }

    /**
     * Checks if two sets have the same elements
     * @param a Set 1
     * @param b Set 2
     * @param n Size of set
     * @return Sets equal or not
     */
    static boolean conjuntsIguals(int[] a, int[] b, int n) {
        boolean same = true;
        int counter = 0;
        /*
          Checks arrays are same
          First(): First element of sets
          Next(): Next element of sets
          Last(): Last element or elements different
          Cerca: Elements not the same
         */
        while (same && counter < n) {
            if(a[counter] != b[counter])
                same = false;
            counter++;
        }
        return same;
    }
}
