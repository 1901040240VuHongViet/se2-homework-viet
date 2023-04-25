import java.sql.*;

public class MySQLConnect {
    static final String DB_URL = "jdbc:mysql://localhost:3306/SchoolDB";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql = "SELECT student_id, first_name, last_name, email, class FROM Student";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int studentId = rs.getInt("student_id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String email = rs.getString("email");
                String className = rs.getString("class");

                System.out.println("ID: " + studentId);
                System.out.println("First Name: " + firstName);
                System.out.println("Last Name: " + lastName);
                System.out.println("Email: " + email);
                System.out.println("Class: " + className);
                System.out.println("----------------------------------------------------------------");
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.err.println("Connect to the database failed!");
            e.printStackTrace();
        }
    }
}

