/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author laxmi
 */
public class ConnectionProvider {

    public static Connection con = null;

    public static Connection getConnection() {
        try {
            if (con == null) {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagement", "root", "prakashjoshi");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}
