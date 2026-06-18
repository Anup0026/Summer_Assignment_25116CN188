import java.util.ArrayList;
import java.util.Scanner;

public class merge_array {

    public static void merge_array(ArrayList<Integer> first, ArrayList<Integer> Second, int n, int in) {

        System.out.println("Merge Array :");

        first.addAll(n, Second);

        for (int i = 0; i < first.size(); i++) {

            System.out.println(first.get(i));
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of elements  :");
        int n = sc.nextInt();

        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> Second = new ArrayList<>();

        System.out.println("Enter the element in the first array :");
        for (int i = 0; i < n; i++) {
            first.add(sc.nextInt());

        }

        System.out.println("Enter total number of element in the Second Array:");
        int in = sc.nextInt();
        System.out.println("Enter the element in the Second array :");
        for (int j = 0; j < in; j++) {
            Second.add(sc.nextInt());

        }

        merge_array(first, Second, n, in);

    }

}
