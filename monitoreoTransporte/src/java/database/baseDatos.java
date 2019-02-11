/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Leteo
 */
public class baseDatos {

    Connection _conecction = null;

    String _url = "jdbc:mysql://10.31.2.254:3306/transporteDB";
    String _user = "root";
    String _contrasenia = "";

    public baseDatos() {
        

        try {
            Class.forName("com.mysql.jdbc.Driver.class").newInstance();
            this._conecction = DriverManager.getConnection(_url, _user, _contrasenia);

        } catch (Exception e) {

        }
    }

    
    
    public Connection getConenection() {
        return this._conecction;
    }

    
    public void closeConecction(){
        if(this._conecction != null){
            try {
                this._conecction.close();
            } catch (Exception e) {
            }
        }
    }
}
