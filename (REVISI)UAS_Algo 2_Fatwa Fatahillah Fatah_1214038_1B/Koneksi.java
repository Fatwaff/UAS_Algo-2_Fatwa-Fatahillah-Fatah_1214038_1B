/**
 * Write a description of class Koneksi here.
 * 
 * @author Fatwa Fatahillah Fatah 
 * @version (a version number or a date)
 */
import java.sql.*;

public class Koneksi  
{
    /**
     * Constructor for objects of class Koneksi
     */
    public  static String x = "";
    public Koneksi()
    {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost/dbgreenfootuas";
        String user = "root";
        String password = "";
        try {
            Class.forName(driver);
            String query = "SELECT * FROM `arah` WHERE `id` = 1";
            try{
                Connection conn = DriverManager.getConnection(url, user, password);
                Statement stmt = conn.createStatement();
                ResultSet kunci = stmt.executeQuery(query); 
                
                while(kunci.next()){                   
                    x = kunci.getString("kunci");
                }  
                
            } catch (SQLException e) {
                x = "gagal";
                System.out.println(e);
            }
            

        } catch (ClassNotFoundException e) {
            x = "gagal";
            System.out.println(e);
        }//end try catch
    }

    /**

     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static String sampleMethod()
    {
        return x;
    }
}
