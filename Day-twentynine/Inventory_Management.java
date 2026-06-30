import java.util.Scanner;

public class Inventory_Management {

    static Scanner sc = new Scanner(System.in);

    static int[] itemId;
    static String[] itemName;
    static int[] quantity;
    static double[] price;
    static int count = 0;

    public static void addItem() {
        if (count == itemId.length) {
            System.out.println("Inventory is Full!");
            return;
        }

        System.out.print("Enter Item ID: ");
        itemId[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the Item Name: ");
        itemName[count] = sc.nextLine();

        System.out.print("Enter Quantity: ");
        quantity[count] = sc.nextInt();

        System.out.print("Enter Price of it : ");
        price[count] = sc.nextDouble();

        count++;
        System.out.println("Item Added Successfully !");
    }

    public static void viewItems() {
        if (count == 0) {
            System.out.println("No Items Available.");
            return;
        }

        System.out.println("\nID\tName\tQuantity\tPrice");
        System.out.println("------------------------------------------");

        for (int i = 0; i < count; i++) {
            System.out.println(itemId[i] + "\t" + itemName[i] + "\t" + quantity[i] + "\t\t" + price[i]);
        }
    }

    public static void searchItem() {
        System.out.print("Enter Item ID to Search: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (itemId[i] == id) {
                System.out.println("Item Found");
                System.out.println("ID : " + itemId[i]);
                System.out.println("Name : " + itemName[i]);
                System.out.println("Quantity : " + quantity[i]);
                System.out.println("Price : " + price[i]);
                return;
            }
        }

        System.out.println("Item Not Found!");
    }

    public static void updateItem() {
        System.out.print("Enter Item ID to Update: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (itemId[i] == id) {

                sc.nextLine();

                System.out.print("Enter New Item Name: ");
                itemName[i] = sc.nextLine();

                System.out.print("Enter New Quantity: ");
                quantity[i] = sc.nextInt();

                System.out.print("Enter New Price: ");
                price[i] = sc.nextDouble();

                System.out.println("Item Updated Successfully!");
                return;
            }
        }

        System.out.println("Item Not Found!");

        System.out.println();
    }

    public static void deleteItem() {
        System.out.print("Enter Item ID to Delete: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (itemId[i] == id) {

                for (int j = i; j < count - 1; j++) {
                    itemId[j] = itemId[j + 1];
                    itemName[j] = itemName[j + 1];
                    quantity[j] = quantity[j + 1];
                    price[j] = price[j + 1];
                }

                count--;
                System.out.println("Item Deleted Successfully!");
                return;
            }
        }

        System.out.println("Item Not Found!");
    }

    public static void main(String[] args) {

        System.out.print("Enter Maximum Number of Items: ");
        int n = sc.nextInt();

        itemId = new int[n];
        itemName = new String[n];
        quantity = new int[n];
        price = new double[n];

        int choice;

        do {

            System.out.println("\n===== Inventory Management System =====");
            System.out.println("1. Add Item");
            System.out.println("2. View All Items");
            System.out.println("3. Search Item");
            System.out.println("4. Update Item");
            System.out.println("5. Delete Item");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addItem();
                    break;

                case 2:
                    viewItems();
                    break;

                case 3:
                    searchItem();
                    break;

                case 4:
                    updateItem();
                    break;

                case 5:
                    deleteItem();
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
