package lexicon.se.model;

import lexicon.se.model.db.MySQLConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
}