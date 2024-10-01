import java.util.Scanner;

public class RegistrationForm1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user information
        System.out.println("Please fill out the following information:");
        System.out.print("First name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Last name: ");
        String lastName = scanner.nextLine();
        
        System.out.print("Email address: ");
        String email = scanner.nextLine();
        
        System.out.print("Password: ");
        String password = scanner.nextLine();
        
        // Get user's age
        int age = 0;
        while (age <= 0) {
            System.out.print("Age: ");
            age = scanner.nextInt();
            if (age <= 0) {
                System.out.println("Please enter a valid age.");
            }
        }
        
        // Get user's gender
        String[] genders = {"Male", "Female", "Other"};
        int genderSelection = 0;
        while (genderSelection < 1 || genderSelection > 3) {
            System.out.println("Gender:");
            for (int i = 0; i < genders.length; i++) {
                System.out.printf("%d. %s\n", i+1, genders[i]);
            }
            genderSelection = scanner.nextInt();
            if (genderSelection < 1 || genderSelection > 3) {
                System.out.println("Please select a valid option.");
            }
        }
        String gender = genders[genderSelection-1];
        
        // Print user information
        System.out.println("\nThank you for registering!");
        System.out.printf("Name: %s %s\n", firstName, lastName);
        System.out.printf("Email: %s\n", email);
        System.out.printf("Age: %d\n", age);
        System.out.printf("Gender: %s\n", gender);
    }
}
