/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import dataBase.Conexion;
import datos.interfaces.CrudSimpleInterface;
import entidades.Departamento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author paulp
 */
public class DepartamentoDAO implements CrudSimpleInterface<Departamento>{

    private final Conexion CN;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    
    public DepartamentoDAO(){
        CN = Conexion.getInstancia();
    }
    
    @Override
    public List<Departamento> listar(String texto) {
        List<Departamento> registros = new ArrayList();
        try {
            ps = CN.conectar().prepareStatement("SELECT * FROM departamento WHERE nombre LIKE ?");
            ps.setString(1, "%" + texto + "%");

            rs = ps.executeQuery();

            while (rs.next()) {
                registros.add(new Departamento(rs.getInt(1), rs.getString(2), rs.getInt(3)));
            }

            ps.close();
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            ps = null;
            rs = null;
            CN.desconectar();
        }
        return registros;
    }
    
    public List<Departamento> listarDepartamentoCategoria(String texto) {
        List<Departamento> registros = new ArrayList();
        try {
            ps = CN.conectar().prepareStatement("SELECT d.id, d.nombre, d.categoria_id, c.nombre FROM departamento d INNER JOIN categoria c ON d.categoria_id = c.id WHERE d.nombre LIKE ? ORDER BY d.nombre ASC");
            ps.setString(1, "%" + texto + "%");

            rs = ps.executeQuery();

            while (rs.next()) {
                registros.add(new Departamento(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4)));
            }
            
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            ps = null;
            rs = null;
            CN.desconectar();
        }
        return registros;
    }

    @Override
    public boolean insertar(Departamento obj) {
        resp = false;
        try {
            ps = CN.conectar().prepareStatement("INSERT INTO departamento (nombre, categoria_id) VALUES(?,?)");
            ps.setString(1, obj.getNombre());
            ps.setInt(2, obj.getCategoria_id());

            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            ps = null;
            CN.desconectar();
        }
        return resp;
    }

    @Override
    public boolean actualizar(Departamento obj) {
        resp = false;
        try {
            ps = CN.conectar().prepareStatement("UPDATE departamento SET nombre = ?, categoria_id = ? WHERE id = ?");
            ps.setString(1, obj.getNombre());
            ps.setInt(2, obj.getCategoria_id());
            ps.setInt(3, obj.getId());

            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            ps = null;
            CN.desconectar();
        }
        return resp;
    }

    @Override
    public boolean eliminar(int id) {
        resp = false;
        try{
        ps = CN.conectar().prepareStatement("DELETE FROM departamento WHERE id = ?");
        ps.setInt(1, id);
        
        if(ps.executeUpdate() > 0){
            resp = true;
        }
        
        ps.close();
        
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }finally{
            ps = null;
            CN.desconectar();
        }
        return resp;
    }

    @Override
    public int total() {
        int totalRegistros = 0;
        try{
        ps = CN.conectar().prepareStatement("SELECT COUNT(id) FROM departamento");
        
        rs = ps.executeQuery();
        
        while(rs.next()){
            totalRegistros = rs.getInt("COUNT(id)");
        }
        
        ps.close();
        rs.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }finally{
            rs = null;
            ps = null;
            CN.desconectar();
        }
        return totalRegistros;
    }

    @Override
    public boolean existe(String texto) {
        resp = false;
        try{
        ps = CN.conectar().prepareStatement("SELECT nombre FROM departamento WHERE nombre = ?");
        ps.setString(1, texto);
        
        rs = ps.executeQuery();
        rs.last(); //nos ubicamos en el ultimo registro
        if(rs.getRow() > 0){ //recorremos las filas
            resp = true;
        }
        
        ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }finally{
            rs = null;
            ps = null;
            CN.desconectar();
        }
        return resp;
    }
    
}
