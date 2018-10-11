/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Factories.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thiago
 */
public class ContatoDAO {

    public static void insere(Contato contato) {
        Connection con = null;
        PreparedStatement st = null;

        try {
            con = ConnectionFactory.getConnection();
            st = con.prepareStatement("insert into tb_contato (idContato, nome, telefone, endereco) values (?, ?, ?, ?)");
            st.setInt(1, contato.getId());
            st.setString(2, contato.getNome());
            st.setString(3, contato.getTelefone());
            st.setString(4, contato.getEndereco());

            st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            if (st != null) {
                try {
                    st.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }

    public static void altera(Contato contato) {
        Connection con = null;
        PreparedStatement st = null;

        try {
            con = ConnectionFactory.getConnection();
            if (buscarContato(contato)) {
                st = con.prepareStatement("update tb_contato set nome = ? , telefone = ?, endereco = ? where idContato = ?");
                st.setString(1, contato.getNome());
                st.setString(2, contato.getTelefone());
                st.setString(3, contato.getEndereco());
                st.setInt(4, contato.getId());
                
                st.executeUpdate();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void remove(Contato contato) {
        Connection con = null;
        PreparedStatement st = null;

        try {
            con = ConnectionFactory.getConnection();
            if (buscarContato(contato)) {
                st = con.prepareStatement("delete from tb_contato where idContato = ?");
                st.setInt(1, contato.getId());
                
                st.executeUpdate();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static List<Contato> lista() {
        List<Contato> contatos = new ArrayList<Contato>();
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        try{
            con = ConnectionFactory.getConnection();
            st = con.prepareStatement("select nome, endereco, telefone, idContato from tb_contato");
            rs = st.executeQuery();
            while(rs.next()) {
                Contato u = new Contato();
                u.setNome(rs.getString("nome"));
                u.setEndereco(rs.getString("endereco"));
                u.setTelefone(rs.getString("telefone"));
                u.setId(rs.getInt("idContato"));
                contatos.add(u);
            }
            return contatos;
        }
        catch(Exception e){
        }
        finally{
            if(con != null){
                try{
                    con.close();
                }catch(Exception e){
                    
                }
            }
            if(st != null){
                try{
                    st.close();
                }catch(Exception e){
                }
            }
            if(rs != null){
                try{
                    rs.close();
                }catch(Exception e){
                }
            }
        }
        return null;
    }

    public static boolean buscarContato(Contato contato) {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            con = ConnectionFactory.getConnection();
            st = con.prepareStatement("select nome, telefone, endereco from tb_contato where idContato = ?");
            st.setInt(1, contato.getId());

            rs = st.executeQuery();
            rs.last();

            return rs.getRow() > 0;
        } catch (Exception e) {
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (Exception e) {

                }
            }
            if (st != null) {
                try {
                    st.close();
                } catch (Exception e) {
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                }
            }
        }

        return false;
    }
}
