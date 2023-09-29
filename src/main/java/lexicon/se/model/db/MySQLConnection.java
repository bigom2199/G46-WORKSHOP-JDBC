package lexicon.se.model.db;

import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
     private static final String JDBC_USER = "root";
     private static final  String JDBC_PWD= "NAME";
     private static final String JDBC_URL = "jdbc:mysql://localhost:3306/todo";
     public static  connection getConnection(){
         Connrction connection = null;
         try{
             connection = DriverManager.getConnection(JDBC_URL, JDBC_PWD);

         } catch (SQLException e){
           e.printStackTrace();
         }

         return connection;
     }

}
