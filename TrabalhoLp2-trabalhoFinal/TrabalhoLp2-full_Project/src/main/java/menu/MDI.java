/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package menu;

import com.mycompany.trabalholp2.Telas.TelaCadastroFornecedor;
import com.mycompany.trabalholp2.Telas.TelaCadastroProduto;
import com.mycompany.trabalholp2.Telas.TelaDeExcluirFornecedor;
import com.mycompany.trabalholp2.Telas.TelaDeExcluirProduto;
import com.mycompany.trabalholp2.Telas.TelaEditarFornecedor;
import com.mycompany.trabalholp2.Telas.TelaExibirFornecedores;
import com.mycompany.trabalholp2.Telas.TelaExibirProdutos;
import com.mycompany.trabalholp2.Telas.telaEditarProduto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 * Esta classe representa a janela principal do Sistema de Gestão.
 * A interface gráfica é construída usando o Swing e oferece ao usuário várias opções
 * para cadastrar, excluir, editar e exibir informações sobre produtos e fornecedores.
 * As operações são realizadas por meio de um menu, e cada item do menu abre uma janela 
 * correspondente para manipulação dos dados.
 * 
 * @author Manoel
 */
public class MDI extends javax.swing.JFrame {

     /**
     * Construtor da classe MDI.
     * Inicializa a interface gráfica e configura os componentes do menu.
     */
    public MDI() {
        initComponents();
    }

    /**
     * Inicializa os componentes da interface gráfica.
     * Este método é gerado automaticamente pelo Form Editor e não deve ser modificado manualmente.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        jMenuCadastroFornecedor = new javax.swing.JMenu();
        jMenuCadastroProduto = new javax.swing.JMenuItem();
        openMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        jMenuExclusao = new javax.swing.JMenu();
        jMenuExcluirProduto = new javax.swing.JMenuItem();
        jMenuExcluirFornecedor = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        jMenuExibirProdutos = new javax.swing.JMenuItem();
        jMenuExibirFornecedores = new javax.swing.JMenuItem();
        jMenuEdicao = new javax.swing.JMenu();
        jMenuEditarProduto = new javax.swing.JMenuItem();
        jMenuEditarFornecedor = new javax.swing.JMenuItem();

        desktopPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        desktopPane.setMaximumSize(null);
        desktopPane.setMinimumSize(null);
        desktopPane.setPreferredSize(null);

        jLabel1.setFont(new java.awt.Font("Bodoni Bk BT", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Selecione uma opção no menu acima para começar.");
        desktopPane.add(jLabel1);
        jLabel1.setBounds(20, 130, 370, 30);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bem-vindo ao Sistema de Gestão!");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        desktopPane.add(jLabel2);
        jLabel2.setBounds(60, 70, 280, 30);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuCadastroFornecedor.setMnemonic('f');
        jMenuCadastroFornecedor.setText("➕ Cadastro  |");

        jMenuCadastroProduto.setMnemonic('s');
        jMenuCadastroProduto.setText("Produto");
        jMenuCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroProdutoActionPerformed(evt);
            }
        });
        jMenuCadastroFornecedor.add(jMenuCadastroProduto);

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Fornecedor");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        jMenuCadastroFornecedor.add(openMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        jMenuCadastroFornecedor.add(exitMenuItem);

        menuBar.add(jMenuCadastroFornecedor);

        jMenuExclusao.setMnemonic('e');
        jMenuExclusao.setText("🗑️ Exclusão |");

        jMenuExcluirProduto.setMnemonic('t');
        jMenuExcluirProduto.setText("Exclusão de Produto");
        jMenuExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExcluirProdutoActionPerformed(evt);
            }
        });
        jMenuExclusao.add(jMenuExcluirProduto);

        jMenuExcluirFornecedor.setMnemonic('y');
        jMenuExcluirFornecedor.setText("Exclusão de Fornecedor");
        jMenuExcluirFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExcluirFornecedorActionPerformed(evt);
            }
        });
        jMenuExclusao.add(jMenuExcluirFornecedor);

        menuBar.add(jMenuExclusao);

        helpMenu.setMnemonic('h');
        helpMenu.setText("👁️ Exibição |");

        jMenuExibirProdutos.setMnemonic('c');
        jMenuExibirProdutos.setText("Exibir Produto");
        jMenuExibirProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExibirProdutosActionPerformed(evt);
            }
        });
        helpMenu.add(jMenuExibirProdutos);

        jMenuExibirFornecedores.setMnemonic('a');
        jMenuExibirFornecedores.setText("Exibir Fornecedor");
        jMenuExibirFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExibirFornecedoresActionPerformed(evt);
            }
        });
        helpMenu.add(jMenuExibirFornecedores);

        menuBar.add(helpMenu);

        jMenuEdicao.setText("✏️ Edição");

        jMenuEditarProduto.setText("Editar Produto");
        jMenuEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEditarProdutoActionPerformed(evt);
            }
        });
        jMenuEdicao.add(jMenuEditarProduto);

        jMenuEditarFornecedor.setText("Editar Fornecedor");
        jMenuEditarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEditarFornecedorActionPerformed(evt);
            }
        });
        jMenuEdicao.add(jMenuEditarFornecedor);

        menuBar.add(jMenuEdicao);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Método chamado ao selecionar a opção "Exit" no menu.
     * Encerra a aplicação.
     * 
     * @param evt Evento de ação gerado ao clicar em "Exit".
     */
    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed
        /**
     * Método chamado ao selecionar a opção "Fornecedor" no menu de cadastro.
     * Abre a tela para cadastro de fornecedores.
     * 
     * @param evt Evento de ação gerado ao clicar em "Fornecedor".
     */
    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
       
