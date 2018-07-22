package dataLayer;

import java.sql.*;

public class DB_user {

    //JDBC Driver Name and Database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/webapptutorial";

    //Database Credentials
    static final String USER = "webappuser2";
    static final String PASS = "test123";


    public boolean isValidUserLogin(String sUsername, String sUserPassword)
    {
        boolean isValidUser = false;

        Connection conn = null;
        Statement stmt = null;
        String sql = "";

        try
        {
            //Register the JDBC Driver
            Class.forName("com.mysql.jdbc.Driver");

            //Open a connection
            System.out.println("Connecting to database....");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //Execute a Query
            System.out.println("Creating statement....");
            stmt = conn.createStatement();

            sql = "SELECT * FROM users WHERE user_name = \"" +
                    sUsername + "\" AND user_password = \"" + sUserPassword + "\"";
            System.out.println(sql);

            ResultSet rs = stmt.executeQuery(sql);

            //Ectract Results from Result Set
            if(rs.next())
                isValidUser = true;

            rs.close();
            stmt.close();
            conn.close();
        }
        catch(SQLException se)
        {
            //Handle errors for JDBC
            se.printStackTrace();
        }
        catch(Exception e)
        {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
        finally
        {
            //finally block used to close resources
            try
            {
                if(stmt!=null)
                    stmt.close();
            }
            catch(SQLException se2)
            {
                //nothing we can do
            }

            try
            {
                if(conn!=null)
                    conn.close();
            }
            catch(SQLException se3)
            {
                se3.printStackTrace();
            }
        }
        System.out.println("Closing DB Connection - Goodbye");

        return isValidUser;
    }
}
