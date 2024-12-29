package ass1;

public class Teacher extends Person {
    private String subject;
    public int salary;
    public int yearsOfExperience;

    public Teacher(String name, String surname, int age, boolean gender, String subject, int salary, int yearsOfExperience) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
    }

    public void giveRaise(int percentage){
        salary += salary * percentage / 100;
    }


    @Override
    public String toString(){
        return super.toString() + " I teach " + subject + ".";
    }
}
