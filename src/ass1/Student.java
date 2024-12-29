package ass1;

public class Student extends Person {

    private int studentID;
    private int grades[];
    private int gradeCount;


    public Student(String name, String surname, int age, boolean gender, int studentID) {
        super(name, surname, age, gender);
        this.studentID = studentID;
        this.grades = new int[100];
        this.gradeCount = 0;
    }


    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades[gradeCount] = grade;
            gradeCount++;
        }
    }


    public double calculateGPA (){
        if (gradeCount == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < gradeCount; i++) {
            sum += grades[i];
        }
        return (double) sum / gradeCount;
    }


    @Override
    public String toString() {
        return super.toString() + " I am a student with ID " + studentID + ".";
    }
}
