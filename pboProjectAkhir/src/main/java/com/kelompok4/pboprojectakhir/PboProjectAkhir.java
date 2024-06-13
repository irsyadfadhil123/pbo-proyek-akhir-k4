/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.kelompok4.pboprojectakhir;

import com.kelompok4.app.LandingPage;

/**
 *
 * @author Irsyad Fadhil
 */
public class PboProjectAkhir {

    public static void main(String[] args) {
        Database conn = new Database();
        conn.getConnection();
        
        LandingPage start = new LandingPage();
        start.setVisible(true);
    }
}
