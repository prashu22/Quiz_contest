/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ietquiz;
import java.sql.*;

/**
 *
 * @author user
 */
public class IETDB {
    public Connection con=null;
    public Statement stmt=null;
    public PreparedStatement pstmt=null;
    public ResultSet rst=null;
    public IETDB()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ietquiz","root","prashu");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}