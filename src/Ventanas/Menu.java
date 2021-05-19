package Ventanas;

import java.awt.Image;
import java.awt.Toolkit;
/**
 *
 * @author MC
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/icono.png"));
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Salir = new javax.swing.JButton();
        Resi = new javax.swing.JButton();
        Capaci = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        Option = new javax.swing.JLabel();
        Menu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salir.setBackground(new java.awt.Color(255, 0, 0));
        Salir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, -1));

        Resi.setBackground(new java.awt.Color(0, 102, 255));
        Resi.setForeground(new java.awt.Color(255, 255, 255));
        Resi.setText("Resistencias");
        Resi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResiActionPerformed(evt);
            }
        });
        getContentPane().add(Resi, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        Capaci.setBackground(new java.awt.Color(0, 102, 255));
        Capaci.setForeground(new java.awt.Color(255, 255, 255));
        Capaci.setText("Capacitores");
        Capaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CapaciActionPerformed(evt);
            }
        });
        getContentPane().add(Capaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, -1));

        Title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Calculadroa Resistencias Y Capacitores");
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        Option.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Option.setForeground(new java.awt.Color(255, 255, 255));
        Option.setText("Escoga Una Opcion");
        getContentPane().add(Option, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo2.jpg"))); // NOI18N
        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 620, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
     System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void ResiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResiActionPerformed
    Resistencias a = new Resistencias();
        a.setVisible(true);
        this.setVisible(false);
				
    }//GEN-LAST:event_ResiActionPerformed

    private void CapaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CapaciActionPerformed
      Capacitores a = new Capacitores();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CapaciActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Capaci;
    private javax.swing.JLabel Menu;
    private javax.swing.JLabel Option;
    private javax.swing.JButton Resi;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables
}
