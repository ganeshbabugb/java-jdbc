package com.ganesh;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java Database Connectivity Setup");
        MysqlConnect mysql = new MysqlConnect();
        Connection conn = mysql.connect();
        mysql.disconnect();
    }
}
