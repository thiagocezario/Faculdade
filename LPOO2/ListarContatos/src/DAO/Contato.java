/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Thiago
 */
public class Contato {
    private String nome;
    private String telefone;
    private String endereco;
    private int id;

    public Contato(String nome, String telefone, String endereco, int id) {
        this.setNome(nome);
        this.setTelefone(telefone);
        this.setEndereco(endereco);
        this.setId(id);
    }
    
    public Contato() {
        this.setNome("");
        this.setEndereco("");
        this.setTelefone("");
        this.setId(-1);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
