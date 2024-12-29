package ass1;

public class MainTask2 {
    public static void main(String[] args) {

        Student s = new Student("Sake", "Sakeuly", 17, true, 1);
        s.addGrade(70);
        s.addGrade(80);
        s.addGrade(90);
        System.out.println(s);
        System.out.println("GPA: " + s.calculateGPA());

        Teacher t = new Teacher("Ibyrai ", "Altynsarin", 50, true, "Qazaq xrestomatiıasy", 1000000, 10);
        System.out.println(t);
        t.giveRaise(10);
        System.out.println("New salary: " + t.salary);

        School school = new School();
        school.addMember(s);
        school.addMember(t);
        System.out.println(school);

    }
}
