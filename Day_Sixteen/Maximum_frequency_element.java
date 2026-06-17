import java.util.Scanner;

public class Maximum_frequency_element {

    public static void maximum_frequency(int[] arr, int n) {

        int max_element = arr[0];
        int maximum_freq = 0;

        for (int i = 0; i < n; i++) {

            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maximum_freq) {

                maximum_freq = count;
                max_element = arr[i];
            }

        }

        System.out.println("Maximum  element is: " + max_element);
        System.out.println("Maximum frequency is = : " + maximum_freq);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }

        maximum_frequency(arr, n);
    }

}
