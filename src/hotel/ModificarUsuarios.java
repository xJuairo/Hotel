/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author xjlop
 */
public class ModificarUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form ModificarUsuarios
     */
    Conexion cc = new Conexion();
    Connection cn = cc.conexion();
    ArrayList<customers> Lista = new ArrayList();
    public ModificarUsuarios() {
        initComponents();
        this.setSize(1280,720);
        this.setLocationRelativeTo(null);
        try{
            Statement st;
            ResultSet rs;
            st = cn.createStatement();
            rs = st.executeQuery("SELECT NumH,Nombre,NumTel,Correo,MetodoP,Sexo FROM customers");
            while(rs.next()){
                CustomerHab.addItem(rs.getString(1));
                Lista.add(new customers(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(1),rs.getString(6)));
            }
            Nombre.setText(Lista.get(0).getNombre());
            NumTel.setText(Lista.get(0).getNumTel());
            MetodoP.setText(Lista.get(0).getMetodoP());
            Correo.setText(Lista.get(0).getCorreo());
            Sexo.setText(Lista.get(0).getSexo());
            CustomerHab.addItemListener(new ItemListener() {
                public void itemStateChanged(ItemEvent arg0) {
                    for(customers customer : Lista){
                        if(customer.getNumH() == Integer.parseInt((String) CustomerHab.getSelectedItem())){
                            Nombre.setText(customer.getNombre());
                            NumTel.setText(customer.getNumTel());
                            MetodoP.setText(customer.getMetodoP());
                            Correo.setText(customer.getCorreo());
                            Sexo.setText(customer.getSexo());
                        }
                    }
                }
            });
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+ e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CustomerHab = new javax.swing.JComboBox<>();
        Nombre = new javax.swing.JTextField();
        NumTel = new javax.swing.JTextField();
        MetodoP = new javax.swing.JTextField();
        Correo = new javax.swing.JTextField();
        Sexo = new javax.swing.JTextField();
        Modificar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getContentPane().add(CustomerHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 100, -1));

        Nombre.setText("Nombre");
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 140, -1));

        NumTel.setText("Numero de Telefono");
        getContentPane().add(NumTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 140, -1));

        MetodoP.setText("Metodo de Pago");
        getContentPane().add(MetodoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 140, -1));

        Correo.setText("Correo");
        getContentPane().add(Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 140, -1));

        Sexo.setText("Sexo");
        getContentPane().add(Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 140, -1));

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 200, -1));

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        try{
            PreparedStatement ps;
            ps = cn.prepareStatement("UPDATE customers SET Nombre = ? , NumTel = ? , Correo = ? , MetodoP = ? , Sexo = ? WHERE NumH = ?");
            ps.setString(1, Nombre.getText());
            ps.setString(2, NumTel.getText());
            ps.setString(3, Correo.getText());
            ps.setString(4, MetodoP.getText());
            ps.setString(5, Sexo.getText());
            ps.setInt(6, Integer.parseInt((String) CustomerHab.getSelectedItem()));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Modificado");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error : " + e);
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        UI ui = new UI();
        this.setVisible(false);
        ui.setVisible(true);
        ui.setSize(750, 600);
        ui.setResizable(false);
        ui.setLocationRelativeTo(null);
    }//GEN-LAST:event_RegresarActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Correo;
    private javax.swing.JComboBox<String> CustomerHab;
    private javax.swing.JTextField MetodoP;
    private javax.swing.JButton Modificar;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField NumTel;
    private javax.swing.JButton Regresar;
    private javax.swing.JTextField Sexo;
    // End of variables declaration//GEN-END:variables
}
