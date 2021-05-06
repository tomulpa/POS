/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import datos.DepartamentoDAO;
import entidades.Departamento;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author paulp
 */
public class DepartamentoControl {
    private final DepartamentoDAO DATOS;
    private Departamento obj;
    private DefaultTableModel modeloTabla;
    private int registrosMostrados;
    
    public DepartamentoControl(){
        DATOS = new DepartamentoDAO();
        obj = new Departamento();
        this.registrosMostrados = 0;
    }
    
    public DefaultTableModel listar(String texto) {
        List<Departamento> lista = new ArrayList();
        lista.addAll(DATOS.listar(texto));

        String[] titulos = {"id", "Nombre", "categoria_id"};
        this.modeloTabla = new DefaultTableModel(null, titulos){
            boolean[] canEdit = new boolean[]{
                    false, false, false
            };
            
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        modeloTabla.setRowCount(0);

        String[] registro = new String[3];

        this.registrosMostrados = 0;
        for (Departamento item : lista) {
            registro[0] = String.valueOf(item.getId());
            registro[1] = item.getNombre();
            registro[2] = String.valueOf(item.getCategoria_id());

            modeloTabla.addRow(registro);
            this.registrosMostrados = this.registrosMostrados + 1;
        }
        
        return modeloTabla;
    }
    
    public DefaultTableModel listarDepartamentoCategorias(String texto) {
        List<Departamento> lista = new ArrayList();
        lista.addAll(DATOS.listarDepartamentoCategoria(texto));

        String[] titulos = {"id", "Departamento", "categoria_id", "categoria"};
        this.modeloTabla = new DefaultTableModel(null, titulos){
            boolean[] canEdit = new boolean[]{
                    false, false, false, false
            };
            
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        modeloTabla.setRowCount(0);
        String[] registro = new String[4];

        this.registrosMostrados = 0;
        for (Departamento item : lista) {
            registro[0] = String.valueOf(item.getId());
            registro[1] = item.getNombre();
            registro[2] = String.valueOf(item.getCategoria_id());
            registro[3] = item.getCategoria_nombre();
            
            modeloTabla.addRow(registro);
            this.registrosMostrados = this.registrosMostrados + 1;
        }
        return modeloTabla;
    }
    
    public String insertar(String nombre, int id) {
        if (DATOS.existe(nombre)) {
            return "el registro ya existe";
        } else {
            obj.setNombre(nombre);
            obj.setCategoria_id(id);
            if (DATOS.insertar(obj)) {
                return "OK";
            } else {
                return "error en el registro";
            }
        }
    }
    
    public String actualizar(int id, String nombre, String nombreAnt, int categoria_id) {
        if (nombre.equals(nombreAnt)) { //verificamos que es igual a un nombre anterior no cambia 
            obj.setId(id);
            obj.setNombre(nombre);
            obj.setCategoria_id(categoria_id);
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
                obj.setCategoria_id(categoria_id);

                if (DATOS.actualizar(obj)) { //si no actuzalizamos
                    return "OK";
                } else {
                    return "error en la actualizacion";
                }
            }
        }
    }
    
    public int total() {
        return DATOS.total();
    }
    
    public int totalMostrados() {
        return this.registrosMostrados;
    }
    
    public String eliminar(int id) {
        if (DATOS.eliminar(id)) {
            return "OK";
        } else {
            return "no se puede Eliminar";
        }
    }
}
