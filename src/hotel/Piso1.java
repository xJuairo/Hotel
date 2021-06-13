/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.awt.Image;
import static java.awt.Image.SCALE_SMOOTH;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Piso1 extends javax.swing.JFrame {

    Conexion cc = new Conexion();
    Connection cn =  cc.conexion();
    ResultSet rs;
    Statement st;
    String vector [] ;
    String vector1 [];
    int i=0;
    
    public Piso1() {
        this.vector = new String [15];
        this.vector1 = new String [15];
        initComponents();
        Image l;
        l = new ImageIcon(this.getClass().getResource("/Imagenes/FondoPisos.jpg")).getImage().getScaledInstance(jLabelFondo.getWidth(),
        jLabelFondo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon I = new ImageIcon(l);
        jLabelFondo.setIcon(I);
        Image dos = new ImageIcon(this.getClass().getResource("/Imagenes/Recepcion.png")).getImage().getScaledInstance(jLabelRec.getWidth()/2,jLabelRec.getHeight()/2, Image.SCALE_SMOOTH);
        ImageIcon II = new ImageIcon(dos);
        this.jLabelRec.setIcon(II);
        this.jLabelRec.setHorizontalAlignment(jLabelRec.CENTER);
        this.jLabelRec.setVerticalAlignment(jLabelRec.CENTER);
        Image tres = new ImageIcon(this.getClass().getResource("/Imagenes/Cocina.png")).getImage().getScaledInstance(jLabelCoc.getWidth()/2,jLabelCoc.getHeight()/2, Image.SCALE_SMOOTH);
        ImageIcon III = new ImageIcon(tres);
        this.jLabelCoc.setIcon(III);
        jLabelCoc.setHorizontalAlignment(jLabelCoc.CENTER);
        jLabelCoc.setVerticalAlignment(jLabelCoc.CENTER);
        Image cuatro = new ImageIcon(this.getClass().getResource("/Imagenes/FondoPisos.jpg")).getImage().getScaledInstance(piso1.getWidth(),piso1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon IV = new ImageIcon(cuatro);
        this.piso1.setIcon(IV);
        Image siete = new ImageIcon(this.getClass().getResource("/Imagenes/pool.png")).getImage().getScaledInstance(Alberca.getWidth()/2,Alberca.getHeight()/2, Image.SCALE_SMOOTH);
        ImageIcon VII = new ImageIcon(siete);
        this.Alberca.setIcon(VII);
        Alberca.setHorizontalAlignment(Alberca.CENTER);
        Alberca.setVerticalAlignment(Alberca.CENTER);
        try{
            st = cn.createStatement();
            rs = st.executeQuery("SELECT Cupo FROM habitacion WHERE Piso = 1;");
            while(rs.next()){
                
                this.vector[i] = rs.getString(1);
                i++;
            }
            for (int x=0;x<15;x++){
                System.out.println(this.vector[x]);
            }
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error");
        }
        
         Image Disponible = new ImageIcon(this.getClass().getResource("/Imagenes/Disponible.png")).getImage();
         ImageIcon dis = new ImageIcon(Disponible);
         Image NoDisponible = new ImageIcon(this.getClass().getResource("/Imagenes/ROJO.jpg")).getImage();
         ImageIcon Nodis = new ImageIcon(NoDisponible);
         if(this.vector[0].equals("1")){
           this.Hab1.setIcon(Nodis);  
         }else{
           this.Hab1.setIcon(dis);  
         }
         if(this.vector[1].equals("1")){
           this.Hab2.setIcon(Nodis);  
         }else{
           this.Hab2.setIcon(dis);  
         }
         if(this.vector[2].equals("1")){
           this.Hab3.setIcon(Nodis);  
         }else{
           this.Hab3.setIcon(dis);  
         }
         if(this.vector[3].equals("1")){
           this.Hab4.setIcon(Nodis);  
         }else{
           this.Hab4.setIcon(dis);  
         }
         if(this.vector[4].equals("1")){
           this.Hab5.setIcon(Nodis);  
         }else{
           this.Hab5.setIcon(dis);  
         }
         if(this.vector[5].equals("1")){
           this.Hab6.setIcon(Nodis);  
         }else{
           this.Hab6.setIcon(dis);  
         }
         if(this.vector[6].equals("1")){
           this.Hab7.setIcon(Nodis);  
         }else{
           this.Hab7.setIcon(dis);  
         }
         if(this.vector[7].equals("1")){
           this.Hab8.setIcon(Nodis);  
         }else{
           this.Hab8.setIcon(dis);  
         }
         if(this.vector[8].equals("1")){
           this.Hab9.setIcon(Nodis);  
         }else{
           this.Hab9.setIcon(dis);  
         }
         if(this.vector[9].equals("1")){
           this.Hab10.setIcon(Nodis);  
         }else{
           this.Hab10.setIcon(dis);  
         }
         if(this.vector[10].equals("1")){
           this.Hab11.setIcon(Nodis);  
         }else{
           this.Hab11.setIcon(dis);  
         }if(this.vector[11].equals("1")){
           this.Hab12.setIcon(Nodis);  
         }else{
           this.Hab12.setIcon(dis);  
         }
         if(this.vector[12].equals("1")){
           this.Hab13.setIcon(Nodis);  
         }else{
           this.Hab13.setIcon(dis);  
         }
         if(this.vector[13].equals("1")){
           this.Hab14.setIcon(Nodis);  
         }else{
           this.Hab14.setIcon(dis);  
         }
         if(this.vector[14].equals("1")){
           this.Hab15.setIcon(Nodis);  
         }else{
           this.Hab15.setIcon(dis);  
         }
         Image esc = new ImageIcon(this.getClass().getResource("/Imagenes/Escalera.jpg")).getImage().getScaledInstance(Escalera.getWidth(),
        Escalera.getHeight(), Image.SCALE_SMOOTH);
         ImageIcon esca = new ImageIcon(esc);
         this.Escalera.setIcon(esca);
         
         ColocarNumero();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabelRec = new javax.swing.JLabel();
        jLabelCoc = new javax.swing.JLabel();
        Hab5 = new javax.swing.JLabel();
        Hab2 = new javax.swing.JLabel();
        Hab1 = new javax.swing.JLabel();
        Hab10 = new javax.swing.JLabel();
        Hab11 = new javax.swing.JLabel();
        Hab3 = new javax.swing.JLabel();
        Hab12 = new javax.swing.JLabel();
        Hab4 = new javax.swing.JLabel();
        Hab13 = new javax.swing.JLabel();
        Hab6 = new javax.swing.JLabel();
        Hab14 = new javax.swing.JLabel();
        Hab8 = new javax.swing.JLabel();
        Hab15 = new javax.swing.JLabel();
        Hab7 = new javax.swing.JLabel();
        Hab9 = new javax.swing.JLabel();
        Escalera = new javax.swing.JLabel();
        piso1 = new javax.swing.JLabel();
        Alberca = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        jTextField2.setEditable(false);
        jTextField2.setText("jTextField2");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        jTextField3.setEditable(false);
        jTextField3.setText("jTextField3");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, -1));

        jTextField4.setEditable(false);
        jTextField4.setText("jTextField4");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, -1, -1));

        jTextField5.setEditable(false);
        jTextField5.setText("jTextField5");
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, -1, -1));

        jTextField6.setEditable(false);
        jTextField6.setText("jTextField6");
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, -1, -1));

        jTextField7.setEditable(false);
        jTextField7.setText("jTextField7");
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 50, -1, -1));

        jTextField8.setEditable(false);
        jTextField8.setText("jTextField8");
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 50, -1, -1));

        jTextField9.setEditable(false);
        jTextField9.setText("jTextField9");
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        jTextField10.setEditable(false);
        jTextField10.setText("jTextField10");
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        jTextField11.setEditable(false);
        jTextField11.setText("jTextField11");
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));

        jTextField12.setEditable(false);
        jTextField12.setText("jTextField12");
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, -1, -1));

        jTextField13.setEditable(false);
        jTextField13.setText("jTextField13");
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, -1, -1));

        jTextField14.setEditable(false);
        jTextField14.setText("jTextField14");
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 230, -1, -1));

        jTextField15.setEditable(false);
        jTextField15.setText("jTextField15");
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 230, -1, -1));

        jLabelRec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabelRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 230, 190));

        jLabelCoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabelCoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 230, 190));

        Hab5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Hab5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 110, 100));

        Hab2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Hab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 110, 100));

        Hab1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Hab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 110, 100));

        Hab10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Hab10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 110, 100));

        Hab11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Hab11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 110, 100));

        Hab3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Hab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 110, 100));

        Hab12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Hab12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 110, 100));

        Hab4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Hab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 110, 100));

        Hab13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Hab13, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 110, 100));

        Hab6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Hab6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 110, 100));

        Hab14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Hab14, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, 110, 100));

        Hab8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Hab8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, 110, 100));

        Hab15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Hab15, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 190, 110, 100));

        Hab7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Hab7, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 110, 100));

        Hab9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Hab9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 110, 100));
        getContentPane().add(Escalera, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 290, 90, 90));

        piso1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(piso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 880, 280));

        Alberca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Alberca, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 520, 160));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" B A C K");
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 110, 40));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SIMBOLOGIA / PISO 2");
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 450, 280, 40));

        jLabelFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelFondo.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jLabelFondoComponentAdded(evt);
            }
        });
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelFondoComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabelFondoComponentAdded
 
    }//GEN-LAST:event_jLabelFondoComponentAdded

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        UI ui = new UI();
        this.setVisible(false);
        ui.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       Piso2 ui = new Piso2();
        this.setVisible(false);
        ui.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(Piso1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Piso1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Piso1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Piso1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Piso1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alberca;
    private javax.swing.JLabel Escalera;
    private javax.swing.JLabel Hab1;
    private javax.swing.JLabel Hab10;
    private javax.swing.JLabel Hab11;
    private javax.swing.JLabel Hab12;
    private javax.swing.JLabel Hab13;
    private javax.swing.JLabel Hab14;
    private javax.swing.JLabel Hab15;
    private javax.swing.JLabel Hab2;
    private javax.swing.JLabel Hab3;
    private javax.swing.JLabel Hab4;
    private javax.swing.JLabel Hab5;
    private javax.swing.JLabel Hab6;
    private javax.swing.JLabel Hab7;
    private javax.swing.JLabel Hab8;
    private javax.swing.JLabel Hab9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCoc;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelRec;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel piso1;
    // End of variables declaration//GEN-END:variables

    private void ColocarNumero() {
        int j=0;
        try{
            st = cn.createStatement();
            rs = st.executeQuery("SELECT NumH,THab FROM habitacion WHERE Piso = 1;");
            while(rs.next()){
                
                this.vector1[j] = "NH: "+ rs.getString(1)+" T"+ rs.getString(2);
                j++;
            }
            for (int x=0;x<15;x++){
                System.out.println(this.vector1[x]);
            }
            this.jTextField1.setText(vector1[0]);
            this.jTextField2.setText(vector1[1]);
            this.jTextField3.setText(vector1[2]);
            this.jTextField4.setText(vector1[3]);
            this.jTextField5.setText(vector1[4]);
            this.jTextField6.setText(vector1[5]);
            this.jTextField7.setText(vector1[6]);
            this.jTextField8.setText(vector1[7]);
            this.jTextField9.setText(vector1[8]);
            this.jTextField10.setText(vector1[9]);
            this.jTextField11.setText(vector1[10]);
            this.jTextField12.setText(vector1[11]);
            this.jTextField13.setText(vector1[12]);
            this.jTextField14.setText(vector1[13]);
            this.jTextField15.setText(vector1[14]);
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error");
        }

    }
}
