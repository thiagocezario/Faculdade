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
public class TabelaAutor extends AbstractTableModel {
    private String[] colunas = new String[]{"Nome", "Data de nascimento", "Documento", "Naturalidade", "Livros"};
    private List<Livro> autores = new ArrayList<>();

    @Override
    public int getRowCount() {
        return this.autores.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Livro livro = autores.get(rowIndex);
        
        return livro;
    }
}
