/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Thiago
 */
public class TabelaLivro extends AbstractTableModel {
    private String[] colunas = new String[]{"Titulo", "ISBN", "Data de Publicacao", "Autores"};
    private List<Livro> livros = new ArrayList<>();

    @Override
    public int getRowCount() {
        return this.livros.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Livro livro = livros.get(rowIndex);
        
        return livro;
    }
    
    public void atualizarTabela(List<Livro> livros) {
        this.livros.addAll(livros);
        this.fireTableDataChanged();
    }
}
