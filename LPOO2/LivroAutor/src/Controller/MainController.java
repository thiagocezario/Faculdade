/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.LivroDAO;
import Model.AutorDAO;
import Views.MainView;

/**
 *
 * @author Thiago
 */
public class MainController {
    private AutorDAO autorDAO;
    private LivroDAO livroDAO;
    private MainView mainView;
    
    
    public MainController() {
        initialize();
    }
    
    private void initialize() {
        mainView = new MainView();
    }
}
