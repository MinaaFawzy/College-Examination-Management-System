package Model;

import static Model.ConnectDb.getConnection;
import static Model.SQLQueries.connectToServer;
import static Model.SQLQueries.statement;
import java.awt.Component;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class SQLQueries {

    static Connection connectToServer;
    static Statement statement;

    public static void executeDeleteQuery(String tableName, String condition) {
        try {
            connectToServer = getConnection();
            statement = connectToServer.createStatement();
            statement.executeUpdate("DELETE FROM " + tableName + " WHERE " + condition);
        } catch (SQLException exception) {
            System.out.println(exception);
        }
    }

    public static void executeDeleteQueryLimitaion(String tableName) {
        try {
            connectToServer = getConnection();
            statement = connectToServer.createStatement();
            statement.executeUpdate("DELETE FROM " + tableName + " limit 1 ");
        } catch (SQLException exception) {
            System.out.println(exception);
        }
    }

    public static ResultSet executeSelectQueryWithoutCondition(String columnName, String tableName) {
        ResultSet resultSetFromTable = null;
        try {
            connectToServer = getConnection();
            statement = connectToServer.createStatement();
            resultSetFromTable = statement.executeQuery("SELECT " + columnName + " FROM " + tableName);
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
        return resultSetFromTable;
    }

    public static ResultSet executeSelectQueryWithCondition(String columnName, String tableName, String condition) {
        ResultSet resultSetFromTable = null;
        try {
            connectToServer = getConnection();
            statement = connectToServer.createStatement();
            resultSetFromTable = statement.executeQuery("SELECT " + columnName + " FROM " + tableName + " WHERE " + condition);
            resultSetFromTable.next();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
        return resultSetFromTable;
    }

    public static ResultSet executeSelectQueryLimitaion(String tableName) {
        ResultSet resultSetFromTable = null;
        try {
            connectToServer = getConnection();
            statement = connectToServer.createStatement();
            resultSetFromTable = statement.executeQuery("SELECT * FROM " + tableName + " limit 1");
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
        return resultSetFromTable;
    }

    public static void executeInsertQuery(String tableName, String valueName) {
        try {
            connectToServer = getConnection();
            statement = connectToServer.createStatement();
            statement.executeUpdate("INSERT INTO " + tableName + " VALUES (" + valueName + ")");
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "Inserted Successfully" );
            int c=JOptionPane.OK_OPTION;
        } catch (SQLException exception) {
            System.out.println(exception);
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "Invalid Process!" );
            int c=JOptionPane.OK_OPTION;
        }
    }

    public static void executeUpdateQuerys(String tableAndcolumnName, String newValue, long id) {
        try {
            connectToServer = getConnection();
            statement = connectToServer.createStatement();
            statement.executeUpdate("UPDATE " + tableAndcolumnName + " = '" + newValue + "' WHERE id = " + id + "");
        } catch (SQLException exception) {
            System.out.println(exception);
            
        }
    }
    
    public static void executeUpdateQuerysGrade(String tableAndcolumnName, String newValue, long sid,long cid) {
        try {
            connectToServer = getConnection();
            statement = connectToServer.createStatement();
            statement.executeUpdate("UPDATE " + tableAndcolumnName + " = '" + newValue + "' WHERE student_id = " + sid + " AND course_id="+cid+"");
        } catch (SQLException exception) {
            System.out.println(exception);
            
        }
    }


}
