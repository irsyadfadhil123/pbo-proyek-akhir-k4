/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.kelompok4.pboprojectakhir;

import com.kelompok4.app.LoginPage;

/**
 *
 * @author Irsyad Fadhil
 */
public class PboProjectAkhir {

    public static void main(String[] args) {
        Database conn = new Database();
        conn.getConnection();
        
        LoginPage start = new LoginPage();
        start.setVisible(true);
    }
}
