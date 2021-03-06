/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author MC
 */
public class Capacitores extends javax.swing.JFrame {

    /**
     * Creates new form Capacitores
     */
    public Capacitores() {
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

        Salir = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();
        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Opciones = new javax.swing.JMenu();
        Serie = new javax.swing.JMenuItem();
        Paralelo = new javax.swing.JMenuItem();
        DeltaE = new javax.swing.JMenuItem();
        EstrellaD = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salir.setBackground(new java.awt.Color(255, 0, 0));
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        Regresar.setBackground(new java.awt.Color(0, 255, 0));
        Regresar.setForeground(new java.awt.Color(255, 255, 255));
        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        Escritorio.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        getContentPane().add(Escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 610));

        Opciones.setText("Opciones");

        Serie.setText("Serie");
        Serie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SerieActionPerformed(evt);
            }
        });
        Opciones.add(Serie);

        Paralelo.setText("Paralelo");
        Paralelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParaleloActionPerformed(evt);
            }
        });
        Opciones.add(Paralelo);

        DeltaE.setText("Delta Estrella");
        DeltaE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeltaEActionPerformed(evt);
            }
        });
        Opciones.add(DeltaE);

        EstrellaD.setText("Estrella Delta");
        EstrellaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstrellaDActionPerformed(evt);
            }
        });
        Opciones.add(EstrellaD);

        jMenuBar1.add(Opciones);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
       Menu b = new Menu();
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegresarActionPerformed

    private void SerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SerieActionPerformed
      SerieC c = new SerieC();
      Escritorio.add(c);
      c.show();
    }//GEN-LAST:event_SerieActionPerformed

    private void ParaleloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParaleloActionPerformed
       ParaleloC c = new ParaleloC();
      Escritorio.add(c);
      c.show();
    }//GEN-LAST:event_ParaleloActionPerformed

    private void DeltaEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeltaEActionPerformed
      DeltaC c = new  DeltaC();
      Escritorio.add(c);
      c.show();
    }//GEN-LAST:event_DeltaEActionPerformed

    private void EstrellaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstrellaDActionPerformed
      EstrellaC c = new  EstrellaC();
      Escritorio.add(c);
      c.show();
    }//GEN-LAST:event_EstrellaDActionPerformed

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
            java.util.logging.Logger.getLogger(Capacitores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Capacitores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Capacitores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Capacitores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Capacitores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem DeltaE;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem EstrellaD;
    private javax.swing.JLabel Fondo;
    private javax.swing.JMenu Opciones;
    private javax.swing.JMenuItem Paralelo;
    private javax.swing.JButton Regresar;
    private javax.swing.JButton Salir;
    private javax.swing.JMenuItem Serie;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
