/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import com.mysql.jdbc.Statement;
import dataBase.Conexion;
import entidades.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author paulp
 */
public class CategoriaDAO {
    
    private final Conexion CN;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    
    public CategoriaDAO() {
        CN = Conexion.getInstancia();
    }
    
    public boolean insertar(Categoria obj) {
        resp = false;
        Connection conn = null;
        try {
            conn = CN.conectar();
            conn.setAutoCommit(false);

            String sqlInsertCategoria = "INSERT INTO categoria (nombre) VALUES(?)";
            ps = conn.prepareStatement(sqlInsertCategoria, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, obj.getNombre());

            int filasAfectadas = ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            int idGenerado = 0;

            if (rs.next()) {
                idGenerado = rs.getInt(1);
            }

            if (filasAfectadas == 1) {
                String sqlInsertDepartamento = "INSERT INTO departamento (nombre, categoria_id) VALUES (?,?)";
                ps = conn.prepareStatement(sqlInsertDepartamento);
                    ps.setString(1, obj.getDepartamento_nombre());
                    ps.setInt(2, idGenerado);
                    
                    resp = ps.executeUpdate() > 0;
                
                conn.commit();
            } else {
                conn.rollback();
            }

        } catch (SQLException ex) {
            try {
                if(conn != null){
                    conn.rollback();
                }
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (SQLException ex1) {
                Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                if(rs != null) rs.close();
                if(ps != null) ps.close();
                if(conn != null) conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return resp;
    }
    
    public boolean insertarCategoria(Categoria obj) {
        resp = false;
        try {
            ps = CN.conectar().prepareStatement("INSERT INTO categoria (nombre) VALUES(?)");
            ps.setString(1, obj.getNombre());

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
    
    public boolean actualizar(Categoria obj) {
        resp = false;
        try {
            ps = CN.conectar().prepareStatement("UPDATE categoria SET nombre = ? WHERE id = ?");
            ps.setString(1, obj.getNombre());
            ps.setInt(2, obj.getId());

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
    
    public boolean existe(String texto) {
        resp = false;
        try{
        ps = CN.conectar().prepareStatement("SELECT nombre FROM categoria WHERE nombre = ?");
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
    
    public boolean eliminar(int id) {
        resp = false;
        try{
        ps = CN.conectar().prepareStatement("DELETE FROM categoria WHERE id = ?");
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
}
