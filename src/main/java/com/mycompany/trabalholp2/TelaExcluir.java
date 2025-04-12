package com.mycompany.trabalholp2;

import com.mycompany.trabalholp2.Classes.Fornecedor;
import com.mycompany.trabalholp2.Classes.Produto;
import DAO.ProdutoDAO;
import DAO.FornecedorDAO;
import DAO.InterfaceFornDAO;
import DAO.InterfaceProdDAO;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TelaExcluir extends JFrame {

    private JTable tabela;
    private DefaultTableModel modeloTabela;
    private JButton botaoProduto, botaoFornecedor, botaoExcluir;
    private JLabel rotuloStatus;
    private boolean mostrandoProdutos = true;

    public TelaExcluir() {
        setTitle("Excluir Produto ou Fornecedor");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        modeloTabela = new DefaultTableModel();
        tabela = new JTable(modeloTabela);

        botaoProduto = new JButton("Mostrar Produtos");
        botaoFornecedor = new JButton("Mostrar Fornecedores");
        botaoExcluir = new JButton("Excluir Selecionado");
        rotuloStatus = new JLabel(" ");

        JPanel painelTop = new JPanel();
        painelTop.add(botaoProduto);
        painelTop.add(botaoFornecedor);
        painelTop.add(botaoExcluir);

        add(painelTop, BorderLayout.NORTH);
        add(new JScrollPane(tabela), BorderLayout.CENTER);
        add(rotuloStatus, BorderLayout.SOUTH);

        // Ações
        botaoProduto.addActionListener(e -> listarProdutos());
        botaoFornecedor.addActionListener(e -> listarFornecedores());
        botaoExcluir.addActionListener(e -> excluirSelecionado());

        listarProdutos(); // Carrega produtos por padrão
        setVisible(true);
    }

    private void listarProdutos() {
        try {
            InterfaceProdDAO dao = new ProdutoDAO();
            List<Produto> produtos = dao.exibirDadosProduto();

            modeloTabela.setRowCount(0);
            modeloTabela.setColumnCount(0);
            modeloTabela.addColumn("ID");
            modeloTabela.addColumn("Nome");
            modeloTabela.addColumn("Categoria");
            modeloTabela.addColumn("Quantidade");

            for (Produto p : produtos) {
                modeloTabela.addRow(new Object[]{
                    p.getId(),
                    p.getNome_prod(),
                    p.getCategoria(),
                    p.getQtde()
                });
            }

            mostrandoProdutos = true;
            rotuloStatus.setText("Mostrando produtos.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao listar produtos: " + ex.getMessage());
        }
    }

    private void listarFornecedores() {
        try {
            InterfaceFornDAO dao = new FornecedorDAO();
            List<Fornecedor> fornecedores = dao.exibirDadosFornecedor();

            modeloTabela.setRowCount(0);
            modeloTabela.setColumnCount(0);
            modeloTabela.addColumn("ID");
            modeloTabela.addColumn("Nome");

            for (Fornecedor f : fornecedores) {
                modeloTabela.addRow(new Object[]{
                    f.getId(),
                    f.getNome()
                });
            }

            mostrandoProdutos = false;
            rotuloStatus.setText("Mostrando fornecedores.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao listar fornecedores: " + ex.getMessage());
        }
    }

    private void excluirSelecionado() {
        int linha = tabela.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para excluir.");
            return;
        }

        Integer id = (int) modeloTabela.getValueAt(linha, 0);
        int confirm = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir o item selecionado?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) return;

        try {
            if (mostrandoProdutos) {
                InterfaceProdDAO dao = new ProdutoDAO();
                Produto produto = new Produto();
                produto.setId(id);
                dao.excluirProduto(produto);
                listarProdutos();
                rotuloStatus.setText("Produto excluído com sucesso.");
            } else {
                FornecedorDAO dao = new FornecedorDAO();
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setId(id);
                dao.excluir(fornecedor);
                listarFornecedores();
                rotuloStatus.setText("Fornecedor excluído com sucesso.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao excluir: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new TelaExcluir();
    }
}
