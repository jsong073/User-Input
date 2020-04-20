import java.util.Scanner;

public class UserInput {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstInitial= "";
        String lastName = "";
        int houseNumber = 0;
        String streetName = "";
        String streetType = "";
        String city = "";

        System.out.println("Enter the first initial: ");
        firstInitial = sc.nextLine();
        System.out.println("Enter the last name: ");
        lastName = sc.nextLine();
        System.out.println("Enter the house number: ");
        houseNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the street name: ");
        streetName = sc.nextLine();
        System.out.println("Enter the street type: ");
        streetType = sc.nextLine();
        System.out.println(("Enter the city name: "));
        city = sc.nextLine();

        System.out.println(firstInitial + " " + lastName + " " + houseNumber+ " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
