import java.util.Scanner;

public class Contact_management_System {

    public static void addContact(String mobile) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Add new Contact in the mobile number");

        System.out.println("Mobile Number : ");
        mobile = sc.nextLine();

        if (mobile.matches("\\d{10}")) {

            System.out.println("Valid Mobile Number");

        } else {

            System.out.println("Invalid Mobile Number");
        }

        System.out.println("Added Mobile Number is : " + mobile);

    }

    public static void add_new_email(String email) {

        System.out.println("Add new email id for the long time to save in the contact ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the new added email ID : ");

        email = sc.nextLine();

        if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {

            System.out.println("Valid emailId");

        } else {

            System.out.println("Invalid emailID");
        }

        System.out.print("Added Email_Id is : " + email);
        System.out.println();

    }

    public static void delete_contact(String mobile) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number which will become delete");
        String delete_mobile_number = sc.nextLine();

        if (mobile.matches("\\d{10}")) {

            System.out.println("Valid Mobile Number");

        } else {

            System.out.println("Invalid Mobile Number");
        }

        if (mobile == delete_mobile_number) {

            System.out.println("Mobile number has been successfully got deleted ");
        } else {

            System.out.println("Any mobie number has not been be the deleted till now ");
        }

        System.out.print("Deleted Mobile Number is : " + delete_mobile_number);
        System.out.println();
    }

    public static void Mobile_Number_Contact_Details(String mobile, String email, String name, int id) {

        System.out.println("===================== Details ==============");

        System.out.println("-------------------------------------");

        System.out.println("Mobile_Number : " + mobile);
        System.out.println("Email : " + email);
        System.out.println("Name : " + name);
        System.out.println("Student_ID : " + id);

        addContact(mobile);
        add_new_email(email);

        delete_contact(mobile);

        System.out.println("-------------------------------------");

    }

    public static void main(String[] args) {

        System.out.println("=================== Enter Details ============");

        Scanner sc = new Scanner(System.in);

        System.out.print("Mobile Number : ");
        String mobile = sc.nextLine();

        if (mobile.matches("\\d{10}")) {

            System.out.println("Valid Mobile Number");

        } else {

            System.out.println("Invalid Mobile Number");
        }

        System.out.print("emailId : ");
        String email = sc.nextLine();

        if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {

            System.out.println("Valid emailId");

        } else {

            System.out.println("Invalid emailID");
        }

        System.out.print("Name : ");
        String name = sc.nextLine();

        if (name.matches("[A-Za-z ]+")) {
            System.out.println("Valid name");

        } else {

            System.out.println("Invalid name");

        }

        System.out.print("Student Id : ");
        int id = sc.nextInt();

        Mobile_Number_Contact_Details(mobile, email, name, id);

    }

}