/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.usuario;

/**
 *
 * @author Leteo
 */
public class usuarioDaoImpl implements DAO.interfaces.catalogo{
    private Connection _conection;

    public usuarioDaoImpl(Connection _conection) {
        this._conection = _conection;
    }

    @Override
    public boolean agregarRegistro(Object o) throws Exception {
        usuario _user = (usuario) o;
        
        String _sql= "INSERT INTO transportedb.usuario (nombre, apellido, edad, correo, contrasenia, telefono)"
                + "VALUES(?,?,?,?,?,?)";
        
        PreparedStatement _st = this._conection.prepareCall(_sql);
        
        _st.setString(1, _user.getNombre());
        _st.setString(2, _user.getApellido());
        _st.setInt(3, _user.getEdad());
        _st.setString(4, _user.getCorreo());
        _st.setString(5, _user.getContrasenia());
        _st.setString(6, _user.getTelefono());
        
        boolean resultado = _st.execute();
        
        if(_st != null){
            _st.close();
        }
        
        
        return resultado;
    }

    @Override
    public boolean modificarRegistro(Object o) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarRegistro(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object consultarRegistro() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
