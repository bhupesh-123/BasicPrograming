package com.designpattern.singalton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private Connection connection;
    private static DBConnection instance;
    private  DBConnection(){
        try {
            String url = "jdbc:mysql://localhost:3306/testdb";
            String username = "root";
            String password = "root";
            connection=DriverManager.getConnection(url,username,password);
            System.out.println("Database Connected!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
public  static DBConnection getDbConnection(){
        if(instance==null){
            synchronized (DBConnection.class){
                if(instance==null){
                    instance=new DBConnection();

                }
            }
        }
        return instance;
}

}
