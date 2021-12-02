import java.util.List;
import java.util.ArrayList;

public class CompoundOperators
{
  public static void main(String[] args)
  {
    School PHS = new School("PHS");

    PHS.registerPerson(new Person("Reza", 11.5));
    PHS.registerPerson(new Person("Brendan", 11.5));
    PHS.registerPerson(new Person("Marshall", 11.5));
    PHS.registerPerson(new Person("Patrick", 11.5));

    int numPeople = PHS.getPeople().size();  
    double totalYears = 0;

    for (Person person : PHS.getPeople()) {
        totalYears += person.GRADE;
    }

    System.out.println("The average age at " + PHS.NAME + " is " + totalYears / numPeople + " years old.");
  }
}

class School {
    public final String NAME;
    private List<Person> people = new ArrayList<Person>();

    public School(String name) {
        NAME = name;
    }

    public void registerPerson(Person person) {
        people.add(person);
    }

    public List<Person> getPeople() {
        return people;
    }
}

class Person {
    final String NAME;
    final double GRADE;

    public Person(String name, double grade) {
        GRADE = grade;
        NAME = name;
    }
}