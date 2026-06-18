import java.util.ArrayList;
import java.util.Scanner;

public class Intersection_element_in_both {

    public static void Intersection_element_in_both_array(ArrayList<Integer> first, ArrayList<Integer> Second, int n,
            int in) {

        System.out.println("Intersection_element_in_both_array :");

        first.addAll(n, Second);

        ArrayList<Integer> printed = new ArrayList<>();

        for (int i = 0; i < first.size(); i++) {
            for (int j = i + 1; j < first.size(); j++) {

                if (first.get(i).equals(first.get(j))
                        && !printed.contains(first.get(i))) {

                    System.out.println(first.get(i));
                    printed.add(first.get(i));
                    break;
                }
            }
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

        Intersection_element_in_both_array(first, Second, n, in);

    }

}
