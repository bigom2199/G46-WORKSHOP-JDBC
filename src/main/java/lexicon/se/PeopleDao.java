package lexicon.se;

import java.util.Collection;

public interface PeopleDao {
    Person create(Person person);
    Collection<Person> findAll();

    Person findById(int id);
    Collection<Person> findByName(String name);
    Person Update(Person Person);
    boolean deleteById(int id);
}
