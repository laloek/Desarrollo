/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.test;

import java.util.ArrayList;
import java.util.List;
import mx.desarrollo.DAO.ProfesorDAO;
import mx.desarrollo.entidad.Profesor;

/**
 *
 * @author lukki
 */
public class test {
    public static void main(String[] args) {
        List<Profesor> listaUsuarios = new ArrayList();
        ProfesorDAO usuarioDao = new ProfesorDAO();
        listaUsuarios = usuarioDao.findAll();
        
        for(Profesor us : listaUsuarios){
            System.out.println("Nombre: " + us.getNombre());
        }
    }
}
