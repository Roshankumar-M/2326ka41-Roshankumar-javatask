package codejava;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class StudentCourse
{
    public static void main(String[] args) 
    {
        ArrayList<String> students = new ArrayList<>();
        HashMap<String, ArrayList<String>> studentCourses = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do 
        {
            System.out.println("\n--- Student Course Enrollment System ---");
            System.out.println("1. Add Student and Enroll Courses");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Students and Courses");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) 
            {

                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    students.add(name);

                    ArrayList<String> courses = new ArrayList<>();
                    System.out.print("Enter number of courses to enroll: ");
                    int count = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < count; i++) 
                    {
                        System.out.print("Enter course " + (i + 1) + ": ");
                        courses.add(scanner.nextLine());
                    }

                    studentCourses.put(name, courses);
                    System.out.println("Student added and courses enrolled.");
                    break;

                case 2:
                    System.out.print("Enter student name to remove: ");
                    String removeName = scanner.nextLine();

                    if (students.remove(removeName)) 
                    {
                        studentCourses.remove(removeName);
                        System.out.println("Student removed.");
                    } 
                    else 
                    {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Students and Enrolled Courses ---");
                    Iterator<String> studentIterator = students.iterator();

                    while (studentIterator.hasNext()) 
                    {
                        String student = studentIterator.next();
                        System.out.println("Student: " + student);

                        ArrayList<String> enrolledCourses = studentCourses.get(student);
                        if (enrolledCourses != null) 
                        {
                            Iterator<String> courseIterator = enrolledCourses.iterator();
                            System.out.print("Courses: ");
                            while (courseIterator.hasNext()) 
                            {
                                System.out.print(courseIterator.next());
                                if (courseIterator.hasNext()) System.out.print(", ");
                            }
                            System.out.println();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } 
        while (choice != 4);

        scanner.close();
    }
}