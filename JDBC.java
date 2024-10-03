import java.sql.*;
public class Main {
    public static void main(String[] args) throws Exception {

        /**
          7 Steps of JDBC :-
         * 1. import packages
         * 2. load driver
         * 3. register driver
         * 4. create connection
         * 5. Create Statement
         * 6. Execute Statement
         * 7. close connection
         */

       //1&2 optional  //Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/DB01Learning";
        String username = "postgres";
        String password = "****";
        Connection con = DriverManager.getConnection(url,username,password);

        System.out.println("Connected to PostgreSQL database");
        Statement statement = con.createStatement();
        /**
         * Example 1
        String query = "SELECT \"SNAME\"\n" +
                "FROM public.\"Student\"\n" +
                "WHERE \"SID\" = 1;";

        ResultSet resultSet = statement.executeQuery(query);
        System.out.println(resultSet.next());
        System.out.println(resultSet.getString("Sname"));
        System.out.println(resultSet.getString(1));
*/
       /**
        * Example 2
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            System.out.print(resultSet.getInt(1)+" - ");
            System.out.print(resultSet.getString(2)+" - ");
            System.out.print(resultSet.getInt(3));
            System.out.println();
        }
        */
/**
 * Example 3
        String query = "UPDATE public.\"Student\"\n" +
                "SET \"SNAME\" = 'sheryasRgowda'\n" +
                "WHERE \"SID\" = 5;\n";
        statement.execute(query);
 */
int sid =7;
String sname = "ABD";
int marks =97;

String query = "insert into public.\"Student\" values(?,?,?)";
            PreparedStatement statement2 = con.prepareStatement(query);
            statement2.setInt(1,sid);
            statement2.setString(2,sname);
            statement2.setInt(3,marks);

            statement2.execute();

        con.close();
        System.out.println("Closed connection");
    }
}
