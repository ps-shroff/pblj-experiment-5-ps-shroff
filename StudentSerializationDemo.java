import java.io.*;

// Student class implementing Serializable
class Student implements Serializable {
    private static final long serialVersionUID = 1L; // Unique ID for serialization
    private String name;
    private double gpa;
    private int regNo; // Registration number

    public Student(String name, double gpa, int regNo) {
        this.name = name;
        this.gpa = gpa;
        this.regNo = regNo;
    }

    // Getters and toString method for display
    @Override
    public String toString() {
        return "Name: " + name + ", GPA: " + gpa + ", Registration Number: " + regNo;
    }
}

public class StudentSerializationDemo {
    public static void main(String[] args) {
        Student student = new Student("Naman", 8.5, 16394);
        String filename = "student.ser"; // File to save the serialized object

        // Serialization
        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(student);
            System.out.println("Student object serialized and saved to " + filename);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException occurred: " + e.getMessage());
        }

        // Deserialization
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Student deserializedStudent = (Student) in.readObject();
            System.out.println("Student object deserialized: " + deserializedStudent);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException occurred: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + e.getMessage());
        }
    }
}
