/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Livro;
import Model.LivroDAO;
import Views.LivroView;
import java.util.List;

/**
 *
 * @author Thiago
 */
public class LivroController {
    private LivroView livroView;
    private LivroDAO livroDAO = new LivroDAO();
    
    public LivroController() {
        livroView = new LivroView();
    }
}