       TelaCadastroFornecedor tela = new TelaCadastroFornecedor();       
       desktopPane.add(tela);
       tela.setVisible(true);
       try
        {
            // Seta foco
            tela.setSelected(true);
        }
        catch (java.beans.PropertyVetoException e)        
        {
             JOptionPane.showMessageDialog(this, "Erro ao carregar a tela: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_openMenuItemActionPerformed
     /**
     * Método chamado ao selecionar a opção "Exclusão de Produto" no menu de exclusão.
     * Abre a tela para exclusão de produtos.
     * 
     * @param evt Evento de ação gerado ao clicar em "Exclusão de Produto".
     */
    private void jMenuExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuExcluirProdutoActionPerformed
        // TODO add your handling code here:
       TelaDeExcluirProduto tela = new TelaDeExcluirProduto();
       desktopPane.add(tela);
       tela.setVisible(true);
       try
        {
            // Seta foco
            tela.setSelected(true);
        }
        catch (java.beans.PropertyVetoException e)        
        {
             
        }
        
    }//GEN-LAST:event_jMenuExcluirProdutoActionPerformed
    /**
     * Método chamado ao selecionar a opção "Produto" no menu de cadastro.
     * Abre a tela para cadastro de produtos.
     * 
     * @param evt Evento de ação gerado ao clicar em "Produto".
     */
    private void jMenuCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroProdutoActionPerformed
        // TODO add your handling code here:
        TelaCadastroProduto tela = new TelaCadastroProduto();
        desktopPane.add(tela);
        tela.setVisible(true);
        try
         {
             // Seta foco
             tela.setSelected(true);
         }
         catch (java.beans.PropertyVetoException e)        
         {

         }
        
    }//GEN-LAST:event_jMenuCadastroProdutoActionPerformed
    /**
     * Método chamado ao selecionar a opção "Exclusão de Fornecedor" no menu de exclusão.
     * Abre a tela para exclusão de fornecedores.
     * 
     * @param evt Evento de ação gerado ao clicar em "Exclusão de Fornecedor".
     */
    private void jMenuExcluirFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuExcluirFornecedorActionPerformed
        // TODO add your handling code here:
       TelaDeExcluirFornecedor tela = new TelaDeExcluirFornecedor();
       desktopPane.add(tela);
       tela.setVisible(true);
        try
            {
            // Seta foco
            tela.setSelected(true);
        }
        catch (java.beans.PropertyVetoException e)        
        {
             
        }
    }//GEN-LAST:event_jMenuExcluirFornecedorActionPerformed
    /**
     * Método chamado ao selecionar a opção "Exibir Produto" no menu de exibição.
     * Abre a tela para exibir informações sobre os produtos.
     * 
     * @param evt Evento de ação gerado ao clicar em "Exibir Produto".
     */
    private void jMenuExibirProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuExibirProdutosActionPerformed
        // TODO add your handling code here:
       TelaExibirProdutos tela = new TelaExibirProdutos();
       desktopPane.add(tela);
       tela.setVisible(true);
        try
        {
             // Seta foco
             tela.setSelected(true);
        }
        catch (java.beans.PropertyVetoException e)        
        {

        }
        
    }//GEN-LAST:event_jMenuExibirProdutosActionPerformed
    /**
     * Método chamado ao selecionar a opção "Exibir Fornecedor" no menu de exibição.
     * Abre a tela para exibir informações sobre os fornecedores.
     * 
     * @param evt Evento de ação gerado ao clicar em "Exibir Fornecedor".
     */
    private void jMenuExibirFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuExibirFornecedoresActionPerformed
        // TODO add your handling code here:
       TelaExibirFornecedores tela = new TelaExibirFornecedores();
       desktopPane.add(tela);
       tela.setVisible(true);
        try
        {
             // Seta foco
             tela.setSelected(true);
        }
        catch (java.beans.PropertyVetoException e)        
        {

        }
    }//GEN-LAST:event_jMenuExibirFornecedoresActionPerformed
    /**
     * Método chamado ao selecionar a opção "Editar Produto" no menu de edição.
     * Abre a tela para editar informações sobre produtos.
     * 
     * @param evt Evento de ação gerado ao clicar em "Editar Produto".
     */ 
    private void jMenuEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEditarProdutoActionPerformed
        // TODO add your handling code here:
       telaEditarProduto tela = new telaEditarProduto();
       desktopPane.add(tela);
       tela.setVisible(true);
        try
        {
             // Seta foco
             tela.setSelected(true);
        }
        catch (java.beans.PropertyVetoException e)        
        {

        }
    }//GEN-LAST:event_jMenuEditarProdutoActionPerformed
    /**
     * Método chamado ao selecionar a opção "Editar Fornecedor" no menu de edição.
     * Abre a tela para editar informações sobre fornecedores.
     * 
     * @param evt Evento de ação gerado ao clicar em "Editar Fornecedor".
     */
    private void jMenuEditarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEditarFornecedorActionPerformed
        // TODO add your handling code here:
       TelaEditarFornecedor tela = new TelaEditarFornecedor();      
       desktopPane.add(tela);
       tela.setVisible(true);
        try
        {
             // Seta foco
             tela.setSelected(true);
        }
        catch (java.beans.PropertyVetoException e)        
        {

        }
        
    }//GEN-LAST:event_jMenuEditarFornecedorActionPerformed
    
    /**
     * Método principal que inicializa a aplicação.
     * Configura o visual da aplicação e exibe a janela principal.
     * 
     * @param args Argumentos passados pela linha de comando (não utilizados).
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
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenuCadastroFornecedor;
    private javax.swing.JMenuItem jMenuCadastroProduto;
    private javax.swing.JMenu jMenuEdicao;
    private javax.swing.JMenuItem jMenuEditarFornecedor;
    private javax.swing.JMenuItem jMenuEditarProduto;
    private javax.swing.JMenuItem jMenuExcluirFornecedor;
    private javax.swing.JMenuItem jMenuExcluirProduto;
    private javax.swing.JMenu jMenuExclusao;
    private javax.swing.JMenuItem jMenuExibirFornecedores;
    private javax.swing.JMenuItem jMenuExibirProdutos;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    // End of variables declaration//GEN-END:variables

}
