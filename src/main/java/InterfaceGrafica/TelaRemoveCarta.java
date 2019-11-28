/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

import DAOs.CartaDAO;
import Game.CartaProduct;
import javax.swing.JOptionPane;

/**
 *
 * @author sarah
 */
public class TelaRemoveCarta extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public TelaRemoveCarta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotuloProvisoes = new javax.swing.JLabel();
        rotuloFaccao1 = new javax.swing.JLabel();
        textoHierarquia = new javax.swing.JTextField();
        textoProvisoes = new javax.swing.JTextField();
        rotuloRaridade = new javax.swing.JLabel();
        textoRaridade = new javax.swing.JTextField();
        textoTitulo = new javax.swing.JTextField();
        rotuloSenha3 = new javax.swing.JLabel();
        textoDescricao = new javax.swing.JTextField();
        textoArte = new javax.swing.JTextField();
        textoFaccao = new javax.swing.JTextField();
        checkConsume = new javax.swing.JCheckBox();
        rotuloRestos = new javax.swing.JLabel();
        checkDeploy = new javax.swing.JCheckBox();
        rotuloTítulo = new javax.swing.JLabel();
        textoRestos = new javax.swing.JTextField();
        checkHeal = new javax.swing.JCheckBox();
        rotuloDescricao = new javax.swing.JLabel();
        rotuloPontos = new javax.swing.JLabel();
        rotuloFaccao = new javax.swing.JLabel();
        textoPontos = new javax.swing.JTextField();
        rotuloHierarquia = new javax.swing.JLabel();
        textoId = new javax.swing.JTextField();
        botaoConsultar = new javax.swing.JButton();
        rotuloId = new javax.swing.JLabel();
        botaoRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rotuloProvisoes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rotuloProvisoes.setText("Provisões:");

        rotuloFaccao1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rotuloFaccao1.setText("Efeitos:");

        textoHierarquia.setEditable(false);

        textoProvisoes.setEditable(false);
        textoProvisoes.setToolTipText("");

        rotuloRaridade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rotuloRaridade.setText("Raridade:");

        textoRaridade.setEditable(false);

        textoTitulo.setEditable(false);
        textoTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoTituloActionPerformed(evt);
            }
        });

        rotuloSenha3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rotuloSenha3.setText("Arte:");

        textoDescricao.setEditable(false);

        textoArte.setEditable(false);

        textoFaccao.setEditable(false);

        checkConsume.setText("Consume");
        checkConsume.setEnabled(false);
        checkConsume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkConsumeActionPerformed(evt);
            }
        });

        rotuloRestos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rotuloRestos.setText("Restos:");

        checkDeploy.setText("Deploy");
        checkDeploy.setEnabled(false);
        checkDeploy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDeployActionPerformed(evt);
            }
        });

        rotuloTítulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rotuloTítulo.setText("Título:");

        textoRestos.setEditable(false);

        checkHeal.setText("Heal");
        checkHeal.setEnabled(false);
        checkHeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkHealActionPerformed(evt);
            }
        });

        rotuloDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rotuloDescricao.setText("Descrição:");

        rotuloPontos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rotuloPontos.setText("Pontos: ");

        rotuloFaccao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rotuloFaccao.setText("Facção:");

        textoPontos.setEditable(false);
        textoPontos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoPontosActionPerformed(evt);
            }
        });

        rotuloHierarquia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rotuloHierarquia.setText("Hierarquia:");

        botaoConsultar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoConsultar.setText("Consultar");
        botaoConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarActionPerformed(evt);
            }
        });

        rotuloId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rotuloId.setText("Id:");

        botaoRemover.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoRemover.setText("Remover");
        botaoRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoRemover.setEnabled(false);
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotuloProvisoes)
                    .addComponent(rotuloFaccao1)
                    .addComponent(rotuloRaridade)
                    .addComponent(rotuloSenha3)
                    .addComponent(rotuloRestos)
                    .addComponent(rotuloTítulo)
                    .addComponent(rotuloDescricao)
                    .addComponent(rotuloPontos)
                    .addComponent(rotuloFaccao)
                    .addComponent(rotuloHierarquia)
                    .addComponent(rotuloId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textoId, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoConsultar)
                        .addGap(261, 261, 261))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textoTitulo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoDescricao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoFaccao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textoHierarquia)
                            .addComponent(textoRaridade)
                            .addComponent(textoArte)
                            .addComponent(textoRestos, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoPontos)
                            .addComponent(textoProvisoes, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(botaoRemover))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkConsume)
                        .addGap(18, 18, 18)
                        .addComponent(checkDeploy)
                        .addGap(18, 18, 18)
                        .addComponent(checkHeal)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoConsultar)
                    .addComponent(rotuloId))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloTítulo)
                    .addComponent(textoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotuloDescricao))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rotuloFaccao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoFaccao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkConsume)
                    .addComponent(checkDeploy)
                    .addComponent(checkHeal)
                    .addComponent(rotuloFaccao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloRaridade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoRaridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloHierarquia)
                    .addComponent(textoHierarquia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloSenha3)
                    .addComponent(textoArte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloRestos)
                    .addComponent(textoRestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloPontos)
                    .addComponent(textoPontos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloProvisoes)
                    .addComponent(textoProvisoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botaoRemover)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoTituloActionPerformed

    private void checkConsumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkConsumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkConsumeActionPerformed

    private void checkDeployActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDeployActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkDeployActionPerformed

    private void checkHealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkHealActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkHealActionPerformed

    private void textoPontosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoPontosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoPontosActionPerformed

    private void botaoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarActionPerformed
        try {
            /*textoTitulo.setEnabled(false);
            textoDescricao.setEnabled(false);
            textoFaccao.setEnabled(false);
            textoRaridade.setEnabled(false);
            textoHierarquia.setEnabled(false);
            textoArte.setEnabled(false);
            textoRestos.setEnabled(false);
            textoPontos.setEnabled(false);
            textoProvisoes.setEnabled(false);*/
            CartaDAO dao = new CartaDAO();
            CartaProduct c = dao.obter(Integer.parseInt(textoId.getText()));
            textoTitulo.setText(c.getTitulo());
            textoDescricao.setText(c.getDescricao());
            textoFaccao.setText(c.getFaccao());
            textoRaridade.setText(c.getRaridade());
            textoHierarquia.setText(c.getHierarquia());
            textoArte.setText(c.getArte());
            textoRestos.setText(Integer.toString(c.getRestos()));
            textoPontos.setText(Integer.toString(c.getPontos()));
            textoProvisoes.setText(Integer.toString(c.getProvisoes()));
            textoId.setEnabled(false);
            botaoConsultar.setEnabled(false);
            botaoRemover.setEnabled(true);
            //botaoRemover.setEnabled(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Consultar Administrador", JOptionPane.ERROR_MESSAGE);
        }
        botaoConsultar.transferFocus();
    }//GEN-LAST:event_botaoConsultarActionPerformed

    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverActionPerformed
        int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente remover esta Carta?", "Remover Carta", JOptionPane.YES_NO_CANCEL_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            try {
                CartaProduct c = new CartaProduct();
                c.setId(Integer.parseInt(textoId.getText()));
                c.setTitulo(textoTitulo.getText());
                c.setDescricao(textoDescricao.getText());
                c.setFaccao(textoFaccao.getText());
                c.setRaridade(textoRaridade.getText());
                c.setHierarquia(textoHierarquia.getText());
                c.setArte(textoArte.getText());
                c.setRestos(Integer.parseInt(textoRestos.getText()));
                c.setPontos(Integer.parseInt(textoPontos.getText()));
                c.setProvisoes(Integer.parseInt(textoProvisoes.getText()));
                CartaDAO dao = new CartaDAO();
                dao.remover(c);
                textoId.setEnabled(true);
                botaoConsultar.setEnabled(true);
                botaoRemover.setEnabled(false);
                textoId.setText("");
                textoTitulo.setText("");
                textoDescricao.setText("");
                textoFaccao.setText("");
                textoRaridade.setText("");
                textoHierarquia.setText("");
                textoArte.setText("");
                textoRestos.setText("");
                textoPontos.setText("");
                textoProvisoes.setText("");
                JOptionPane.showMessageDialog(this, "Carta removida com sucesso", "Remover Carta", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Remover Carta", JOptionPane.ERROR_MESSAGE);
            }
        }
        botaoRemover.transferFocus();
    }//GEN-LAST:event_botaoRemoverActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRemoveCarta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRemoveCarta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRemoveCarta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRemoveCarta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRemoveCarta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoConsultar;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JCheckBox checkConsume;
    private javax.swing.JCheckBox checkDeploy;
    private javax.swing.JCheckBox checkHeal;
    private javax.swing.JLabel rotuloDescricao;
    private javax.swing.JLabel rotuloFaccao;
    private javax.swing.JLabel rotuloFaccao1;
    private javax.swing.JLabel rotuloHierarquia;
    private javax.swing.JLabel rotuloId;
    private javax.swing.JLabel rotuloPontos;
    private javax.swing.JLabel rotuloProvisoes;
    private javax.swing.JLabel rotuloRaridade;
    private javax.swing.JLabel rotuloRestos;
    private javax.swing.JLabel rotuloSenha3;
    private javax.swing.JLabel rotuloTítulo;
    private javax.swing.JTextField textoArte;
    private javax.swing.JTextField textoDescricao;
    private javax.swing.JTextField textoFaccao;
    private javax.swing.JTextField textoHierarquia;
    private javax.swing.JTextField textoId;
    private javax.swing.JTextField textoPontos;
    private javax.swing.JTextField textoProvisoes;
    private javax.swing.JTextField textoRaridade;
    private javax.swing.JTextField textoRestos;
    private javax.swing.JTextField textoTitulo;
    // End of variables declaration//GEN-END:variables
}
