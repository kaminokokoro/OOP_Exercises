package OOP_Exercises.lab10.src.com.oop.collections.phonebook;

import java.util.Objects;

public class Student implements Comparable<Student> {
    String name;
    String lastname;
    String phone;
    double average;

    public Student(String name, String lastname, String phone) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
    }

    public Student(String name, String lastname, double average) {
        this.name = name;
        this.lastname = lastname;
        this.average = average;
    }

    public Student(String name, String lastname, String phone, double average) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.average = average;
    }

    @Override
    public int compareTo(Student s) {
        // Compare lastname first, and then name
        int compare = lastname.compareTo(s.lastname);
        if (compare == 0) {
            compare = name.compareTo(s.name);
        }
        return compare;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, phone, average);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return Double.compare(student.average, average) == 0
                && Objects.equals(name, student.name)
                && Objects.equals(lastname, student.lastname)
                && Objects.equals(phone, student.phone);
    }

    @Override
    public String toString() {
        return "Student[" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phone='" + phone + '\'' +
                ", average=" + average +
                ']';
    }
}