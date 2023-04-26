//Write a Java Program demonstrating the database connectivity in java.

import java.sql.*;

class Demo{
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/hr";
            String user = "root";
            String password = "********"; //password redacted

            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println(conn);
            System.out.println("Connection successful");

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select now()");
            if(rs.next()){
                System.out.println(rs.getString(1));
            }
            rs.close();
            st.close();


            String sql = "select country_name from countries";

            try(Connection connection = DBUtil.getConnection();
                Statement statement = connection.createStatement()){
                ResultSet result = statement.executeQuery(sql);
                int count = 0;
                while(result.next()){
                    count++;
                    System.out.println(result.getString("country_name"));
                    count++;
                }
                System.out.println("Total number of countries: " + count);
                result.close();
                }
            catch(SQLException e){
                System.out.println("Error: " + e.getMessage());
            }
        }
        catch (ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
} 
