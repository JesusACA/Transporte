/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.interfaces;

/**
 *
 * @author Leteo
 */
public interface catalogo {
    public boolean agregarRegistro(Object o)throws Exception;
    public boolean modificarRegistro(Object o)throws Exception;
    public boolean eliminarRegistro(int id)throws Exception;
    public Object consultarRegistro()throws Exception;
}
