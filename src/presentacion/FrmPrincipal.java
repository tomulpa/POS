/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import presentacion.departamentosCategoriasMantenimiento.FrmDepartamentoCategoria;


/**
 *
 * @author paulp
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        //this.cargarOpcionesMenu();
    }
    
    /*private void cargarOpcionesMenu(){
        if(negocio.Variables.rolNombre.equals("Administrador")){
            menuOperaciones.setEnabled(true);
            menuConsultas.setEnabled(true);;
            menuProcesos.setEnabled(true);;
            menuReportes.setEnabled(true);;
            menuEstadisticas.setEnabled(true);;
            menuConfiguracion.setEnabled(true);;
            menuInfo.setEnabled(true);
        } else if (negocio.Variables.rolNombre.equals("Almacenero")){
            menuOperaciones.setEnabled(true);
            menuConsultas.setEnabled(false);;
            menuProcesos.setEnabled(true);;
            menuReportes.setEnabled(false);;
            menuEstadisticas.setEnabled(true);;
            menuConfiguracion.setEnabled(true);;
            menuInfo.setEnabled(false);
        } else if(negocio.Variables.rolNombre.equals("Vendedor")){
            menuOperaciones.setEnabled(true);
            menuConsultas.setEnabled(false);;
            menuProcesos.setEnabled(false);;
            menuReportes.setEnabled(false);;
            menuEstadisticas.setEnabled(false);;
            menuConfiguracion.setEnabled(true);;
            menuInfo.setEnabled(true);
        } else {
            menuOperaciones.setEnabled(false);
            menuConsultas.setEnabled(false);;
            menuProcesos.setEnabled(false);;
            menuReportes.setEnabled(false);;
            menuEstadisticas.setEnabled(false);;
            menuConfiguracion.setEnabled(false);;
            menuInfo.setEnabled(false);
        }
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.setColor(Color.white);
                g.fillRect(0,0, getWidth(), getHeight());
            }
        };
        menuBar = new javax.swing.JMenuBar();
        menuOperaciones = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        itemCompras = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        itemPedidos = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        menuConsultas = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenuItem39 = new javax.swing.JMenuItem();
        jMenuItem40 = new javax.swing.JMenuItem();
        menuProcesos = new javax.swing.JMenu();
        jMenuItem41 = new javax.swing.JMenuItem();
        jMenuItem42 = new javax.swing.JMenuItem();
        jMenuItem43 = new javax.swing.JMenuItem();
        jMenuItem44 = new javax.swing.JMenuItem();
        jMenuItem45 = new javax.swing.JMenuItem();
        jMenuItem46 = new javax.swing.JMenuItem();
        jMenuItem47 = new javax.swing.JMenuItem();
        jMenuItem48 = new javax.swing.JMenuItem();
        jMenuItem49 = new javax.swing.JMenuItem();
        jMenuItem50 = new javax.swing.JMenuItem();
        jMenuItem51 = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenu();
        jMenuItem52 = new javax.swing.JMenuItem();
        jMenuItem53 = new javax.swing.JMenuItem();
        jMenuItem54 = new javax.swing.JMenuItem();
        jMenuItem55 = new javax.swing.JMenuItem();
        jMenuItem56 = new javax.swing.JMenuItem();
        jMenuItem57 = new javax.swing.JMenuItem();
        jMenuItem58 = new javax.swing.JMenuItem();
        jMenuItem59 = new javax.swing.JMenuItem();
        jMenuItem60 = new javax.swing.JMenuItem();
        jMenuItem61 = new javax.swing.JMenuItem();
        jMenuItem62 = new javax.swing.JMenuItem();
        jMenuItem63 = new javax.swing.JMenuItem();
        jMenuItem64 = new javax.swing.JMenuItem();
        jMenuItem65 = new javax.swing.JMenuItem();
        jMenuItem66 = new javax.swing.JMenuItem();
        jMenuItem67 = new javax.swing.JMenuItem();
        jMenuItem68 = new javax.swing.JMenuItem();
        menuEstadisticas = new javax.swing.JMenu();
        jMenuItem69 = new javax.swing.JMenuItem();
        jMenuItem70 = new javax.swing.JMenuItem();
        jMenuItem75 = new javax.swing.JMenuItem();
        jMenuItem71 = new javax.swing.JMenuItem();
        jMenuItem72 = new javax.swing.JMenuItem();
        jMenuItem73 = new javax.swing.JMenuItem();
        jMenuItem74 = new javax.swing.JMenuItem();
        menuConfiguracion = new javax.swing.JMenu();
        itemEmpresa = new javax.swing.JMenuItem();
        jMenuItem78 = new javax.swing.JMenuItem();
        jMenuItem79 = new javax.swing.JMenuItem();
        jMenuItem80 = new javax.swing.JMenuItem();
        jMenuItem81 = new javax.swing.JMenuItem();
        jMenuItem82 = new javax.swing.JMenuItem();
        jMenuItem83 = new javax.swing.JMenuItem();
        jMenuItem84 = new javax.swing.JMenuItem();
        jMenuItem85 = new javax.swing.JMenuItem();
        jMenuItem86 = new javax.swing.JMenuItem();
        jMenuItem87 = new javax.swing.JMenuItem();
        jMenuItem88 = new javax.swing.JMenuItem();
        jMenuItem89 = new javax.swing.JMenuItem();
        jMenuItem90 = new javax.swing.JMenuItem();
        itemCategorias = new javax.swing.JMenuItem();
        jMenuItem92 = new javax.swing.JMenuItem();
        jMenuItem93 = new javax.swing.JMenuItem();
        menuInfo = new javax.swing.JMenu();
        menuUsuario = new javax.swing.JMenu();
        itemCambiarUsuario = new javax.swing.JMenuItem();
        itemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Miscelanea Polo");
        setIconImages(getIconImages());
        setMinimumSize(new java.awt.Dimension(960, 540));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new java.awt.CardLayout());
        getContentPane().add(escritorio, "card2");

        menuOperaciones.setText("Operaciones");

        jMenuItem5.setText("Ventas");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuOperaciones.add(jMenuItem5);

        jMenuItem6.setText("Devoluciones");
        menuOperaciones.add(jMenuItem6);

        jMenuItem7.setText("Traspasos Sal");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        menuOperaciones.add(jMenuItem7);

        itemCompras.setText("Compras");
        itemCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemComprasActionPerformed(evt);
            }
        });
        menuOperaciones.add(itemCompras);

        jMenuItem9.setText("Nota de Credito");
        menuOperaciones.add(jMenuItem9);

        jMenuItem1.setText("Traspasos Ent");
        menuOperaciones.add(jMenuItem1);

        jMenuItem2.setText("Factura");
        menuOperaciones.add(jMenuItem2);

        jMenuItem3.setText("Factura CFDI");
        menuOperaciones.add(jMenuItem3);

        jMenuItem4.setText("Cotizacion");
        menuOperaciones.add(jMenuItem4);

        itemPedidos.setText("Pedidos");
        itemPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPedidosActionPerformed(evt);
            }
        });
        menuOperaciones.add(itemPedidos);

        jMenuItem11.setText("Transpasos");
        menuOperaciones.add(jMenuItem11);

        jMenuItem12.setText("Corte de caja");
        menuOperaciones.add(jMenuItem12);

        jMenuItem13.setText("Articulos");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        menuOperaciones.add(jMenuItem13);

        jMenuItem14.setText("Paquetes");
        menuOperaciones.add(jMenuItem14);

        jMenuItem15.setText("Clientes");
        menuOperaciones.add(jMenuItem15);

        jMenuItem16.setText("Proveedores");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        menuOperaciones.add(jMenuItem16);

        jMenuItem17.setText("Prearticulos");
        menuOperaciones.add(jMenuItem17);

        jMenuItem18.setText("Inv. Inicial ");
        menuOperaciones.add(jMenuItem18);

        jMenuItem19.setText("Ajuste Inv.");
        menuOperaciones.add(jMenuItem19);

        jMenuItem20.setText("Lotes / series");
        menuOperaciones.add(jMenuItem20);

        menuBar.add(menuOperaciones);

        menuConsultas.setText("Consultas");

        jMenuItem21.setText("Ventas (Salidas)");
        menuConsultas.add(jMenuItem21);

        jMenuItem22.setText("Devoluciones");
        menuConsultas.add(jMenuItem22);

        jMenuItem23.setText("Traspasos Sal");
        menuConsultas.add(jMenuItem23);

        jMenuItem24.setText("Compras");
        menuConsultas.add(jMenuItem24);

        jMenuItem25.setText("Notas de Credito");
        menuConsultas.add(jMenuItem25);

        jMenuItem26.setText("Traspasos Ent");
        menuConsultas.add(jMenuItem26);

        jMenuItem27.setText("Clientes");
        menuConsultas.add(jMenuItem27);

        jMenuItem28.setText("Proveedores");
        menuConsultas.add(jMenuItem28);

        jMenuItem29.setText("Pagos CFDI");
        menuConsultas.add(jMenuItem29);

        jMenuItem30.setText("Traspasos");
        menuConsultas.add(jMenuItem30);

        jMenuItem31.setText("Cancelacion");
        menuConsultas.add(jMenuItem31);

        jMenuItem32.setText("Movimientos");
        menuConsultas.add(jMenuItem32);

        jMenuItem33.setText("Estado (Cajas)");
        menuConsultas.add(jMenuItem33);

        jMenuItem34.setText("Cortes de Caja");
        menuConsultas.add(jMenuItem34);

        jMenuItem35.setText("Pedidos");
        menuConsultas.add(jMenuItem35);

        jMenuItem36.setText("Checador");
        menuConsultas.add(jMenuItem36);

        jMenuItem37.setText("Inv. Inicial");
        menuConsultas.add(jMenuItem37);

        jMenuItem38.setText("Ajuste Inv.");
        menuConsultas.add(jMenuItem38);

        jMenuItem39.setText("Lotes");
        menuConsultas.add(jMenuItem39);

        jMenuItem40.setText("Articulos");
        menuConsultas.add(jMenuItem40);

        menuBar.add(menuConsultas);

        menuProcesos.setText("Procesos");

        jMenuItem41.setText("Imagenes");
        menuProcesos.add(jMenuItem41);

        jMenuItem42.setText("Promociones");
        menuProcesos.add(jMenuItem42);

        jMenuItem43.setText("Respaldos");
        menuProcesos.add(jMenuItem43);

        jMenuItem44.setText("Etiquetas");
        menuProcesos.add(jMenuItem44);

        jMenuItem45.setText("Categoria");
        jMenuItem45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem45ActionPerformed(evt);
            }
        });
        menuProcesos.add(jMenuItem45);

        jMenuItem46.setText("tags");
        menuProcesos.add(jMenuItem46);

        jMenuItem47.setText("Localizacion");
        menuProcesos.add(jMenuItem47);

        jMenuItem48.setText("Domicilios");
        menuProcesos.add(jMenuItem48);

        jMenuItem49.setText("Claves Sat");
        menuProcesos.add(jMenuItem49);

        jMenuItem50.setText("Importar (Datos)");
        menuProcesos.add(jMenuItem50);

        jMenuItem51.setText("Exportar (Datos)");
        menuProcesos.add(jMenuItem51);

        menuBar.add(menuProcesos);

        menuReportes.setText("Reportes");

        jMenuItem52.setText("Global (Resumen)");
        menuReportes.add(jMenuItem52);

        jMenuItem53.setText("Ventas (Salidas)");
        menuReportes.add(jMenuItem53);

        jMenuItem54.setText("Devoluciones (Salidas)");
        menuReportes.add(jMenuItem54);

        jMenuItem55.setText("Utilidad (Finanzas)");
        menuReportes.add(jMenuItem55);

        jMenuItem56.setText("Compras (Entradas)");
        menuReportes.add(jMenuItem56);

        jMenuItem57.setText("Notas de Credito (Entradas)");
        menuReportes.add(jMenuItem57);

        jMenuItem58.setText("Clientes (Creditos)");
        menuReportes.add(jMenuItem58);

        jMenuItem59.setText("Proveedores (Creditos)");
        jMenuItem59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem59ActionPerformed(evt);
            }
        });
        menuReportes.add(jMenuItem59);

        jMenuItem60.setText("Movimientos (Caja)");
        menuReportes.add(jMenuItem60);

        jMenuItem61.setText("Articulos");
        menuReportes.add(jMenuItem61);

        jMenuItem62.setText("Clientes (Catalogos)");
        menuReportes.add(jMenuItem62);

        jMenuItem63.setText("Proveedores Catalogos");
        jMenuItem63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem63ActionPerformed(evt);
            }
        });
        menuReportes.add(jMenuItem63);

        jMenuItem64.setText("Cotizacion (Especiales)");
        menuReportes.add(jMenuItem64);

        jMenuItem65.setText("Farmacia (Especiales)");
        jMenuItem65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem65ActionPerformed(evt);
            }
        });
        menuReportes.add(jMenuItem65);

        jMenuItem66.setText("Monedero (Especiales)");
        menuReportes.add(jMenuItem66);

        jMenuItem67.setText("Contador (Especiales)");
        menuReportes.add(jMenuItem67);

        jMenuItem68.setText("Configuracion (Especiales)");
        menuReportes.add(jMenuItem68);

        menuBar.add(menuReportes);

        menuEstadisticas.setText("Estadisticas");

        jMenuItem69.setText("Dashboard (general)");
        menuEstadisticas.add(jMenuItem69);

        jMenuItem70.setText("Ventas (Salidas)");
        menuEstadisticas.add(jMenuItem70);

        jMenuItem75.setText("Compras (Entradas)");
        menuEstadisticas.add(jMenuItem75);

        jMenuItem71.setText("Utilidad (Finanzas)");
        menuEstadisticas.add(jMenuItem71);

        jMenuItem72.setText("Articulos (Catalogos)");
        menuEstadisticas.add(jMenuItem72);

        jMenuItem73.setText("Clientes (Creditos)");
        menuEstadisticas.add(jMenuItem73);

        jMenuItem74.setText("Proveedores (Creditos)");
        menuEstadisticas.add(jMenuItem74);

        menuBar.add(menuEstadisticas);

        menuConfiguracion.setText("Configuracion");

        itemEmpresa.setText("Empresa (Datos)");
        itemEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEmpresaActionPerformed(evt);
            }
        });
        menuConfiguracion.add(itemEmpresa);

        jMenuItem78.setText("Roles ");
        jMenuItem78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem78ActionPerformed(evt);
            }
        });
        menuConfiguracion.add(jMenuItem78);

        jMenuItem79.setText("Usuarios(Accesos)");
        jMenuItem79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem79ActionPerformed(evt);
            }
        });
        menuConfiguracion.add(jMenuItem79);

        jMenuItem80.setText("Operatividad");
        menuConfiguracion.add(jMenuItem80);

        jMenuItem81.setText("Impresoras");
        menuConfiguracion.add(jMenuItem81);

        jMenuItem82.setText("Perifericos");
        menuConfiguracion.add(jMenuItem82);

        jMenuItem83.setText("Tickets");
        menuConfiguracion.add(jMenuItem83);

        jMenuItem84.setText("Formatos");
        menuConfiguracion.add(jMenuItem84);

        jMenuItem85.setText("Etiquetas");
        menuConfiguracion.add(jMenuItem85);

        jMenuItem86.setText("CFDI Series");
        menuConfiguracion.add(jMenuItem86);

        jMenuItem87.setText("CFDI Sellos");
        menuConfiguracion.add(jMenuItem87);

        jMenuItem88.setText("Complementos");
        menuConfiguracion.add(jMenuItem88);

        jMenuItem89.setText("Moneda");
        menuConfiguracion.add(jMenuItem89);

        jMenuItem90.setText("Impuestos");
        menuConfiguracion.add(jMenuItem90);

        itemCategorias.setText("Categorias");
        itemCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCategoriasActionPerformed(evt);
            }
        });
        menuConfiguracion.add(itemCategorias);

        jMenuItem92.setText("Unidades");
        menuConfiguracion.add(jMenuItem92);

        jMenuItem93.setText("Tags");
        menuConfiguracion.add(jMenuItem93);

        menuBar.add(menuConfiguracion);

        menuInfo.setText("Info");
        menuBar.add(menuInfo);

        menuUsuario.setText("Usuario");

        itemCambiarUsuario.setText("Cambiar de Usuario");
        itemCambiarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCambiarUsuarioActionPerformed(evt);
            }
        });
        menuUsuario.add(itemCambiarUsuario);

        itemSalir.setText("Salir");
        itemSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemSalirMouseClicked(evt);
            }
        });
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        menuUsuario.add(itemSalir);

        menuBar.add(menuUsuario);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem45ActionPerformed

    private void jMenuItem59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem59ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem59ActionPerformed

    private void jMenuItem63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem63ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem63ActionPerformed

    private void jMenuItem65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem65ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem65ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void itemCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCategoriasActionPerformed
        FrmDepartamentoCategoria frm = new FrmDepartamentoCategoria();
        escritorio.add(frm);
        frm.setSize(escritorio.getWidth(), escritorio.getHeight());
        frm.setVisible(true);
    }//GEN-LAST:event_itemCategoriasActionPerformed

    private void jMenuItem78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem78ActionPerformed
        
    }//GEN-LAST:event_jMenuItem78ActionPerformed

    private void jMenuItem79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem79ActionPerformed
       
    }//GEN-LAST:event_jMenuItem79ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void itemCambiarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCambiarUsuarioActionPerformed
        
    }//GEN-LAST:event_itemCambiarUsuarioActionPerformed

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        
    }//GEN-LAST:event_itemSalirActionPerformed

    private void itemSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_itemSalirMouseClicked

    private void itemEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEmpresaActionPerformed
        
    }//GEN-LAST:event_itemEmpresaActionPerformed

    private void itemComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemComprasActionPerformed
        
    }//GEN-LAST:event_itemComprasActionPerformed

    private void itemPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPedidosActionPerformed
        
    }//GEN-LAST:event_itemPedidosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
        
       
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem itemCambiarUsuario;
    private javax.swing.JMenuItem itemCategorias;
    private javax.swing.JMenuItem itemCompras;
    private javax.swing.JMenuItem itemEmpresa;
    private javax.swing.JMenuItem itemPedidos;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem41;
    private javax.swing.JMenuItem jMenuItem42;
    private javax.swing.JMenuItem jMenuItem43;
    private javax.swing.JMenuItem jMenuItem44;
    private javax.swing.JMenuItem jMenuItem45;
    private javax.swing.JMenuItem jMenuItem46;
    private javax.swing.JMenuItem jMenuItem47;
    private javax.swing.JMenuItem jMenuItem48;
    private javax.swing.JMenuItem jMenuItem49;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem50;
    private javax.swing.JMenuItem jMenuItem51;
    private javax.swing.JMenuItem jMenuItem52;
    private javax.swing.JMenuItem jMenuItem53;
    private javax.swing.JMenuItem jMenuItem54;
    private javax.swing.JMenuItem jMenuItem55;
    private javax.swing.JMenuItem jMenuItem56;
    private javax.swing.JMenuItem jMenuItem57;
    private javax.swing.JMenuItem jMenuItem58;
    private javax.swing.JMenuItem jMenuItem59;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem60;
    private javax.swing.JMenuItem jMenuItem61;
    private javax.swing.JMenuItem jMenuItem62;
    private javax.swing.JMenuItem jMenuItem63;
    private javax.swing.JMenuItem jMenuItem64;
    private javax.swing.JMenuItem jMenuItem65;
    private javax.swing.JMenuItem jMenuItem66;
    private javax.swing.JMenuItem jMenuItem67;
    private javax.swing.JMenuItem jMenuItem68;
    private javax.swing.JMenuItem jMenuItem69;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem70;
    private javax.swing.JMenuItem jMenuItem71;
    private javax.swing.JMenuItem jMenuItem72;
    private javax.swing.JMenuItem jMenuItem73;
    private javax.swing.JMenuItem jMenuItem74;
    private javax.swing.JMenuItem jMenuItem75;
    private javax.swing.JMenuItem jMenuItem78;
    private javax.swing.JMenuItem jMenuItem79;
    private javax.swing.JMenuItem jMenuItem80;
    private javax.swing.JMenuItem jMenuItem81;
    private javax.swing.JMenuItem jMenuItem82;
    private javax.swing.JMenuItem jMenuItem83;
    private javax.swing.JMenuItem jMenuItem84;
    private javax.swing.JMenuItem jMenuItem85;
    private javax.swing.JMenuItem jMenuItem86;
    private javax.swing.JMenuItem jMenuItem87;
    private javax.swing.JMenuItem jMenuItem88;
    private javax.swing.JMenuItem jMenuItem89;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItem90;
    private javax.swing.JMenuItem jMenuItem92;
    private javax.swing.JMenuItem jMenuItem93;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuConfiguracion;
    private javax.swing.JMenu menuConsultas;
    private javax.swing.JMenu menuEstadisticas;
    private javax.swing.JMenu menuInfo;
    private javax.swing.JMenu menuOperaciones;
    private javax.swing.JMenu menuProcesos;
    private javax.swing.JMenu menuReportes;
    private javax.swing.JMenu menuUsuario;
    // End of variables declaration//GEN-END:variables

}
