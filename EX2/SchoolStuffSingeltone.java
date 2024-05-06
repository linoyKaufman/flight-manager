package EX2;
import java.util.ArrayList;
import java.util.List;

import EX2.staff.Person;
// This class represents a singleton instance for managing school staff.
public class SchoolStuffSingeltone {
    private final int MAX_SIZE_OF_MEMBERS = 200; // Maximum size of staff members
    private static SchoolStuffSingeltone single_instance = null; // Singleton instance
    private List<Person> members; // List of staff members

    // Private constructor to prevent instantiation from outside the class.
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
    // Method to get the list of staff members.
    public List<Person> getMembers() {
        return members;
    }
    // Method to add a member to the staff.
    public void addMemberToStuff(Person member) {
        if(this.members.size() == MAX_SIZE_OF_MEMBERS) {
            System.out.println("You reached the limit of the stuff in the school.");
        } else {
            this.members.add(member);
        }

    }
   // Method to remove a member from the staff.
    public void removeMemberFromStuff(Person member) {
        this.members.remove(member);
    }
}