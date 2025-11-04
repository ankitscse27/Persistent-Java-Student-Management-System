// StudentManagementSystem.java
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {

    private List<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        sms.runMenu();
    }

    public void runMenu() {
        boolean running = true;
        while (running) {
            displayMenu();
            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                switch (choice) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        viewAllStudents();
                        break;
                    case 3:
                        searchStudent();
                        break;
                    case 4:
                        updateStudentCourse();
                        break;
                    case 5:
                        deleteStudent();
                        break;
                    case 6:
                        running = false;
                        System.out.println("Exiting Student Management System. Goodbye!");
                        break;
                    default:
                        System.out.println("❌ Invalid choice. Please select a number from 1 to 6.");
                }
            } catch (InputMismatchException e) {
                System.out.println("⚠️ Invalid input. Please enter a number for the menu option.");
                scanner.nextLine(); // Clear the invalid input
            }
        }
        scanner.close();
    }

    private void displayMenu() {
        System.out.println("\n--- 📚 Student Management System ---");
        System.out.println("1. Add New Student");
        System.out.println("2. View All Students");
        System.out.println("3. Search Student by ID");
        System.out.println("4. Update Student Course");
        System.out.println("5. Delete Student by ID");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    private void addStudent() {
        try {
            System.out.print("Enter Student ID (number): ");
            int id = scanner.nextInt();
            scanner.nextLine();
            
            // Simple check for duplicate ID
            if (getStudentById(id) != null) {
                System.out.println("🛑 Student with ID " + id + " already exists.");
                return;
            }

            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Student Course: ");
            String course = scanner.nextLine();

            Student newStudent = new Student(id, name, course);
            students.add(newStudent);
            System.out.println("✅ Student added successfully: " + newStudent);
        } catch (InputMismatchException e) {
            System.out.println("⚠️ Invalid input for ID. Please enter a number.");
            scanner.nextLine(); // Clear the invalid input
        }
    }

    private void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found in the system.");
            return;
        }
        System.out.println("\n--- All Students ---");
        // Using Java 8 Stream for better output formatting
        System.out.printf("%-5s | %-20s | %s%n", "ID", "Name", "Course");
        System.out.println("------------------------------------");
        students.forEach(student -> 
            System.out.printf("%-5d | %-20s | %s%n", student.getId(), student.getName(), student.getCourse())
        );
    }

    private Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    private void searchStudent() {
        try {
            System.out.print("Enter Student ID to search: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            Student student = getStudentById(id);
            if (student != null) {
                System.out.println("Student Found: " + student);
            } else {
                System.out.println("Student with ID " + id + " not found.");
            }
        } catch (InputMismatchException e) {
            System.out.println("⚠️ Invalid input for ID. Please enter a number.");
            scanner.nextLine();
        }
    }

    private void updateStudentCourse() {
        try {
            System.out.print("Enter Student ID to update course: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            Student student = getStudentById(id);
            if (student != null) {
                System.out.println("Current Course for " + student.getName() + ": " + student.getCourse());
                System.out.print("Enter New Course: ");
                String newCourse = scanner.nextLine();
                student.setCourse(newCourse);
                System.out.println("✅ Course updated successfully for ID " + id + ": " + student.getCourse());
            } else {
                System.out.println("Student with ID " + id + " not found.");
            }
        } catch (InputMismatchException e) {
            System.out.println("⚠️ Invalid input for ID. Please enter a number.");
            scanner.nextLine();
        }
    }

    private void deleteStudent() {
        try {
            System.out.print("Enter Student ID to delete: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            
            // Remove the student if the condition is met (student ID matches)
            boolean removed = students.removeIf(student -> student.getId() == id);

            if (removed) {
                System.out.println("🗑️ Student with ID " + id + " has been deleted.");
            } else {
                System.out.println("Student with ID " + id + " not found.");
            }
        } catch (InputMismatchException e) {
            System.out.println("⚠️ Invalid input for ID. Please enter a number.");
            scanner.nextLine();
        }
    }
}