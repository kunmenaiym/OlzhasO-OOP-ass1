package ass1;

import java.util.ArrayList;
import java.util.List;

public class School {

    public List<Person> members;

    public School() {
        this.members = new ArrayList<>();
    }
    public void addMember(Person person) {
        members.add(person);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("School Members: \n");
        for (Person member : members) {
            result.append(member.toString()).append("\n");
        }
        return result.toString();
    }
}
