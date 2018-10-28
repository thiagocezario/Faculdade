
import Model.Livro;
import Model.AutorDAO;
import Model.LivroDAO;
import Model.Autor;
import Views.MainView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MainLivroAutor {

    private AutorDAO autorDAO;
    private LivroDAO livroDAO;

    public MainLivroAutor() throws Exception {
        autorDAO = new AutorDAO();
        livroDAO = new LivroDAO();
    }

    public static void main(String args[]) throws Exception {
        MainLivroAutor main = new MainLivroAutor();
        String opcao;
//
//        try {
//            MainView mainView = new MainView();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        while (true) {
            try {
                System.out.println("Escolha uma das opções e tecle <ENTER>: ");
                System.out.println("  1 - Incluir Autor");
                System.out.println("  2 - Incluir Livro");
                System.out.println("  3 - Listar Autores");
                System.out.println("  4 - Listar Livro com autores");
                System.out.println("  5 - Listar Autores de um livro");
                System.out.println("  6 - Listar Livros de um autor");
                System.out.println("  7 - Sair");
                Scanner sc = new Scanner(System.in, "ISO-8859-1");
                opcao = sc.nextLine();
                switch (opcao) {
                    case "1":
                        main.incluirAutor();
                        break;
                    case "2":
                        main.incluirLivro();
                        break;
                    case "3":
                        main.listarAutores();
                        break;
                    case "4":
                        main.listarLivroComAutores();
                        break;
                    case "5":
                        System.out.println("Qual livro deseja listar?");
                        int id = sc.nextInt();

                        if (id > 0) {
                            main.listarAutoresDeLivro(id);
                        } else {
                            System.out.println("ID invalido");
                        }

                        break;
                    case "6":
                        System.out.println("Qual autor deseja verificar?");
                        int idAutor = sc.nextInt();

                        if (idAutor > 0) {
                            Autor autor = main.autorDAO.consultarAutor(idAutor);
                            if (autor != null) {
                                main.listarLivrosDeAutor(autor);
                            }
                        }

                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
                if (opcao.equals("7")) {
                    break;
                }
            } catch (Exception ex) {
                System.out.println("Falha na operação. Mensagem=" + ex.getMessage());
                //ex.printStackTrace();
            }
        }
    }

    public void incluirAutor() throws Exception {
        System.out.print("Digite o nome do autor:");
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        String nome = sc.nextLine();
        Autor autor = new Autor(nome);
        
        
        
        int numLivros = 1;
        int idLivro = 0;
        List<Livro> listaLivros = new ArrayList<Livro>();
        
        do {
            try {
                Scanner sc2 = new Scanner(System.in, "ISO-8859-1");
                System.out.print("ID Livro " + numLivros + ":");
                idLivro = sc2.nextInt();
                if (idLivro == -1) {
                    break;
                }
                
                Livro livro = livroDAO.consultarLivro(idLivro);
                if (livro != null) {
                    listaLivros.add(livro);
                    numLivros++;
                } else {
                    System.out.println("Livro não existe!");
                }
            } catch (Exception ex) {
                System.out.println("ID do livro não é inteiro ou inválido!");
            }
        } while (true);
        autor.setLivros(listaLivros);
        autor = autorDAO.inserirAutor(autor);
    }

    public void incluirLivro() {
        System.out.print("Digite o título do livro:");
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        String titulo = sc.nextLine();
        int numAutores = 1;
        List<Autor> listaAutores = new ArrayList();
        int idAutor = 0;

        do {
            try {
                Scanner sc2 = new Scanner(System.in, "ISO-8859-1");
                System.out.print("ID Autor " + numAutores + ":");
                idAutor = sc2.nextInt();
                if (idAutor == -1) {
                    break;
                }
                Autor autor = autorDAO.consultarAutor(idAutor);
                if (autor != null) {
                    listaAutores.add(autor);
                    numAutores++;
                } else {
                    System.out.println("Autor não existe!");
                }
            } catch (Exception ex) {
                System.out.println("ID autor não é inteiro ou inválido!");
            }
        } while (true);

        Livro livro = new Livro(titulo, listaAutores);
        livroDAO.inserirLivro(livro);
    }

    public void listarAutores() throws Exception {
        List<Autor> listaAutores = autorDAO.listarAutores();

        Collections.sort(listaAutores, new Comparator<Autor>() {
            public int compare(Autor arg0, Autor arg1) {
                return arg0.getNome().compareToIgnoreCase(arg1.getNome());
            }
        });
        System.out.println("ID\tNOME");
        for (Autor autor : listaAutores) {
            System.out.println(autor.getId() + " \t" + autor.getNome());
        }
    }

    public void listarLivrosDeAutor(Autor autor) {
        List<Livro> livros = autorDAO.listarLivros(autor);

        Collections.sort(livros, new Comparator<Livro>() {
            public int compare(Livro livro1, Livro livro2) {
                return livro1.getTitulo().compareToIgnoreCase(livro2.getTitulo());
            }
        });
        System.out.println("ID\tTitulo do Livro");
        for (Livro livro : livros) {
            System.out.print(livro.getId() + "\t" + livro.getTitulo());
            System.out.print("\n");
        }
    }

    public void listarLivroComAutores() throws Exception {
        List<Livro> listaLivros = livroDAO.listarLivroComAutores();
        Collections.sort(listaLivros, new Comparator<Livro>() {
            public int compare(Livro arg0, Livro arg1) {
                String titulo = arg0.getTitulo();
                int i = titulo.compareToIgnoreCase(arg1.getTitulo());
                return i;
            }
        });
        System.out.println("ID\tTitulo do Livro\tAutores");
        for (Livro livro : listaLivros) {
            System.out.print(livro.getId() + "\t" + livro.getTitulo() + "\t");
            for (Autor autor : livro.getAutores()) {
                System.out.print(autor.getNome() + ";");
            }
            System.out.print("\n");
        }

    }

    public void listarAutoresDeLivro(int idLivro) throws Exception {
        List<Autor> listaDeAutores = livroDAO.listarAutores(idLivro);

        Collections.sort(listaDeAutores, new Comparator<Autor>() {
            public int compare(Autor livro1, Autor livro2) {
                String nome = livro1.getNome();
                int i = nome.compareToIgnoreCase(livro2.getNome());
                return i;
            }
        });

        System.out.println("ID\tNome");

        for (Autor autor : listaDeAutores) {
            System.out.println(autor.getId() + "\t" + autor.getNome());
        }
    }
}
