import java.util.Scanner;

public class Ticket_booking_System {

    public static void Ticket_Process(int n, int[] Ticket_ID, String[] Passenger_name, String[] Source,
            String[] destination, int[] Ticket_Price, String[] Booking_Status) {

        System.out.println("============ Passenger Booking Details ============");

        System.out.println("-------------------------------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.println("============= Tickets Menu Icon ===============");

        System.out.println("1.Ticket booking is successful or not ");
        System.out.println("2. View Your ticket ");
        System.out.println("3.Search your ticket status ");
        System.out.println("4.for your Ticket cancellation ");
        System.out.println("5.EXIT for this Application ");
        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Your ticket has been booked Successfully");
                break;

            case 2:
                System.out.println("=============== View Ticket =============");

                for (int i = 0; i < n; i++) {

                    System.out.println("Ticket_ID : " + Ticket_ID[i]);
                    System.out.println("Passenger_name : " + Passenger_name[i]);
                    System.out.println("Source : " + Source[i]);
                    System.out.println("destination : " + destination[i]);
                    System.out.println("Ticket_Price : " + Ticket_Price[i]);
                    System.out.println("Booking Status : " + Booking_Status[i]);
                    break;

                }

            case 3:
                System.out.println("=============== Search Ticket Status Status =============");

                System.out.println("Enter the Id of the ticket :");
                int id = sc.nextInt();

                for (int i = 0; i < n; i++) {
                    if (Ticket_ID[i] == id) {

                        System.out.println("Ticket_ID : " + Ticket_ID[i]);
                        System.out.println("Passenger_name : " + Passenger_name[i]);
                        System.out.println("Source : " + Source[i]);
                        System.out.println("destination : " + destination[i]);
                        System.out.println("Ticket_Price : " + Ticket_Price[i]);
                        System.out.println("Booking Status : " + Booking_Status[i]);
                        break;

                    } else {

                        System.out.println("Invalid Id");
                    }
                }

            case 4:
                System.out.println("Your Ticket has been cancel successfully");
                break;

            case 5:
                System.out.println("Exit");
                break;

            default:
                System.out.println("Invalid choice by the user ");
                System.out.println("EXIT");

                System.out.println("================= Thank You ===============");

                System.out.println("----------------------------------------------");

                System.out.println();

        }
    }

    public static void main(String[] args) {

        System.out.println("================= Enter Details =================");

        System.out.println("-------------------------------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of the Passenger :");
        int n = sc.nextInt();

        int[] Ticket_ID = new int[n];

        String[] Passenger_name = new String[n];

        String[] Source = new String[n];

        String[] destination = new String[n];
        int[] Ticket_Price = new int[n];
        String[] Booking_Status = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.println((i + 1) + ". Passenger");

            System.out.println("Enter the Ticket_ID :");
            Ticket_ID[i] = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the passenger name :");
            Passenger_name[i] = sc.nextLine();

            System.out.println("Passenger is known this booking plateform from which source : ");
            Source[i] = sc.nextLine();

            System.out.println("Enter the destination : ");
            destination[i] = sc.nextLine();

            System.out.println("Enter the Ticket price : ");
            Ticket_Price[i] = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the Booking Status : ");
            Booking_Status[i] = sc.nextLine();

            System.out.println("====== Details Successfully compleleted of " + (i + 1) + " Passenger =========");

            System.out.println("-------------------------------------------------");

            System.out.println();

        }

        Ticket_Process(n, Ticket_ID, Passenger_name, Source,
                destination, Ticket_Price, Booking_Status);

    }

}
