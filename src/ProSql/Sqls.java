/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProSql;
import java.sql.*;
/**
 *
 * @author VISHNU.S
 */
public class Sqls {
      public static Connection getCon() {
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:DataStore.db");
            return con;
        }
        catch(Exception e){
            return null;
        }
    }  
}
