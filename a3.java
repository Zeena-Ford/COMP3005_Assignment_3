import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class a3 {

    public static void main(String[] args){
        String url = "jdbc:postgresql://localhost:5432/Assignment 3";
        String user = "postgres";
        String password = "datapass";

        try{
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            statement.executeQuery("select * from STUDENTS");
            ResultSet resultSet = statement.getResultSet();
            while(resultSet.next()){
               System.out.println(resultSet.getString("first_name"));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }

    }


}
