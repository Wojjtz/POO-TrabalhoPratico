/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package orçamentoDeMarketing.UI;

import java.awt.Color;
import orçamentoDeMarketing.UI.produtosUI.ImagemUI;
import orçamentoDeMarketing.UI.produtosUI.SiteUI;
import orçamentoDeMarketing.UI.produtosUI.VideoUI;

/**
 *
 * @author rodol
 */
public class OpcoesUI extends javax.swing.JFrame {

    /**
     * Creates new form Opcoes
     */
    public OpcoesUI() {
        initComponents();
        setLocationRelativeTo(null);
        
    }
    Color laranjaClaro = new Color(237, 160, 90);
    Color laranjaPadrao = new Color(237, 125, 49);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOpcoes = new javax.swing.JLabel();
        buttonVideo = new javax.swing.JButton();
        buttonImagemFoto = new javax.swing.JButton();
        buttonTrafego = new javax.swing.JButton();
        buttonSite = new javax.swing.JButton();
        buttonPSM = new javax.swing.JButton();
        buttonAjudaPSM = new javax.swing.JButton();
        buttonAjudaTrafego1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        buttonVoltarPagina = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setToolTipText("");
        jPanel1.setMinimumSize(new java.awt.Dimension(720, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 650));

        txtOpcoes.setFont(new java.awt.Font("Noto Serif", 1, 48)); // NOI18N
        txtOpcoes.setForeground(new java.awt.Color(237, 125, 49));
        txtOpcoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtOpcoes.setText("OPÇÕES");

