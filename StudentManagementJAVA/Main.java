import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        boolean exit = false;

        while(!exit){
            System.out.println("---------------------------------------------");
            System.out.println("----------STUDENT MANAGEMENT SYSTEM----------");
            System.out.println("---------------------------------------------");

            System.out.println("\n1. Add Student");
            System.out.println("2. Display Student Information");
            System.out.println("3. Delete Student Information");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
            case 1:
                addStudent();
                break;
            case 2:
                displayInfo();
                break;
            case 3:
                deleteStudent();
                break;
            case 4:
                exit = true;
                System.out.println("Exiting the program...");
                break;
            default:
                System.out.println("Invalid choice, try again!");
            }
        }
    }

    private static void addStudent(){
        System.out.print("Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Student Age: ");
        int studentAge = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Student Course: ");
        String studentCourse = scanner.nextLine();

        System.out.print("Student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();

        students.add(new Student(studentName, studentAge, studentCourse, studentId));
        System.out.println("\n Student added successfully!");
    }

    private static void deleteStudent() {
        System.out.print("\nEnter Student ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        Student studentToRemove = null;
        for(Student student : students) {
            if(student.getId() == id) {
                studentToRemove = student;
                break;
            }
        }
        
        if(studentToRemove != null) {
            students.remove(studentToRemove);
            System.out.println("Student with ID " + id + " removed successfully.");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    private static void displayInfo(){
        if(students.isEmpty()){
            System.out.println("\n No student to display!");
        }else{
            System.out.println("---------------------------------------------");
            System.out.println("-------------STUDENT INFORMATION-------------");
            System.out.println("---------------------------------------------");
            for(Student students : students){
                System.out.println("NAME: " + students.getName());
                System.out.println("AGE: " + students.getAge());
                System.out.println("COURSE: " + students.getCourse());
                System.out.println("ID: " + students.getId());
                System.out.println("---------------------------------------------");
            }
            return;
        }
    }
}
