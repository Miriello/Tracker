package Manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager{
    private static Connection connection;

    private static final String DB_URL      = System.getProperty("db.url",      "jdbc:mysql://localhost:3306/TRACKER");
    private static final String DB_USER     = System.getProperty("db.user",     "root");
    private static final String DB_PASSWORD = System.getProperty("db.password", "");

    public static boolean connect(){
        try{
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            System.out.println("CONNESSIONE STABILITA");
            return true;
        } catch(SQLException e){
            System.out.println("CONNESSIONE FALLITA"+ e);
            return false;
        }
    }

    public static void chiudi() {
        try {
            if (connection != null && !connection.isClosed()) connection.close();
        } catch (SQLException e) {
            System.err.println("DB Errore chiusura: " + e.getMessage());
        }
    }

}
