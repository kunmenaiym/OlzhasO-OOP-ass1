package ass1;

import java.io.*;
import java.util.*;

public class MainTask4 {

    public static void main(String[] args) {

        File studentFile = new File("C:\\my dock\\javaprojectfiles\\OlzhasO OOP ass1\\src\\ass1\\students(4).txt");
        File teacherFile = new File("C:\\my dock\\javaprojectfiles\\OlzhasO OOP ass1\\src\\ass1\\teachers(1).txt");

        School school = new School();

        try (Scanner scanner = new Scanner(studentFile)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] studentData = line.split(" ");

                String name = studentData[0];
                String surname = studentData[1];
                int age = Integer.parseInt(studentData[2]);
                boolean gender = Boolean.parseBoolean(studentData[3]);
                int studentID = Integer.parseInt(studentData[4]);

                Student student = new Student(name, surname, age, gender, studentID);

                for (int i = 5; i < studentData.length; i++) {
                    student.addGrade(Integer.parseInt(studentData[i]));
                }

                school.addMember(student);

                System.out.println(student);
                System.out.println("GPA: " + student.calculateGPA());
            }
        }
        catch (FileNotFoundException e) {
            System.err.println("file not found: " + e.getMessage());
        }

        try (Scanner scanner = new Scanner(teacherFile)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] teacherData = line.split(" ");

                String name = teacherData[0];
                String surname = teacherData[1];
                int age = Integer.parseInt(teacherData[2]);
                boolean gender = Boolean.parseBoolean(teacherData[3]);
                String subject = teacherData[4];
                int salary = Integer.parseInt(teacherData[5]);
                int yearsOfExperience  = Integer.parseInt(teacherData[6]);

                Teacher teacher = new Teacher(name, surname, age, gender, subject, salary, yearsOfExperience);

                if (yearsOfExperience > 10) {
                    teacher.giveRaise(10);
                }

                school.addMember(teacher);

                System.out.println(teacher);
                System.out.println("New salary: " + teacher.salary);


            }
        } catch (FileNotFoundException e) {
            System.err.println("file not found: " + e.getMessage());
        }
        System.out.println(school);
    }
}
