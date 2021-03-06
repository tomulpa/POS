/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.departamentosCategoriasMantenimiento;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import negocio.CategoriaControl;
import negocio.DepartamentoControl;
import static presentacion.departamentosCategoriasMantenimiento.FrmSeleccionarDepartamento.btnListar;

/**
 *
 * @author paulp
 */
public class FrmDepartamentoCategoria extends javax.swing.JInternalFrame {

    private DepartamentoControl CONTROL;
    private CategoriaControl CONTROLC;
    public static String departamento;
    public static String categoria;
    private String accion;
    /**
     * Creates new form FrmDepartamentoCategoria
     */
    public FrmDepartamentoCategoria() {
        initComponents();
        CONTROL = new DepartamentoControl();
        CONTROLC = new CategoriaControl();
        this.listar("");
    }
    
    public void listar(String texto){
        tablaListado.setModel(this.CONTROL.listarDepartamentoCategorias(texto));
        this.ocultarColumnas();
    }

    private void ocultarColumnas(){
        tablaListado.getColumnModel().getColumn(0).setMaxWidth(0);
        tablaListado.getColumnModel().getColumn(0).setMinWidth(0);
        tablaListado.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        tablaListado.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        tablaListado.getColumnModel().getColumn(2).setMaxWidth(0);
        tablaListado.getColumnModel().getColumn(2).setMinWidth(0);
        tablaListado.getTableHeader().getColumnModel().getColumn(2).setMaxWidth(0);
        tablaListado.getTableHeader().getColumnModel().getColumn(2).setMinWidth(0);
    }
    
    public void mensajeError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Sistema", JOptionPane.ERROR_MESSAGE);
    }

    public void mensajeOk(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Sistema", JOptionPane.INFORMATION_MESSAGE);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaListado = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setClosable(true);
        setTitle("Departamentos y Categorias");
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(617, 130));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        btnNuevo.setBackground(new java.awt.Color(204, 255, 204));
        btnNuevo.setText("Agregar(F3)");
        btnNuevo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnNuevo.setPreferredSize(new java.awt.Dimension(90, 23));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        btnNuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnNuevoKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 10);
        jPanel2.add(btnNuevo, gridBagConstraints);

        btnEditar.setBackground(new java.awt.Color(255, 255, 204));
        btnEditar.setText("Editar(F4)");
        btnEditar.setPreferredSize(new java.awt.Dimension(90, 23));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        btnEditar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnEditarKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 10);
        jPanel2.add(btnEditar, gridBagConstraints);

        btnListar.setBackground(new java.awt.Color(204, 255, 255));
        btnListar.setText("Listar(F5)");
        btnListar.setPreferredSize(new java.awt.Dimension(90, 23));
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        btnListar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnListarKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 10);
        jPanel2.add(btnListar, gridBagConstraints);

        btnEliminar.setBackground(new java.awt.Color(255, 153, 153));
        btnEliminar.setText("Eliminar(F6)");
        btnEliminar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEliminar.setPreferredSize(new java.awt.Dimension(90, 23));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        btnEliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnEliminarKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanel2.add(btnEliminar, gridBagConstraints);

        jLabel1.setText("Buscar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel2.add(jLabel1, gridBagConstraints);

        txtBuscar.setPreferredSize(new java.awt.Dimension(270, 20));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel2.add(txtBuscar, gridBagConstraints);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel2.add(btnBuscar, gridBagConstraints);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setLayout(new java.awt.BorderLayout());

        tablaListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaListado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaListadoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaListado);

        jPanel3.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        accion = "insertar";
        Frame f = JOptionPane.getFrameForComponent(this);
            FrmNuevoDepartamentoCategoria frm = new FrmNuevoDepartamentoCategoria(f, true);
            frm.datos(0, "", 0, "", accion);
            frm.setLocationRelativeTo(null);
            frm.setVisible(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        this.listar("");
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        accion = "editar";
        if (tablaListado.getSelectedRowCount() == 1) {
            int departamento_id = Integer.parseInt(String.valueOf(tablaListado.getValueAt(tablaListado.getSelectedRow(), 0)));
            String departamento_nombre = String.valueOf(tablaListado.getValueAt(tablaListado.getSelectedRow(), 1));
            int categoria_id = Integer.parseInt(String.valueOf(tablaListado.getValueAt(tablaListado.getSelectedRow(), 2)));
            String categoria_nombre = String.valueOf(tablaListado.getValueAt(tablaListado.getSelectedRow(), 3));

            Frame f = JOptionPane.getFrameForComponent(this);
            FrmNuevoDepartamentoCategoria frm = new FrmNuevoDepartamentoCategoria(f, true);
            frm.datos(departamento_id, departamento_nombre, categoria_id, categoria_nombre, accion);
            frm.setLocationRelativeTo(null);
            frm.setVisible(true);
        } else {
            this.mensajeError("debes seleccionar un registro");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.listar(txtBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnNuevoKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_F3){
            btnNuevo.doClick();
        }
    }//GEN-LAST:event_btnNuevoKeyReleased

    private void btnEditarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEditarKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_F4){
            btnEditar.doClick();
        }
    }//GEN-LAST:event_btnEditarKeyReleased

    private void btnListarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnListarKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_F5){
            btnListar.doClick();
        }
    }//GEN-LAST:event_btnListarKeyReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (tablaListado.getSelectedRowCount() == 1) {
            int categoria_id = Integer.parseInt(String.valueOf(tablaListado.getValueAt(tablaListado.getSelectedRow(), 2)));
            String categoria_nombre = String.valueOf(tablaListado.getValueAt(tablaListado.getSelectedRow(), 3));
            int departamento_id = Integer.parseInt(String.valueOf(tablaListado.getValueAt(tablaListado.getSelectedRow(), 0)));
            if (JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar " + categoria_nombre + "?", "Elimiar Departamento", JOptionPane.YES_NO_OPTION) == 0) {
                String resp;
                if(categoria_id == 1){
                    resp = this.CONTROL.eliminar(departamento_id);
                } else {
                    resp = this.CONTROLC.eliminar(categoria_id);
                }
                
                if (resp.equals("OK")) {
                    this.mensajeOk("La categoria se ha eliminado");
                } else {
                    this.mensajeError("No se pudo eliminar la categoria");
                }
            }
        } else {
            this.mensajeError("debes seleccionar un registro");
        }
        btnListar.doClick();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEliminarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEliminarKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_F6){
            btnEliminar.doClick();
        }
    }//GEN-LAST:event_btnEliminarKeyReleased

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnBuscar.doClick();
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tablaListadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaListadoMouseClicked
        if(evt.getClickCount() ==2){
            btnEditar.doClick();
        }
    }//GEN-LAST:event_tablaListadoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    protected static javax.swing.JButton btnListar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaListado;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
