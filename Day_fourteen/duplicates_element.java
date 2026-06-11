import java.util.Scanner;

public class duplicates_element {

    public static void dupliucates_element(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);

                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number =");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements is the array");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicates elements are ");

        dupliucates_element(arr, n);

    }

}
