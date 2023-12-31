package lexicon.se.model;

import java.util.Collection;

public interface TodoItems {
    Todo_Item create(Todo_Item item);
    Collection<Todo_Item> findAll();
    Todo_Item findById(int id);
    Collection<Todo_Ttem> findByDoneStatus(boolean val);
    Collection<Todo_Item> findByAssignee(Person per);
    Collection<Todo_Item> findByUnassignedTodoItems();
    Todo_Item update(Todo_Item item);
    boolean deleteById(int delId);
}