        buttonVideo.setBackground(new java.awt.Color(237, 125, 49));
        buttonVideo.setFont(new java.awt.Font("Noto Serif", 1, 18)); // NOI18N
        buttonVideo.setForeground(new java.awt.Color(255, 255, 255));
        buttonVideo.setText("VÍDEO");
        buttonVideo.setBorderPainted(false);
        buttonVideo.setFocusPainted(false);
        buttonVideo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonVideoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonVideoMouseExited(evt);
            }
        });
        buttonVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVideoActionPerformed(evt);
            }
        });

        buttonImagemFoto.setBackground(new java.awt.Color(237, 125, 49));
        buttonImagemFoto.setFont(new java.awt.Font("Noto Serif", 1, 18)); // NOI18N
        buttonImagemFoto.setForeground(new java.awt.Color(255, 255, 255));
        buttonImagemFoto.setText("IMAGEM/FOTO");
        buttonImagemFoto.setBorderPainted(false);
        buttonImagemFoto.setFocusPainted(false);
        buttonImagemFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonImagemFotoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonImagemFotoMouseExited(evt);
            }
        });
        buttonImagemFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonImagemFotoActionPerformed(evt);
            }
        });

        buttonTrafego.setBackground(new java.awt.Color(237, 125, 49));
        buttonTrafego.setFont(new java.awt.Font("Noto Serif", 1, 18)); // NOI18N
        buttonTrafego.setForeground(new java.awt.Color(255, 255, 255));
        buttonTrafego.setText("TRÁFEGO PAGO");
        buttonTrafego.setBorderPainted(false);
        buttonTrafego.setFocusPainted(false);
        buttonTrafego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonTrafegoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonTrafegoMouseExited(evt);
            }
        });
        buttonTrafego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTrafegoActionPerformed(evt);
            }
        });

        buttonSite.setBackground(new java.awt.Color(237, 125, 49));
        buttonSite.setFont(new java.awt.Font("Noto Serif", 1, 18)); // NOI18N
        buttonSite.setForeground(new java.awt.Color(255, 255, 255));
        buttonSite.setText("SITE");
        buttonSite.setBorderPainted(false);
        buttonSite.setFocusPainted(false);
        buttonSite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonSiteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonSiteMouseExited(evt);
            }
        });
        buttonSite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSiteActionPerformed(evt);
            }
        });

        buttonPSM.setBackground(new java.awt.Color(237, 125, 49));
        buttonPSM.setFont(new java.awt.Font("Noto Serif", 1, 18)); // NOI18N
        buttonPSM.setForeground(new java.awt.Color(255, 255, 255));
        buttonPSM.setText("PACOTE SOCIAL MEDIA");
        buttonPSM.setBorderPainted(false);
        buttonPSM.setFocusPainted(false);
        buttonPSM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonPSMMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonPSMMouseExited(evt);
            }
        });
        buttonPSM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPSMActionPerformed(evt);
            }
        });

        buttonAjudaPSM.setBackground(new java.awt.Color(237, 125, 49));
        buttonAjudaPSM.setFont(new java.awt.Font("Noto Serif", 1, 18)); // NOI18N
        buttonAjudaPSM.setForeground(new java.awt.Color(255, 255, 255));
        buttonAjudaPSM.setText("?");
        buttonAjudaPSM.setBorderPainted(false);
        buttonAjudaPSM.setFocusPainted(false);
        buttonAjudaPSM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonAjudaPSMMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonAjudaPSMMouseExited(evt);
            }
        });
        buttonAjudaPSM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAjudaPSMActionPerformed(evt);
            }
        });

        buttonAjudaTrafego1.setBackground(new java.awt.Color(237, 125, 49));
        buttonAjudaTrafego1.setFont(new java.awt.Font("Noto Serif", 1, 18)); // NOI18N
        buttonAjudaTrafego1.setForeground(new java.awt.Color(255, 255, 255));
        buttonAjudaTrafego1.setText("?");
        buttonAjudaTrafego1.setBorderPainted(false);
        buttonAjudaTrafego1.setFocusPainted(false);
        buttonAjudaTrafego1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonAjudaTrafego1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonAjudaTrafego1MouseExited(evt);
            }
        });
        buttonAjudaTrafego1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAjudaTrafego1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(237, 126, 49));
        jPanel2.setForeground(new java.awt.Color(237, 126, 49));
        jPanel2.setPreferredSize(new java.awt.Dimension(97, 650));

        buttonVoltarPagina.setBackground(new java.awt.Color(237, 125, 49));
        buttonVoltarPagina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back-page-icon.png"))); // NOI18N
        buttonVoltarPagina.setBorder(null);
        buttonVoltarPagina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonVoltarPaginaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonVoltarPaginaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonVoltarPaginaMouseExited(evt);
            }
        });
        buttonVoltarPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarPaginaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(buttonVoltarPagina)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(buttonVoltarPagina)
                .addContainerGap(589, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(txtOpcoes))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonImagemFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonSite, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(buttonTrafego, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonPSM, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonAjudaPSM, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonAjudaTrafego1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOpcoes)
                .addGap(90, 90, 90)
                .addComponent(buttonImagemFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonSite, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTrafego, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAjudaTrafego1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonPSM, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAjudaPSM, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAjudaTrafego1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAjudaTrafego1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAjudaTrafego1ActionPerformed

    private void buttonAjudaPSMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAjudaPSMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAjudaPSMActionPerformed

    private void buttonPSMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPSMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPSMActionPerformed

    private void buttonSiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSiteActionPerformed
        SiteUI site = new SiteUI();
        site.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonSiteActionPerformed

    private void buttonTrafegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTrafegoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonTrafegoActionPerformed

    private void buttonImagemFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonImagemFotoActionPerformed
        ImagemUI im = new ImagemUI();
        im.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonImagemFotoActionPerformed

    private void buttonVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVideoActionPerformed
        VideoUI vid = new VideoUI();
        vid.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonVideoActionPerformed

    private void buttonImagemFotoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonImagemFotoMouseExited
        buttonImagemFoto.setBackground(laranjaPadrao);
    }//GEN-LAST:event_buttonImagemFotoMouseExited

    private void buttonImagemFotoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonImagemFotoMouseEntered
        buttonImagemFoto.setBackground(laranjaClaro);
    }//GEN-LAST:event_buttonImagemFotoMouseEntered

    private void buttonVideoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVideoMouseEntered
        buttonVideo.setBackground(laranjaClaro);
    }//GEN-LAST:event_buttonVideoMouseEntered

    private void buttonVideoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVideoMouseExited
        buttonVideo.setBackground(laranjaPadrao);
    }//GEN-LAST:event_buttonVideoMouseExited

    private void buttonSiteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSiteMouseEntered
        buttonSite.setBackground(laranjaClaro);
    }//GEN-LAST:event_buttonSiteMouseEntered

    private void buttonSiteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSiteMouseExited
        buttonSite.setBackground(laranjaPadrao);
    }//GEN-LAST:event_buttonSiteMouseExited

    private void buttonTrafegoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonTrafegoMouseEntered
        buttonTrafego.setBackground(laranjaClaro);
    }//GEN-LAST:event_buttonTrafegoMouseEntered

    private void buttonTrafegoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonTrafegoMouseExited
        buttonTrafego.setBackground(laranjaPadrao);
    }//GEN-LAST:event_buttonTrafegoMouseExited

    private void buttonPSMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPSMMouseEntered
        buttonPSM.setBackground(laranjaClaro);
    }//GEN-LAST:event_buttonPSMMouseEntered

    private void buttonPSMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPSMMouseExited
        buttonPSM.setBackground(laranjaPadrao);
    }//GEN-LAST:event_buttonPSMMouseExited

    private void buttonAjudaTrafego1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAjudaTrafego1MouseEntered
        buttonAjudaTrafego1.setBackground(laranjaClaro);
    }//GEN-LAST:event_buttonAjudaTrafego1MouseEntered

    private void buttonAjudaTrafego1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAjudaTrafego1MouseExited
        buttonAjudaTrafego1.setBackground(laranjaPadrao);
    }//GEN-LAST:event_buttonAjudaTrafego1MouseExited

    private void buttonAjudaPSMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAjudaPSMMouseEntered
        buttonAjudaPSM.setBackground(laranjaClaro);
    }//GEN-LAST:event_buttonAjudaPSMMouseEntered

    private void buttonAjudaPSMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAjudaPSMMouseExited
        buttonAjudaPSM.setBackground(laranjaPadrao);
    }//GEN-LAST:event_buttonAjudaPSMMouseExited

    private void buttonVoltarPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarPaginaActionPerformed
        PrincipalUI menu = new PrincipalUI();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonVoltarPaginaActionPerformed

    private void buttonVoltarPaginaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVoltarPaginaMouseEntered
        buttonVoltarPagina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back-page-icon-entered.png")));
    }//GEN-LAST:event_buttonVoltarPaginaMouseEntered

    private void buttonVoltarPaginaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVoltarPaginaMouseExited
        buttonVoltarPagina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back-page-icon.png")));
    }//GEN-LAST:event_buttonVoltarPaginaMouseExited

    private void buttonVoltarPaginaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVoltarPaginaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonVoltarPaginaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void Opcoes(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OpcoesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpcoesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpcoesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpcoesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpcoesUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAjudaPSM;
    private javax.swing.JButton buttonAjudaTrafego1;
    private javax.swing.JButton buttonImagemFoto;
    private javax.swing.JButton buttonPSM;
    private javax.swing.JButton buttonSite;
    private javax.swing.JButton buttonTrafego;
    private javax.swing.JButton buttonVideo;
    private javax.swing.JButton buttonVoltarPagina;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOpcoes;
    // End of variables declaration//GEN-END:variables
}
