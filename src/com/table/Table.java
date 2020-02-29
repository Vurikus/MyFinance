package com.table;

import java.sql.*;

public class Table
{
    // Field
        private byte indexFromTable;
        private String nameFromTable;
        private String url = "jdbc:postgresql://localhost:5432/myFinanceDataBase";
        private String user = "postgres";
        private String pass = "1";

        private static byte num = 0;
        private String cat_name;
        private boolean cat_profit;


    //Constructor

    public Table() throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, pass);
        Statement statement = connection.createStatement();

    }
    //Function

    public void printTable (ResultSet rs) throws SQLException{
        while (rs.next()){
            System.out.println(rs.getLong("cat_id") + rs.getString("cat_name"));
        }
    }

    public ResultSet readCategory(Statement st) throws SQLException{
        ResultSet rs = st.executeQuery("SELECT * FROM category");
        return rs;
    }

    public int addNewCategory (Statement st, String cat_name, boolean cat_profit) throws SQLException{
        num++;
        return st.executeUpdate("INSERT INTO category (cat_id, cat_name, cat_profit) " +
                "VALUES (" + num +", " + cat_name + ", " + cat_profit + ");");
    }
}
