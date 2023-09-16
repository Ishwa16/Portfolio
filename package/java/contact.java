package java;  

import java.sql.*;  


public class contact {  

    public void submitData(String name,String email,String subject,String message) throws SQLException, ClassNotFoundException  {  


       

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
            Statement statement = conn.createStatement();  
            conn = DriverManager.getConnection("jdbc:mysql://localhost/contact","root", "");
            System.out.print("Database is connected !");

            String command = "INSERT INTO contact (name, email, subject, message) VALUES (" + name + "," + email + "," + subject + "," + message + ");";  
            statement.executeUpdate(command);  

            conn.close();
        }
        catch(Exception e) {
            System.out.print("Do not connect to DB - Error:"+e);
        }
 
   }  
} 