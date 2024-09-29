package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTutorial {
    public static void main(String[] args) {
        
        try (Connection connection = DriverManager.getConnection("jdbc:h2:mem:")){
            System.out.println("connection.isValid(0) = " + connection.isValid(0));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
