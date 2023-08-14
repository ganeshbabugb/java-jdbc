package com.ganesh;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Java Database Connectivity Setup");
        MysqlConnect mysql = new MysqlConnect();
        Connection conn = mysql.connect();
        Statement st = conn.createStatement();
        st.executeUpdate(Queries.create);
        System.out.println("Student Table Created");
        st.executeUpdate(Queries.insert);
        System.out.println("Student Data inserted!");
        ResultSet rs = st.executeQuery(Queries.get);
        while (rs.next()) {
            System.out.println("Name = " + rs.getString(1) + " Age = " + rs.getInt(2));
        }
        mysql.disconnect();
    }
}
