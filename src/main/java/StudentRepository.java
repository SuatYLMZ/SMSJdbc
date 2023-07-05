import java.sql.*;

//this class will communicate with DB
public class StudentRepository {

    // 4- Create connection with DB
    private Connection con;
    private Statement stmnt;
    private PreparedStatement prs;

    //5 - method to create connection to db
    private void getConnection(){
        try {
            this.con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_db",
                    "dev_user", "password");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    //6-method to create statement
    private void getStatement(){
        try {
            this.stmnt = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    //7- method to create prepared statement
    private void getPreparedStatement(String query){
        try {
            this.prs = con.prepareStatement(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    //8-method to create a table
    public void createTable(){
        getConnection(); //create connection
        getStatement(); //
        try {
            stmnt.execute("CREATE table IF NOT EXISTS t_student (id SERIAL, name VARCHAR(50), lastname VARCHAR(50), city VARCHAR(30), age int)");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                stmnt.close();
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }


}