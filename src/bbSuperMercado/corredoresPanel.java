/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package bbSuperMercado;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author bruno
 */
public class corredoresPanel extends javax.swing.JPanel {

    /**
     * Creates new form clientePanel
     */
    public corredoresPanel(JFrame mainFrame) {        
        initComponents();
        
        //JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        mainFrame.setTitle("BB Super-Mercado | $Cliente - Corredores e Setores");
        //System.out.println(currentFrame);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnVoltarParaLogin = new javax.swing.JButton();
        btnAlimentos = new javax.swing.JButton();
        btnLimpeza = new javax.swing.JButton();
        btnAcougue = new javax.swing.JButton();
        btnBebidas = new javax.swing.JButton();
        btnHortifruti = new javax.swing.JButton();
        btnPadaria = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel2.setText("Corredores");

        jLabel3.setText("Setores");

        btnVoltarParaLogin.setText("Voltar para o Login");
        btnVoltarParaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarParaLoginActionPerformed(evt);
            }
        });

        btnAlimentos.setText("Alimentos");
        btnAlimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlimentosActionPerformed(evt);
            }
        });

        btnLimpeza.setText("Limpeza");
        btnLimpeza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpezaActionPerformed(evt);
            }
        });

        btnAcougue.setText("Açougue");
        btnAcougue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcougueActionPerformed(evt);
            }
        });

        btnBebidas.setText("Bebidas");
        btnBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBebidasActionPerformed(evt);
            }
        });

        btnHortifruti.setText("Hortifruti");
        btnHortifruti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHortifrutiActionPerformed(evt);
            }
        });

        btnPadaria.setText("Padaria");
        btnPadaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPadariaActionPerformed(evt);
            }
        });

        jLabel4.setText("Corredor 1");
        jLabel4.setToolTipText("");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setText("Corredor 2");

        jLabel6.setText("Corredor 3");

        jLabel7.setText("Corredor 4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAlimentos)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLimpeza)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(btnAcougue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBebidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnHortifruti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7)
                                    .addComponent(btnPadaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnVoltarParaLogin)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel2)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlimentos)
                    .addComponent(btnLimpeza)
                    .addComponent(btnAcougue)
                    .addComponent(btnHortifruti)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBebidas)
                    .addComponent(btnPadaria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnVoltarParaLogin)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void switchSetor(int corredorAtual, String setorAtual, java.awt.event.ActionEvent evt){
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.remove(((JButton)evt.getSource()).getParent());
        
        Cliente.corredorAtual = corredorAtual;
        Cliente.setorAtual = setorAtual;
        
        JPanel consultaSetorPanel = new consultaSetorPanel(currentFrame);
        
        currentFrame.add(consultaSetorPanel);
        currentFrame.revalidate();
        currentFrame.repaint(); 
    }
    
    private void btnVoltarParaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarParaLoginActionPerformed
        // TODO add your handling code here:
        JFrame loginFrame = new loginFrame();
        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        
        Cliente.corredorAtual = 0;
        Cliente.setorAtual = null;
        
        loginFrame.setVisible(true);
        topFrame.setVisible(false);  
    }//GEN-LAST:event_btnVoltarParaLoginActionPerformed

    private void btnAlimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlimentosActionPerformed
        // TODO add your handling code here:
        switchSetor(1, "alimentos", evt);
    }//GEN-LAST:event_btnAlimentosActionPerformed

    private void btnLimpezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpezaActionPerformed
        // TODO add your handling code here:
        switchSetor(2, "limpeza", evt);
    }//GEN-LAST:event_btnLimpezaActionPerformed

    private void btnAcougueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcougueActionPerformed
        // TODO add your handling code here:
        switchSetor(3, "acougue", evt);
    }//GEN-LAST:event_btnAcougueActionPerformed

    private void btnBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBebidasActionPerformed
        // TODO add your handling code here:
        switchSetor(3, "bebidas", evt);
    }//GEN-LAST:event_btnBebidasActionPerformed

    private void btnHortifrutiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHortifrutiActionPerformed
        // TODO add your handling code here:
        switchSetor(4, "hortifruti", evt);
    }//GEN-LAST:event_btnHortifrutiActionPerformed

    private void btnPadariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPadariaActionPerformed
        // TODO add your handling code here:
        switchSetor(4, "padaria", evt);
    }//GEN-LAST:event_btnPadariaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcougue;
    private javax.swing.JButton btnAlimentos;
    private javax.swing.JButton btnBebidas;
    private javax.swing.JButton btnHortifruti;
    private javax.swing.JButton btnLimpeza;
    private javax.swing.JButton btnPadaria;
    private javax.swing.JButton btnVoltarParaLogin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}