package com.mycompany.examenprogramacion2;

import Modales.Modal;
import Articulo.FrmArticulo;
import Entradas.FrmEntradas;
import java.awt.Color;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class FrmPrincipal extends javax.swing.JFrame {

    public static int counter = 0;
    //Frames Init
    FrmArticulo frmArticulo;
    FrmEntradas frmEntradas;

    public FrmPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        message.setVisible(false);
        jLabel1.setVisible(false);
        //
        lblOptCatalogo.setVisible(false);
        btnOptCatalogo.setVisible(false);
        lblOptRegistrarArt.setVisible(false);
        btnOptRegistarArt.setVisible(false);
        lblOptRegistrarSalida.setVisible(false);
        btnOptRegistarSalida.setVisible(false);
        if (counter <= 2) {
            registerModal();

        } else {
            showOptions();
        }

    }
    //Modal
    Modal modal = new Modal(this, true);

    private void registerModal() {
        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        final Runnable runnable;

        runnable = new Runnable() {
            int countdownStarter = 500;

            public void run() {

                countdownStarter--;

                if (countdownStarter < 0) {
                    modal.getContentPane().setBackground(Color.white);
                    modal.setLocationRelativeTo(null);
                    modal.setVisible(true);

                    scheduler.shutdown();

                }
            }

        };
        scheduler.scheduleAtFixedRate(runnable, 0, 1, TimeUnit.MILLISECONDS);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        message = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblOptCatalogo = new javax.swing.JLabel();
        btnOptCatalogo = new javax.swing.JButton();
        btnOptRegistarArt = new javax.swing.JButton();
        lblOptRegistrarArt = new javax.swing.JLabel();
        lblOptRegistrarSalida = new javax.swing.JLabel();
        btnOptRegistarSalida = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        message.setFont(new java.awt.Font("FreeSerif", 1, 27)); // NOI18N
        message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        message.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("jLabel1");

        lblOptCatalogo.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        lblOptCatalogo.setText("Mirar Catalogo");

        btnOptCatalogo.setText("Ir");

        btnOptRegistarArt.setText("Ir");
        btnOptRegistarArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptRegistarArtActionPerformed(evt);
            }
        });

        lblOptRegistrarArt.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        lblOptRegistrarArt.setText("Registrar un Articulo");

        lblOptRegistrarSalida.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        lblOptRegistrarSalida.setText("Registrar un Salida");

        btnOptRegistarSalida.setText("Ir");
        btnOptRegistarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptRegistarSalidaActionPerformed(evt);
            }
        });

        jMenu1.setText("Catalogo");

        jMenuItem6.setText("Mostrar Catalogo");
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Articulo");

        jMenuItem5.setText("Registrar Articulo");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Entradas");

        jMenuItem1.setText("Registrar Entradas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Salidas");

        jMenu6.setText("Agregar Salidas");
        jMenu3.add(jMenu6);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Ventas");

        jMenu11.setText("Regsitrar Ventas");
        jMenu5.add(jMenu11);

        jMenuBar1.add(jMenu5);

        jMenu7.setText("Usuarios");

        jMenu8.setText("Agregar Usuario");
        jMenu7.add(jMenu8);

        jMenuBar1.add(jMenu7);

        jMenu9.setText("Informacion");

        jMenu10.setText("Informacion del Desarrollo");
        jMenu9.add(jMenu10);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(btnOptCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(btnOptRegistarArt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(lblOptCatalogo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblOptRegistrarArt)
                                .addGap(64, 64, 64)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnOptRegistarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOptRegistrarSalida))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(message)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOptRegistrarSalida)
                    .addComponent(lblOptRegistrarArt)
                    .addComponent(lblOptCatalogo))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOptRegistarSalida)
                    .addComponent(btnOptRegistarArt)
                    .addComponent(btnOptCatalogo))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        if (frmArticulo == null) {
            frmArticulo = new FrmArticulo();
        }

        if (frmArticulo.isVisible() == false) {
            frmArticulo.setVisible(true);
            this.dispose();
        }
        /**
         * else { frm.requestFocus(); } *
         */


    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (frmEntradas == null) {
            frmEntradas = new FrmEntradas();
        }

        if (frmEntradas.isVisible() == false) {
            frmEntradas.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    private void showOptions() {

        String name = Modal.getNombre();
        message.setVisible(true);
        jLabel1.setVisible(true);
        lblOptCatalogo.setVisible(true);
        btnOptCatalogo.setVisible(true);
        lblOptRegistrarArt.setVisible(true);
        btnOptRegistarArt.setVisible(true);
        lblOptRegistrarSalida.setVisible(true);
        btnOptRegistarSalida.setVisible(true);
        message.setText("Bienvenido " + name);
        jLabel1.setText("¿Que desea hacer hoy?");
    }
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        counter++;

        if (counter == 2) {
            showOptions();

        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void btnOptRegistarArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptRegistarArtActionPerformed
        if (frmArticulo == null) {
            frmArticulo = new FrmArticulo();
        }

        if (frmArticulo.isVisible() == false) {
            frmArticulo.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnOptRegistarArtActionPerformed

    private void btnOptRegistarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptRegistarSalidaActionPerformed
        if (frmEntradas == null) {
            frmEntradas = new FrmEntradas();
        }

        if (frmEntradas.isVisible() == false) {
            frmEntradas.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnOptRegistarSalidaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOptCatalogo;
    private javax.swing.JButton btnOptRegistarArt;
    private javax.swing.JButton btnOptRegistarSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblOptCatalogo;
    private javax.swing.JLabel lblOptRegistrarArt;
    private javax.swing.JLabel lblOptRegistrarSalida;
    private javax.swing.JLabel message;
    // End of variables declaration//GEN-END:variables
}
