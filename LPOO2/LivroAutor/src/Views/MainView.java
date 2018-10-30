/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controller.AutorController;
import Controller.LivroController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Thiago
 */
public class MainView {

    protected JFrame frame;
    AutorController autorController;
    LivroController livroController;
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
        frame.setVisible(true);
    }

    private void initialize() {
        int leftMargin = 32;
        int topMargin = 50;
        int btnWidth = 180;
        int btnHeight = 40;
        
        
        frame = new JFrame("LivroAutor");
        frame.setResizable(false);
        frame.setBounds(800, 250, 250, 610);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        //=============# BUTTONS #=============
        JButton btnIncluirAutor = new JButton("Incluir Autor");
        btnIncluirAutor.setBounds(leftMargin, topMargin, btnWidth, btnHeight);
        
        topMargin += btnHeight + 35;
        
        JButton btnIncluirLivro = new JButton("Incluir Livro");
        btnIncluirLivro.setBounds(leftMargin, topMargin, btnWidth, btnHeight);
        
        topMargin += btnHeight + 35;
        
        JButton btnListarAutores = new JButton("Listar Autores");
        btnListarAutores.setBounds(leftMargin, topMargin, btnWidth, btnHeight);
        
        topMargin += btnHeight + 35;
        
        JButton btnListarLivrosComAutores = new JButton("Listar livros e seus autores");
        btnListarLivrosComAutores.setBounds(leftMargin, topMargin, btnWidth, btnHeight);
        
        topMargin += btnHeight + 35;
        
        JButton btnListarAutoresDeUmLivro = new JButton("Listar Autores de um Livro");
        btnListarAutoresDeUmLivro.setBounds(leftMargin, topMargin, btnWidth, btnHeight);
        
        topMargin += btnHeight + 35;
        
        JButton btnListarLivrosDeUmAutor = new JButton("Listar Livros de um Autor");
        btnListarLivrosDeUmAutor.setBounds(leftMargin, topMargin, btnWidth, btnHeight);
        
        topMargin += btnHeight + 35;
        
        JButton btnSair = new JButton("Sair");
        btnSair.setBounds(leftMargin, topMargin, btnWidth, btnHeight);
        
        frame.getContentPane().add(btnIncluirAutor);
        frame.getContentPane().add(btnIncluirLivro);
        frame.getContentPane().add(btnListarAutores);
        frame.getContentPane().add(btnListarLivrosComAutores);
        frame.getContentPane().add(btnListarAutoresDeUmLivro);
        frame.getContentPane().add(btnListarLivrosDeUmAutor);
        frame.getContentPane().add(btnSair);
        
        
        
        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        
        btnIncluirAutor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                autorController = new AutorController();
            }
        });
        
        btnListarLivrosComAutores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                livroController = new LivroController();
            }
        });
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
        
//        btnIncluirLivro.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                LivroView viewLivro = new LivroView();
//                viewLivro.frame.setVisible(true);
//                frame.setVisible(false);
//            }
//        });
       
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
    }
}
