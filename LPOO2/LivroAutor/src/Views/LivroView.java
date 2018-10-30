/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controller.LivroController;
import Model.Livro;
import Model.LivroDAO;
import Model.TabelaLivro;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author Thiago
 */
public class LivroView {

    protected JFrame livroFrame;
    private JTable table;
    private LivroDAO livroDAO = new LivroDAO();
    
    public LivroView() {
        initialize();
        livroFrame.setVisible(true);
    }

    private void initialize() {
        int leftMargin = 32;
        int topMargin = 50;
        int btnWidth = 180;
        int btnHeight = 40;
        
        livroFrame = new JFrame("Livro");
        livroFrame.setResizable(false);
        livroFrame.setBounds(800, 250, 1250, 610);
        livroFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        livroFrame.getContentPane().setLayout(null);
        
        table = new JTable();
        table.setBounds(12, 12, 1000, 400);
        livroFrame.getContentPane().add(table);
        table.setModel(new TabelaLivro());
        
        List<Livro> livros = livroDAO.listarLivros();
        
        ((TabelaLivro) table.getModel()).atualizarTabela(livros);
        
        for(Livro livro : livros) {
            System.out.println(livro.getId() + " " + livro.getTitulo());
        }
    }
}
