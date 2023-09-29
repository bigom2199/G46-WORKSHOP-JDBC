package lexicon.se.model;

import lexicon.se.PeopleDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static java.sql.PreparedStatement.*;

public  class PeopleDamoImpl implements PeopleDao {
    String query = "insert into person(first_name,last-name)value()";
    try(Connection connection = MySQLConnection.getConnection();

   PreparedStatement preparedStatement = connection.prepareStatement(query, RETURN_GENERATED_KEYS);
    PreparedStatement.setString(1,Person.getFirstName());
    PreparedStatement.setString(2,Person.getLastName());
    PreparedStatement.executeUpdate();

    int rowsInserted = PreparedStatement.executeUpdate();
    if (rowsInserted> 0) {
        System.out.println("People created successfully!");
    }



    try (ResultSet generateKeys = PreparedStatement.getGeneeeeeeratedKeys()){
        if (generateKeys.next()) {
            int generatedPersonId = generateKeys.getInt(1);
            System.out.println("generatedPersonId =" + generatedPersonId);

        }
    } catch (SQLException e){
        e.printStackTrace();
    }
     return person;
    public PeopleDamoImpl() throws SQLException {
    }


}
