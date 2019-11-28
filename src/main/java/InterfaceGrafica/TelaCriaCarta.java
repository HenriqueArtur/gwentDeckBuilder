/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;
import DAOs.CartaDAO;
import Game.CartaProduct;
import Game.Efeito;
import Game.EfeitoConsume;
import Game.EfeitoDeploy;
import Game.EfeitoHeal;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author sarah
 */
public class TelaCriaCarta extends javax.swing.JFrame {

    /**
     * Creates new form TelaCriaCarta
     */
    public TelaCriaCarta() {
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

        textoTitulo = new javax.swing.JTextField();
        textoDescricao = new javax.swing.JTextField();
        textoFaccao = new javax.swing.JTextField();
        botaoInserir = new javax.swing.JButton();
        rotuloTítulo = new javax.swing.JLabel();
        rotuloDescricao = new javax.swing.JLabel();
        rotuloFaccao = new javax.swing.JLabel();
        rotuloHierarquia = new javax.swing.JLabel();
        textoHierarquia = new javax.swing.JTextField();
        rotuloRaridade = new javax.swing.JLabel();
        textoRaridade = new javax.swing.JTextField();
        rotuloSenha3 = new javax.swing.JLabel();
        textoArte = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        rotuloRestos = new javax.swing.JLabel();
        textoRestos = new javax.swing.JTextField();
        rotuloPontos = new javax.swing.JLabel();
        textoPontos = new javax.swing.JTextField();
        rotuloProvisoes = new javax.swing.JLabel();
        textoProvisoes = new javax.swing.JTextField();
        checkConsume = new javax.swing.JCheckBox();
        checkDeploy = new javax.swing.JCheckBox();
        checkHeal = new javax.swing.JCheckBox();
        rotuloFaccao1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textoTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoTituloActionPerformed(evt);
            }
        });

        botaoInserir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoInserir.setText("Inserir");
        botaoInserir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirActionPerformed(evt);
            }
        });

        rotuloTítulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rotuloTítulo.setText("Título:");

        rotuloDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rotuloDescricao.setText("Descrição:");

        rotuloFaccao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rotuloFaccao.setText("Facção:");

        rotuloHierarquia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rotuloHierarquia.setText("Hierarquia:");

        rotuloRaridade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rotuloRaridade.setText("Raridade:");

        rotuloSenha3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rotuloSenha3.setText("Arte:");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Humnst777 Lt BT", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crie sua carta");
        jLabel1.setToolTipText("");
        jLabel1.setPreferredSize(new java.awt.Dimension(300, 22));

        rotuloRestos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rotuloRestos.setText("Restos:");

        rotuloPontos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rotuloPontos.setText("Pontos: ");

        textoPontos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoPontosActionPerformed(evt);
            }
        });

        rotuloProvisoes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rotuloProvisoes.setText("Provisões:");

        textoProvisoes.setToolTipText("");

        checkConsume.setText("Consume");
        checkConsume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkConsumeActionPerformed(evt);
            }
        });

        checkDeploy.setText("Deploy");
        checkDeploy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDeployActionPerformed(evt);
            }
        });

        checkHeal.setText("Heal");
        checkHeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkHealActionPerformed(evt);
            }
        });

        rotuloFaccao1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rotuloFaccao1.setText("Efeitos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
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
                    .addComponent(rotuloHierarquia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textoTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                            .addComponent(textoDescricao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoFaccao, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoInserir)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textoHierarquia)
                                .addComponent(textoRaridade)
                                .addComponent(textoArte)
                                .addComponent(textoRestos, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(textoPontos)
                                .addComponent(textoProvisoes, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkConsume)
                        .addGap(18, 18, 18)
                        .addComponent(checkDeploy)
                        .addGap(18, 18, 18)
                        .addComponent(checkHeal)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(textoFaccao))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkConsume)
                    .addComponent(checkDeploy)
                    .addComponent(checkHeal)
                    .addComponent(rotuloFaccao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloRaridade, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
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
                .addGap(31, 31, 31)
                .addComponent(botaoInserir)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoTituloActionPerformed

    private void botaoInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirActionPerformed
        int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente criar essa carta?", "Criar carta", JOptionPane.YES_NO_CANCEL_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            try {
                ArrayList<Efeito> efeitos = new ArrayList<>();
                if (checkConsume.isSelected()){
                    EfeitoConsume e = new EfeitoConsume("");
                    efeitos.add(e);
                }
                if (checkDeploy.isSelected()){
                    EfeitoDeploy e = new EfeitoDeploy("");
                    efeitos.add(e);
                }
                if (checkHeal.isSelected()){
                    EfeitoHeal e = new EfeitoHeal("");
                    efeitos.add(e);
                }
                CartaProduct c = new CartaProduct();
                c.setEfeitos(efeitos);
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
                dao.inserir(c);
                
                textoTitulo.setText("");
                textoDescricao.setText("");
                textoFaccao.setText("");
                textoRaridade.setText("");
                textoHierarquia.setText("");
                textoArte.setText("");
                textoRestos.setText("");
                textoPontos.setText("");
                textoProvisoes.setText("");
                JOptionPane.showMessageDialog(this, "Carta criada com sucesso", "Criar carta", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Criar carta", JOptionPane.ERROR_MESSAGE);
            }
        }
        botaoInserir.transferFocus();
    }//GEN-LAST:event_botaoInserirActionPerformed

    private void textoPontosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoPontosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoPontosActionPerformed

    private void checkConsumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkConsumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkConsumeActionPerformed

    private void checkDeployActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDeployActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkDeployActionPerformed

    private void checkHealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkHealActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkHealActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCriaCarta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCriaCarta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCriaCarta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCriaCarta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCriaCarta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoInserir;
    private javax.swing.JCheckBox checkConsume;
    private javax.swing.JCheckBox checkDeploy;
    private javax.swing.JCheckBox checkHeal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel rotuloDescricao;
    private javax.swing.JLabel rotuloFaccao;
    private javax.swing.JLabel rotuloFaccao1;
    private javax.swing.JLabel rotuloHierarquia;
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
    private javax.swing.JTextField textoPontos;
    private javax.swing.JTextField textoProvisoes;
    private javax.swing.JTextField textoRaridade;
    private javax.swing.JTextField textoRestos;
    private javax.swing.JTextField textoTitulo;
    // End of variables declaration//GEN-END:variables
}
