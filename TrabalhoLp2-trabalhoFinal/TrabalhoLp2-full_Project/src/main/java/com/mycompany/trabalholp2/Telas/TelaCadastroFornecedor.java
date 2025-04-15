package com.mycompany.trabalholp2.Telas;

import com.mycompany.trabalholp2.Classes.Fornecedor;
import DAO.FornecedorDAO;
import DAO.InterfaceFornDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import menu.MDI;


/**
 *
 * @author Breno de Souza
 */
public class TelaCadastroFornecedor extends JInternalFrame {

    /**
     * Creates new form TelaCadastroFornecedor
     */
    public TelaCadastroFornecedor() {
        super("Tela de cadastro do fornecedor", true, true, true, true);
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

        jRotuloNomeForn = new javax.swing.JLabel();
        jTxtNomeForn = new javax.swing.JTextField();
        jRotuloCnpjForn = new javax.swing.JLabel();
        jTxtCnpjForn = new javax.swing.JTextField();
        jRotuloTelForn = new javax.swing.JLabel();
        jTxtTelForn = new javax.swing.JTextField();
        jRotuloEmailForn = new javax.swing.JLabel();
        jTxtEmailForn = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jBotaoEnviar = new javax.swing.JButton();
        jBotaoSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jRotuloNomeForn.setText("Nome");

        jTxtNomeForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNomeFornActionPerformed(evt);
            }
        });

        jRotuloCnpjForn.setText("CNPJ");

        jTxtCnpjForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCnpjFornActionPerformed(evt);
            }
        });

        jRotuloTelForn.setText("Tel");

        jRotuloEmailForn.setText("Email");

        jLabel6.setText("Tela de cadastro do fornecedor");

        jBotaoEnviar.setText("Enviar");
        jBotaoEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoEnviarActionPerformed(evt);
            }
        });

        jBotaoSair.setText("SAIR");
        jBotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jRotuloEmailForn)
                                .addComponent(jRotuloTelForn)
                                .addComponent(jRotuloCnpjForn)
                                .addComponent(jRotuloNomeForn))
                            .addGap(46, 46, 46)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTxtNomeForn, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addComponent(jTxtTelForn)
                                .addComponent(jTxtEmailForn)
                                .addComponent(jTxtCnpjForn)))
                        .addComponent(jBotaoEnviar, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jBotaoSair)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jBotaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRotuloNomeForn)
                    .addComponent(jTxtNomeForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRotuloCnpjForn)
                    .addComponent(jTxtCnpjForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRotuloTelForn)
                    .addComponent(jTxtTelForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRotuloEmailForn)
                    .addComponent(jTxtEmailForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jBotaoEnviar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtCnpjFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCnpjFornActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCnpjFornActionPerformed

    private void jBotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoSairActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        
        
    }//GEN-LAST:event_jBotaoSairActionPerformed

    private void jTxtNomeFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNomeFornActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNomeFornActionPerformed

    private void jBotaoEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoEnviarActionPerformed
        // TODO add your handling code here:        
      if ((jTxtNomeForn.getText().trim().isEmpty()) || 
        (jTxtCnpjForn.getText().trim().isEmpty()) ||
        (jTxtEmailForn.getText().trim().isEmpty()) ||
        (jTxtTelForn.getText().trim().isEmpty())) {
          
            JOptionPane.showMessageDialog(this, "Os campos não podem estar vazio", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
            
        }
      
        Fornecedor fornecedor = new Fornecedor (jTxtNomeForn.getText(), 
        jTxtCnpjForn.getText()
        , jTxtTelForn.getText(), jTxtEmailForn.getText());
        
        InterfaceFornDAO FornDao = new FornecedorDAO();      
        
        try {
            
            FornDao.cadastrarFornecedor(fornecedor);
            JOptionPane.showMessageDialog(this, "Fornecedor cadastrado com sucesso");
                   
        } 
        
        catch (SQLException ex) {
            
           JOptionPane.showMessageDialog(this, "Falha no cadastro do fornecedor");
        
        }
        finally{
            
            fornecedor = null;    
            
        }
        
        
    }//GEN-LAST:event_jBotaoEnviarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotaoEnviar;
    private javax.swing.JButton jBotaoSair;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jRotuloCnpjForn;
    private javax.swing.JLabel jRotuloEmailForn;
    private javax.swing.JLabel jRotuloNomeForn;
    private javax.swing.JLabel jRotuloTelForn;
    private javax.swing.JTextField jTxtCnpjForn;
    private javax.swing.JTextField jTxtEmailForn;
    private javax.swing.JTextField jTxtNomeForn;
    private javax.swing.JTextField jTxtTelForn;
    // End of variables declaration//GEN-END:variables
}
