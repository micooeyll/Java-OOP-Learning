//test
package oop.basics;

public class Student {
	private String name;
    private double gpa;
    private int id;

    public Student(String name, double gpa, int id) {
        this.name = name;
        this.gpa = gpa;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public int getId() {
        return id;
    }

    public String getHonorStatus() {
        if (gpa >= 3.5) {
            return "HIGH HONOR";
        } else if (gpa >= 3.0) {
            return "HONOR";
        } else {
            return "NO HONOR";
        }
    }

}
