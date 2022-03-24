package dev.natasha.voting.controllers;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseController {
    /**
     * Connect to a sample database
     */
    public static void connect() {
        Connection conn = null;
        Statement stmt = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:db.sqlite";
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");
            System.out.println("Creating user table...");
            stmt = conn.createStatement();
            String sql1 = "CREATE TABLE IF NOT EXISTS" +
                    " Users" +
                    " (userID INTEGER PRIMARY KEY AUTOINCREMENT not NULL," +
                    "  lastName VARCHAR(45)," +
                    "  firstName VARCHAR(45)," +
                    "  role VARCHAR(45)," +
                    "  age INT," +
                    "  address VARCHAR(200));";
            stmt.executeUpdate(sql1);

            System.out.println("Populating table with default users...");
            String sql2 = "INSERT INTO" +
                    " Users (lastName, firstName, role, age, address)" +
                    " VALUES ('DEFAULT', 'ADMIN', 'ADMINISTRATOR', null, null)," +
                    "        ('DEFAULT', 'AUDITOR', 'AUDITOR', null, null)," +
                    "        ('DEFAULT', 'VOTER', 'VOTER', 18, 'DEFAULT ADDRESS STRING');";
            int inserted = stmt.executeUpdate(sql2);
            System.out.printf("Inserted %d rows\n", inserted);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
