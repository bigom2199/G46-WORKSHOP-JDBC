package lexicon.se;

public class Person {
    private String firstName;
    private String lastName;
    private int Person_id;
    public Person (String firstName,String lastName,int person_id){
        this.firstName=firstName;
        this.lastName=lastName;
        this.Person_id=person_id;
    }
    public int getPerson_id(){
        return Person_id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setPerson_id(int person_id) {
        Person_id = person_id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Person_id=" + Person_id +
                '}';
    }
}
