
import java.sql.*;

public class App {

  public static void main(String[] args){


    Connection connection = MBSQLConnectionUtility.getConnection();
    try {
      System.out.println(connection.isValid(5));
    } catch (SQLException e) {
      e.printStackTrace();
    }

  }
  
}

