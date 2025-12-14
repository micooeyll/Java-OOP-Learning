package oop.basics;

import java.util.Scanner;

public class StudentTesting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("NAME ? : ");
        String name = input.nextLine();

        System.out.print("GPA ? : ");
        double gpa = input.nextDouble();

        System.out.print("ID ? : ");
        int id = input.nextInt();

        Student s1 = new Student(name, gpa, id);
        Student s2 = new Student("Ayse", 3.2, 35);
        Student s3 = new Student("Mehmet", 2.5, 608);

        System.out.print("\n");
        printStudentInfo(s1);

        System.out.println("\nexample:\n");

        printStudentInfo(s2);
        System.out.println();
        printStudentInfo(s3);

        input.close();
    }

    public static void printStudentInfo(Student s) {
        System.out.println("NAME: " + s.getName());
        System.out.println("ID: " + s.getId());
        System.out.println("GPA: " + s.getGpa());
        System.out.println("HONOR: " + s.getHonorStatus());
    }

}
