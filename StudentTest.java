import java.util.Scanner;
public class StudentTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter student " + (i + 1) + " details: ");
            System.out.println("Name: ");
            String name = scanner.next();
            System.out.println("Roll: ");
            int roll = scanner.nextInt();
            System.out.println("City: ");
            String city = scanner.next();
            System.out.println("Pin: ");
            int pin = scanner.nextInt();

            Student student = new Student(name, roll, city, pin);
            student.displayStudent();
            System.out.println();
        }
}
}


class Student {
    static int count = 0;
    String name;
    int roll;
    Address address;

    Student(String name, int roll, String city, int pin) {
        System.out.println("Creating student number " + ++count);
        this.name = name;
        this.roll = roll;
        this.address = new Address(city, pin);
    }

    void displayStudent() {
        System.out.println("Student: ");
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Address: ");
        address.displayAddress();
    }

    class Address {
        String city;
        int pin;

        Address(String city, int pin) {
            this.city = city;
            this.pin = pin;
        }

        void displayAddress() {
            System.out.println("City: " + city);
            System.out.println("Pin: " + pin);
        }
    }
}

