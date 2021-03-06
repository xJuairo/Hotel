/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author xjlop
 */
public class AdminAddHab extends javax.swing.JFrame {

    /**
     * Creates new form AdminaAddHab
     */
    Conexion cc = new Conexion();
    Connection cn = cc.conexion();
    PreparedStatement ps;    
    
    public AdminAddHab() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NumH = new javax.swing.JTextField();
        THab = new javax.swing.JSpinner();
        Ruta = new javax.swing.JTextField();
        Agregar = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NumH.setText("NumH");
        NumH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NumHMouseClicked(evt);
            }
        });
        getContentPane().add(NumH, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 130, -1));

        THab.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                THabAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(THab, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 50, -1));

        Ruta.setText("Usuario");
        Ruta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RutaMouseClicked(evt);
            }
        });
        getContentPane().add(Ruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 80, -1));

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 80, -1));

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        getContentPane().add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Back.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        String numh = NumH.getText();
        String ruta = Ruta.getText();
        String tHab = THab.getValue().toString();
        String Query = "INSERT INTO habitacion(THab,NumH,Ruta,Cupo) VALUES(?,?,?,0)";
        try{
            ps = cn.prepareStatement(Query);
            ps.setString(1,tHab);
            ps.setString(2,numh);
            ps.setString(3,ruta);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Habitacion agregada");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_AgregarActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        AI interfaz = new AI();
        interfaz.setLocationRelativeTo(null);
        interfaz.setVisible(true);
        interfaz.setSize(700,500);
        this.setVisible(false);
    }//GEN-LAST:event_VolverActionPerformed

    private void THabAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_THabAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_THabAncestorAdded

    private void RutaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RutaMouseClicked
        // TODO add your handling code here:
        Ruta.setText("");
    }//GEN-LAST:event_RutaMouseClicked

    private void NumHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumHMouseClicked
        // TODO add your handling code here:
        NumH.setText("");
    }//GEN-LAST:event_NumHMouseClicked

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminAddHab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAddHab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAddHab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAddHab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAddHab().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JTextField NumH;
    private javax.swing.JTextField Ruta;
    private javax.swing.JSpinner THab;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
