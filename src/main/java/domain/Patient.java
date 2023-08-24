package domain;

import com.jayway.jsonpath.Criteria;

import java.util.Scanner;

class Patient {
    private final String name;
    private final int age;
    private final String gender;
    private final String phoneNumber;

    public Patient(String name, int age, String gender, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creating a new patient:");

        System.out.print("Enter patient name: ");
        String name = scanner.nextLine();

        System.out.print("Enter patient age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter patient gender: ");
        String gender = scanner.nextLine();

        System.out.print("Enter patient phone number: ");
        String phoneNumber = scanner.nextLine();

        if (validatePatient(name, age, gender, phoneNumber)) {
            Patient patient = new Patient(name, age, gender, phoneNumber);
            System.out.println("New patient created successfully!");
            System.out.println("Patient Details:");
            System.out.println("Name: " + patient.getName());
            System.out.println("Age: " + patient.getAge());
            System.out.println("Gender: " + patient.getGender());
            System.out.println("Phone Number: " + patient.getPhoneNumber());
        } else {
            System.out.println("Invalid input! Please check the entered values.");
        }
    }

    public static boolean validatePatient(String name, int age, String gender, String phoneNumber) {
        if (name.isEmpty() || age <= 0 || (gender.equalsIgnoreCase("male") == false && gender.equalsIgnoreCase("female") == false) || phoneNumber.length() != 10) {
            return false;
        }
        return true;
    }
}


