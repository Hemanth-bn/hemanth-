import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> students = new HashMap<>();
        
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume the newline

            if (choice == 1) {
                System.out.print("Enter student name: ");
                String name = sc.nextLine();
                System.out.print("Enter student roll number: ");
                String rollNo = sc.nextLine();
                students.put(rollNo, name);
                System.out.println("Student added successfully!");
            } else if (choice == 2) {
                System.out.println("Students List:");
                for (Map.Entry<String, String> entry : students.entrySet()) {
                    System.out.println("Roll No: " + entry.getKey() + " | Name: " + entry.getValue());
                }
            } else if (choice == 3) {
                break;
            }
        }
    }
}
