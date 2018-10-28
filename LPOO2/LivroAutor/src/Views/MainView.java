/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Thiago
 */
public class MainView {

    protected JFrame frame;
//	
//	public static void main(String[] args) {
//		Main.main(args);
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ViewHomePage window = new ViewHomePage();
//					window.frame.setVisible(true);
//					window.frame.setSize(725, 500);
//					window.frame.setLocation(300,125);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

    public MainView() {
        initialize();
//        frame.setVisible(true);
    }

    private void initialize() {
        frame = new JFrame();
        frame.setResizable(false);
        frame.setBounds(300, 125, 725, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        //=============# BUTTONS #=============
        JButton btnIncluirAutor = new JButton("Incluir Autor");
        btnIncluirAutor.setBounds(48, 249, 180, 78);
        btnIncluirAutor.setForeground(new Color(255, 255, 255));
        btnIncluirAutor.setBackground(new Color(220, 20, 60));

//        btnIncluirAutor.addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//                AutorView autorView = new AutorView();
//                autorView.frame.setVisible(true);
//                frame.setVisible(false);
//            }
//
//        });
        frame.getContentPane().add(btnIncluirAutor);

        JButton btnIncluirLivro = new JButton("Incluir Livro");
        btnIncluirLivro.setBounds(268, 249, 160, 78);
        btnIncluirLivro.setForeground(new Color(255, 255, 255));
        btnIncluirLivro.setBackground(new Color(220, 20, 60));
//        btnIncluirLivro.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                LivroView viewLivro = new LivroView();
//                viewLivro.frame.setVisible(true);
//                frame.setVisible(false);
//            }
//        });
        frame.getContentPane().add(btnIncluirLivro);

       
//        //=============# LABELS #=============
//        JLabel lblEscolhaUmaDas = new JLabel("Escolha uma das opções :");
//        lblEscolhaUmaDas.setFont(new Font("Lato Semibold", Font.BOLD, 20));
//        lblEscolhaUmaDas.setBounds(226, 176, 287, 29);
//        lblEscolhaUmaDas.addMouseListener(new MouseAdapter() {
//            public void mouseClicked(MouseEvent e) {
//                ViewGerenciarContas vgc = new ViewGerenciarContas();
//                vgc.frame.setVisible(true);
//                frame.setVisible(false);
//
//            }
//
//        });
//
//        frame.getContentPane().add(lblEscolhaUmaDas);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(220, 20, 60));
        panel.setBounds(0, 0, 719, 112);
        frame.getContentPane().add(panel);
    }
}
