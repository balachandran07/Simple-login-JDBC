package com.mycompany.app;

import java.sql.*;

public class App
 {
     public static void main(String args[])
     {
      boolean st =false;
      try{

	 //loading drivers for mysql
         Class.forName("com.mysql.jdbc.Driver");

 	 //creating connection with the database 
         Connection con=DriverManager.getConnection
                        ("jdbc:mysql:/ /localhost:3306/test1","root","");
         PreparedStatement ps =con.prepareStatement
                             ("insert into student (Name,Dept,Age) values ('logesh','Cse',22)");
         
         ps.executeQuery();
         
        
      }catch(Exception e)
      {
          e.printStackTrace();
      }
                       
  }   
}