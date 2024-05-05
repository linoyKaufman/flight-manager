package EX2;
import java.util.ArrayList;
import java.util.List;

import EX2.staff.Person;

public class SchoolStuffSingeltone {
    private final int MAX_SIZE_OF_MEMBERS = 100;
    private static SchoolStuffSingeltone single_instance = null;

   
    private List<Person> members;


    private SchoolStuffSingeltone()
    {
        members = new ArrayList<>(MAX_SIZE_OF_MEMBERS);
    }

    public static synchronized SchoolStuffSingeltone getInstance()
    {
        if (single_instance == null)
            single_instance = new SchoolStuffSingeltone();

        return single_instance;
    }
    public List<Person> getMembers() {
        return members;
    }

    public void addMemberToStuff(Person member) {
        if(this.members.size() == MAX_SIZE_OF_MEMBERS) {
            System.out.println("You reached the limit of the stuff in the school.");
        } else {
            this.members.add(member);
        }

    }

    public void removeMemberFromStuff(Person member) {
        this.members.remove(member);
    }
}