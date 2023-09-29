package lexicon.se.model;

import lexicon.se.model.db.MySQLConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TodoItemDamoImpl implements TodoItems {
    @Override
            public <Todo_Item> Todo_Item create(Todo_Item item){


    String query = "insert into todo_item(title,description,deadline,done,assignee_id)value ( )";

            try (
                    Connection connection = MySQLConnection.getConnection();
                    PreparedStatement.setString(1,item.getTitle());
                    PreparedStatement.setString(2,item.getDescription());
                    PreparedStatement.setDate(3,java.sql.Date.valueOf(item.getDeadline()));
                    PreparedStatement.setBoolean(4,item.getDone());
                    PreparedStatement.setInt(5,item.getAssignee_id());
                    PreparedStatement.executeUpdate();

          int rowsInserted = preparedStatement.executeUpdate();
          if (rowsInserted > 0 ) {
                System.out.println("Todo item created successfully!");
            }
          try(ResultSet generateedKeys = preparedStatement.getGeneratedKeys()
              if (generateedKeys .next()){
                  int generatedTodoId = generatedKeys.getInt(1);
            System.out.println("generatedTodoId = " + generatedTodoId);

        }



     }catch (SQLException e){
        e.printStackTrace();
    }
     return item;

        @Override
public  Collection<Todo_Item> findAll() {
        List<Todo_Item> item = new ArrayList<Todo_Item>();
        String query = "SELECT * FROM todo_item";

        try (Collection collection = Collections.singleton(MySQLConnection.getConnection())
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("query");
    }
        while (resuitSet.next())

    {
        int todoId = resultSet.getInt(1);
        String title = resultSet.getString(2);
        String description = resultSet.getString(3);
        LocalDate deadline = resultSet.getDate(4).toLocalDate();

        boolean done = resultSet.getBoolean(5);
        int assignedId = resultSet.getInt(6);
        Todo_Item item = new Todo_Item(todoId, title, description, deadline, done);


        item.add(item);
    }catch (SQLException e){
            e.printStackTrace();
    }
    return item;
}


























