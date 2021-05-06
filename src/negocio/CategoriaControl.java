/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import datos.CategoriaDAO;
import entidades.Categoria;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paulp
 */
public class CategoriaControl {
    
    private CategoriaDAO DATOS;
    private Categoria obj;
    
    public CategoriaControl() {
        DATOS = new CategoriaDAO();
        obj = new Categoria();
    }
    
    public String insertar(String categoria_nombre, String departamento_nombre) {
        if (DATOS.existe(categoria_nombre)) {
            return "el registro ya existe";
        } else {
            obj.setNombre(categoria_nombre);
            obj.setDepartamento_nombre(departamento_nombre);
            System.out.println(categoria_nombre);
            if (DATOS.insertar(obj)) {
                return "OK";
            } else {
                return "error en el registro";
            }
        }
    }
    
    public String actualizar(int id, String nombre, String nombreAnt) {
        if (nombre.equals(nombreAnt)) { //verificamos que es igual a un nombre anterior no cambia 
            obj.setId(id);
            obj.setNombre(nombre);
            if (DATOS.actualizar(obj)) {
                return "OK";
            } else {
                return "error en la actualizacion";
            }
        } else {
            if (DATOS.existe(nombre)) {// si no coincide con el nombre y anterior y quiere cambiar verificamos si alguno existe
                return "el registro ya existe";
            } else {
                obj.setId(id);
                obj.setNombre(nombre);
                if (DATOS.actualizar(obj)) { //si no actuzalizamos
                    return "OK";
                } else {
                    return "error en la actualizacion";
                }
            }
        }
    }
    
    public String eliminar(int id) {
        if (DATOS.eliminar(id)) {
            return "OK";
        } else {
            return "no se puede Eliminar";
        }
    }
}
