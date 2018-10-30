/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import javax.swing.JFrame;

/**
 *
 * @author Thiago
 */
public class AutorView {
    protected JFrame autorFrame;
    
    public AutorView(){
        initialize();
        autorFrame.setVisible(true);
    }

    private void initialize() {
        int leftMargin = 32;
        int topMargin = 50;
        int btnWidth = 180;
        int btnHeight = 40;
        
        
        autorFrame = new JFrame("Autor");
        autorFrame.setResizable(false);
        autorFrame.setBounds(800, 250, 250, 610);
        autorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        autorFrame.getContentPane().setLayout(null);
    }
}
