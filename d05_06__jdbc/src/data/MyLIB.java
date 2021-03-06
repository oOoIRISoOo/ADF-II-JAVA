/*
    Đây là lớp thư viện để :
    - Nạp và đăng ký driver SQL JDBC
    - Kết nối đến cơ sở dữ liệu [sem2_demo] để truy cập các bảng trong CSDL đó
 */
package data;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLIB {
    //Phương thức nạp driver JDBNC và kết nối đến CSDL [sem2_demo]
    public static java.sql.Connection getConnect(){
        java.sql.Connection cn =null;
        
        try {
            //1. Nạp và đăng ký driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            //2. Mở kết nối đến SQL Server [localhost:1433], 
            //   Cụ thể là làm việc với database [ sem2_demo ]
             //Chuỗi này cực kỳ quan trọng
            String url="jdbc:sqlserver://localhost:1433; database=sem2_demo";  
            cn=DriverManager.getConnection(url, "meangirl", "pokemon92");
            
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
        return cn;
    }
}
