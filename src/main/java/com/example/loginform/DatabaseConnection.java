package com.example.loginform;
import java.sql.Connection;
import java.sql.Driver;


public class DatabaseConnection {
    public Connection databaseLink;

    public Connection getConnection (){
        String databaseName ="logininfo";
        String databaseUser = "";
        String databasePassword ="";
        String url = "jdbc:mysql://localhost" + databaseName;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (Exception e){
            e.printStackTrace();
        }
        return databaseLink;
    }
}
